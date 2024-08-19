/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Vistas.*;
import Models.*;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias
 */
public class Controller {

    private static final Clientes clientes = new Clientes();
    private static final Cuentas cuentas = new Cuentas();
    private static final Movimientos movs = new Movimientos();

    public static void inicio() {
        new VistaPrincipal().setVisible(true);
    }

    public static void agregarCliente() {
        Cliente cliente1 = new Cliente(57903, "Matias");
        clientes.agregarCuenta(cliente1);
        Cliente cliente2 = new Cliente(57873, "Lucas");
        clientes.agregarCuenta(cliente2);
        Cliente cliente3 = new Cliente(57869, "Barale");
        clientes.agregarCuenta(cliente3);
        Cliente cliente4 = new Cliente(58114, "Goane");
        clientes.agregarCuenta(cliente4);
    }

    public static void aggCuentaCliente() {
        Cuenta cuenta1 = new Cuenta(57903, "Corriente", 1000, 57903);
        cuentas.agregarCuenta(cuenta1);
        Cuenta cuenta2 = new Cuenta(57873, "C. Ahorro", 2000, 57873);
        cuentas.agregarCuenta(cuenta2);
        Cuenta cuenta3 = new Cuenta(57869, "Corriente", 3000, 57869);
        cuentas.agregarCuenta(cuenta3);
        Cuenta cuenta4 = new Cuenta(58114, "C. Ahorro", 4000, 58114);
        cuentas.agregarCuenta(cuenta4);
        Cuenta cuenta5 = new Cuenta(57903, "C. Ahorro", 2000, 57900);
        cuentas.agregarCuenta(cuenta5);
    }

    public static void mostrarCliente(VistaPrincipal vp) {
        try {
            if (cuentas.getCuentas().size() >= 1) {
                if (clientes.buscarCID(Integer.parseInt(vp.getTextIdCliente().getText())) == 0) {
                    JOptionPane.showMessageDialog(null, "Cliente Inexistente", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {

                    VistaCliente vc = new VistaCliente(vp, true);
                    int ID = Integer.parseInt(vp.getTextIdCliente().getText());
                    formatoVistaC(vc, ID);
                    vc.setVisible(true);
                }
                System.out.println(" hay clientes");
            } else {
                System.out.println("no hay clientes");
                agregarCliente();
                aggCuentaCliente();
                if (clientes.buscarCID(Integer.parseInt(vp.getTextIdCliente().getText())) == 0) {
                    JOptionPane.showMessageDialog(null, "Cliente Inexistente", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    VistaCliente vc = new VistaCliente(vp, true);
                    int ID = Integer.parseInt(vp.getTextIdCliente().getText());
                    formatoVistaC(vc, ID);
                    vc.setVisible(true);
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cliente Inexistente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void formatoVistaC(VistaCliente vista, int ID) {
        vista.getModelo().setColumnCount(0);
        vista.getModelo().setNumRows(0);
        vista.getModelo().addColumn("ID Cuenta");
        vista.getModelo().addColumn("Tipo");
        vista.getModelo().addColumn("Saldo");

        for (Cuenta cuenta : cuentas.getCuentas()) {
                int suma = 0;
                int saldo = suma + cuenta.getSaldo();
            if (cuenta.getIdCliente() == ID) {
                
                vista.getLabelID().setText(Integer.toString(cuenta.getIdCliente()));
                vista.getLabelApeNom().setText(clientes.buscarCliente(ID));
                vista.getCombo().addItem(Integer.toString(cuenta.getIDCuenta()));
                vista.getLabelSaldo().setText(Integer.toString(saldo));
                Object[] fila = new Object[3];
                fila[0] = cuenta.getIDCuenta();
                fila[1] = cuenta.getTipo();
                fila[2] = cuenta.getSaldo();
                vista.getModelo().addRow(fila);
            }
        }

        vista.getTabla().setModel(vista.getModelo());
    }

    public static void generarOP(VistaCliente vc) {
        Fecha fe=new Fecha();
        System.out.println(fe.toString());
        String fec = fe.toString();
        if (vc.getComboOp().getSelectedItem() == "Acreditar") {

            int saldo = cuentas.acreditar(Integer.parseInt(vc.getCombo().getSelectedItem().toString()), Integer.parseInt(vc.getTextMonto().getText()));
            Movimiento mov1 = new Movimiento();
            mov1.setFecha(fec);
            mov1.setIDCliente(Integer.parseInt(vc.getLabelID().getText()));
            mov1.setIDCuenta(Integer.parseInt(vc.getCombo().getSelectedItem().toString()));
            mov1.setTipoMov(vc.getComboOp().getSelectedItem().toString());
            mov1.setCantMov(Integer.parseInt(vc.getTextMonto().getText()));
            mov1.setSaldo(saldo);
            movs.agregarMov(mov1);
            JOptionPane.showMessageDialog(vc, "Saldo Acreditado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        } else {

            //System.out.println(cuentas.buscarCuenta(Integer.parseInt(vc.getCombo().getSelectedItem().toString())).getTipo());
            if (cuentas.buscarCuenta(Integer.parseInt(vc.getCombo().getSelectedItem().toString())).getTipo() == "Corriente") {
                int saldo = cuentas.debitar(Integer.parseInt(vc.getCombo().getSelectedItem().toString()), Integer.parseInt(vc.getTextMonto().getText()));
                Movimiento mov1 = new Movimiento();
                mov1.setFecha(fec);
                mov1.setIDCliente(Integer.parseInt(vc.getLabelID().getText()));
                mov1.setIDCuenta(Integer.parseInt(vc.getCombo().getSelectedItem().toString()));
                mov1.setTipoMov(vc.getComboOp().getSelectedItem().toString());
                mov1.setCantMov(Integer.parseInt(vc.getTextMonto().getText()));
                mov1.setSaldo(saldo);
                movs.agregarMov(mov1);
                JOptionPane.showMessageDialog(vc, "Saldo Debitado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Saldo Insuficiente para debito", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public static void movimientos(VistaCliente vc) {
        try {
            if (movs.getMovimientos().size() >= 1) {
                VistaMovs vm = new VistaMovs(vc, true);
                int IDCuenta = Integer.parseInt(vc.getCombo().getSelectedItem().toString());
                formatoMovs(vm, IDCuenta);
                vm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existen movimientos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de servidor", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void formatoMovs(VistaMovs vista, int IDCuenta) {
        vista.getModelo().setColumnCount(0);
        vista.getModelo().setNumRows(0);
        vista.getModelo().addColumn("Fecha");
        vista.getModelo().addColumn("ID Cliente");
        vista.getModelo().addColumn("ID Cuenta");
        vista.getModelo().addColumn("Movimiento");
        vista.getModelo().addColumn("Cantidad");
        vista.getModelo().addColumn("Saldo Actual");

        for (Movimiento mov : movs.getMovimientos()) {
            if (mov.getIDCuenta() == IDCuenta) {
                Object[] fila = new Object[6];
                fila[0] = mov.getFecha();
                fila[1] = mov.getIDCliente();
                fila[2] = mov.getIDCuenta();
                fila[3] = mov.getTipoMov();
                fila[4] = mov.getCantMov();
                fila[5] = mov.getSaldo();
                vista.getModelo().addRow(fila);
            }
        }

        vista.getTabla().setModel(vista.getModelo());
    }

}
