/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Matias
 */
import Model.Pedido;
import Vista.ListaPed;
import Vista.VistaPrincipal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller {

    private static final ArrayList<Pedido> pedidos = new ArrayList<>();

    public static void inicio() {
        new VistaPrincipal().setVisible(true);
    }

    public static void fin(VistaPrincipal vista) {
        vista.dispose();
        System.exit(0);
    }

    public static void Fecha(VistaPrincipal vista) {
        Pedido pedido = new Pedido();
        LocalDateTime hoy = LocalDateTime.now();
        pedido.setFecha(hoy.getDayOfMonth() + "/" + hoy.getMonthValue() + "/" + hoy.getYear());
        vista.getFecha().setText(pedido.getFecha());
    }

    public static void CrearPedido(VistaPrincipal vista) {
        try {
            Pedido pedido = new Pedido();
            pedido.setNombre(vista.getTextNombre().getText());
            pedido.setApellido(vista.getTextApellido().getText());
            pedido.setCantidad(Integer.parseInt(vista.getTextCantidad().getText()));
            pedido.setFecha(vista.getFecha().getText());
            pedido.setTipo(vista.getComboTipo().getSelectedItem().toString());
            pedido.setEstado("En Preparacion");
            pedidos.add(pedido);

            JOptionPane.showMessageDialog(vista, "Datos en lista", "Mensaje", JOptionPane.CLOSED_OPTION);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Datos mal ingresados", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void PreCreacion(VistaPrincipal vista) {
        if (vista.getTextNombre().getText() == "" || vista.getTextCantidad().getText() == "" || vista.getComboTipo().getSelectedItem().toString() == "Opciones") {
            JOptionPane.showMessageDialog(vista, "Datos incompletos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        } else {
            vista.getLabelCliente().setText(vista.getTextNombre().getText() + " " + vista.getTextApellido().getText());
            vista.getLabelCantidad().setText(vista.getTextCantidad().getText());
            vista.getLabelEnvio().setText("1500");
            vista.getLabelCU().setText("500");
            vista.getLabelDocena().setText("5000");
            vista.getLabelCFecha().setText(vista.getFecha().getText());
            vista.getLabelTipo().setText(vista.getComboTipo().getSelectedItem().toString());
            if (Integer.parseInt(vista.getTextCantidad().getText()) == 12) {
                int CalculoTotal = 1500 + (500 * Integer.parseInt(vista.getTextCantidad().getText()));
                vista.getLabelTotal().setText(Integer.toString(CalculoTotal));
            } else {
                int CalculoTotal = 1500 + (500 * Integer.parseInt(vista.getTextCantidad().getText()));
                vista.getLabelTotal().setText(Integer.toString(CalculoTotal));
            }

        }

    }

    public static void mostrar(VistaPrincipal vp) {
        ListaPed pedidoss = new ListaPed(vp, true);
        formatoTabla(pedidoss);
        pedidoss.setVisible(true);
    }

    public static void formatoTabla(ListaPed vista) {
        vista.getModelo().setColumnCount(0);
        vista.getModelo().setNumRows(0);
        vista.getModelo().addColumn("Fecha");
        vista.getModelo().addColumn("Nombre");
        vista.getModelo().addColumn("Apellido");
        vista.getModelo().addColumn("Cantidad");
        vista.getModelo().addColumn("Tipo");
        vista.getModelo().addColumn("Estado");

        for (Pedido pedido : pedidos) {
            Object[] fila = new Object[6];
            fila[0] = pedido.getFecha();
            fila[1] = pedido.getNombre();
            fila[2] = pedido.getApellido();
            fila[3] = pedido.getCantidad();
            fila[4] = pedido.getTipo();
            fila[5] = pedido.getEstado();
            vista.getModelo().addRow(fila);
        }

        vista.getTabla().setModel(vista.getModelo());
    }

    public static void salirVista(ListaPed vista) {
        vista.dispose();
    }
}
