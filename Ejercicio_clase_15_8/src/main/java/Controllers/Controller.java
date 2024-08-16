/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Vistas.*;
import Models.*;

/**
 *
 * @author Matias
 */
public class Controller {

    private static final Clientes clientes = new Clientes();
    private static final Cuentas cuentas = new Cuentas();

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
        Cuenta cuenta1 = new Cuenta(57903, "Coriente", 1000, 57903);
        cuentas.agregarCuenta(cuenta1);
        Cuenta cuenta2 = new Cuenta(57873, "C. Ahorro", 2000, 57873);
        cuentas.agregarCuenta(cuenta2);
        Cuenta cuenta3 = new Cuenta(57869, "Coriente", 3000, 57869);
        cuentas.agregarCuenta(cuenta3);
        Cuenta cuenta4 = new Cuenta(58114, "C. Ahorro", 4000, 58114);
        cuentas.agregarCuenta(cuenta4);
    }

    public static void mostrarCliente(VistaPrincipal vp){
        VistaCliente vc = new VistaCliente(vp,true);
        formatoTablaC(vc);
        vc.setVisible(true);
    }
    /*public static void formatoTablaC(VistaCliente vista) {
        vista.getModelo().setColumnCount(0);
        vista.getModelo().setNumRows(0);
        vista.getModelo().addColumn("ID Cuenta");
        vista.getModelo().addColumn("Tipo");
        vista.getModelo().addColumn("Saldo");

        for (Ejemplar ejemplar : ejemplares.getEjemplares()) {
            Object[] fila = new Object[4];
            fila[0] = ejemplar.getId();
            fila[1] = ejemplar.getTitle();
            fila[2] = ejemplar.getCarrera();
            fila[3] = ejemplar.getTematica();
            vista.getModelo().addRow(fila);
        }

        vista.getTabla().setModel(vista.getModelo());
    }
*/
}
