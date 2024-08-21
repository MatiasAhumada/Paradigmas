/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.*;
import Vistas.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class Controller {

    private static final Fabricantes fabs = new Fabricantes();
    private static final Productos prods = new Productos();
    private static final Pedidos peds = new Pedidos();
    private static int c = 0;

    public static void inicio() {
        new VistaPrincipal().setVisible(true);
    }

    public static void CargarComboFab(VistaPrincipal vp) {
        for (int i = 0; i < fabs.getFabricantes().size(); i++) {
            vp.getComboFab().addItem(Integer.toString(fabs.getFabricantes().get(i).getCodigo()));
        }

    }

    public static void CrearFabs() {
        Fabricante fab1 = new Fabricante(1, "Arcor");
        fabs.agg(fab1);
        Fabricante fab2 = new Fabricante(2, "Marolio");
        fabs.agg(fab2);
    }

    public static void CrearProds(VistaPrincipal vp) {
        try {
            Producto prod = new Producto();
            prod.setID(Integer.parseInt(vp.getTextID().getText()));
            prod.setFab(Integer.parseInt(vp.getComboFab().getSelectedItem().toString()));
            prod.setCant(Integer.parseInt(vp.getTextCant().getText()));
            prod.setDesc(vp.getTextDesc().getText());
            prod.setPrecio(Integer.parseInt(vp.getTextPrecio().getText()));
            prods.agg(prod);
            CrearPed(vp, prod);
            JOptionPane.showMessageDialog(vp, "Producto cargado", "CARGADO", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(vp, "Error de sistema", "ERROR", JOptionPane.ERROR_MESSAGE);

        }

    }

    public static void CrearPed(VistaPrincipal vp, Producto prod) {
        Pedido ped = new Pedido();
        double precio = (prod.getCant() * prod.getPrecio());
        ped.setIDPed(c);c++;
        ped.setIDProd(prod.getID());
        ped.setIDFab(prod.getFab());
        ped.setCantProd(prod.getCant());
        ped.setPrecio(precio);
        peds.agg(ped);
    }

    public static void pedidos(VistaPrincipal vp) {
        try {
            if (peds.getPedidos().size() == 0) {
                JOptionPane.showMessageDialog(vp, "No existen pedidos", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                VistaPedidos vped = new VistaPedidos(vp, true);
                FormatoPedidos(vped);
                vped.setVisible(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vp, "Error de sistema", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }

    public static void FormatoPedidos(VistaPedidos vista) {
        vista.getModelo().setColumnCount(0);
        vista.getModelo().setNumRows(0);

        vista.getModelo().addColumn("ID Pedido");
        vista.getModelo().addColumn("ID Producto");
        vista.getModelo().addColumn("ID Fabricante");
        vista.getModelo().addColumn("Descripcion");
        vista.getModelo().addColumn("Cantidad");
        vista.getModelo().addColumn("Precio Unitario");
        vista.getModelo().addColumn("Precio Total");

        for (Pedido ped : peds.getPedidos()) {
            Object[] fila = new Object[7];
            fila[0] = ped.getIDPed();
            fila[1] = ped.getIDProd();
            fila[2] = ped.getIDFab();
            fila[3] = prods.BProdID(ped.getIDProd()).getDesc();
            fila[4] = ped.getCantProd();
            fila[5] = prods.BProdID(ped.getIDProd()).getPrecio();
            fila[6] = ped.getPrecio();
            vista.getModelo().addRow(fila);
        }

        vista.getTabla().setModel(vista.getModelo());

        vista.getTabla().setRowHeight(30);

    }

    public static void productos(VistaPrincipal vp) {
        try {
            if (prods.getProductos().size() == 0) {
                JOptionPane.showMessageDialog(vp, "No existen productos cargados", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                VistaProductos vprod = new VistaProductos(vp, true);
                FormatoProductos(vprod);
                vprod.setVisible(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de sistema", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void FormatoProductos(VistaProductos vista) {
        vista.getModelo().setColumnCount(0);
        vista.getModelo().setNumRows(0);
        vista.getModelo().addColumn("ID");
        vista.getModelo().addColumn("Descripcion");
        vista.getModelo().addColumn("Stock");
        vista.getModelo().addColumn("Precio Unitario");
        vista.getModelo().addColumn("Fabricante");

        for (Producto prod : prods.getProductos()) {
            Object[] fila = new Object[5];
            fila[0] = prod.getID();
            fila[1] = prod.getDesc();
            fila[2] = prod.getCant();
            fila[3] = prod.getPrecio();
            System.out.println(fabs.buscar(prod.getFab()).getDesc());
            fila[4] = fabs.buscar(prod.getFab()).getDesc();
            vista.getModelo().addRow(fila);
        }

        vista.getTabla().setModel(vista.getModelo());

    }
}
