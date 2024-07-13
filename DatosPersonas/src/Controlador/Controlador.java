/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;
import Vista.TablaPersonas;
import Vista.VistaPersona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author bonaparte
 */
public class Controlador {

    private static ArrayList<Persona> personas = new ArrayList<>();

    public static void inicio() {
        new VistaPersona().setVisible(true);
    }

    public static void salir(VistaPersona vista) {
        vista.dispose();
    }

    public static void salirVerLista(TablaPersonas vista) {
        vista.dispose();
    }

    public static void agregar(VistaPersona vista) {
        Persona persona = new Persona();
        try {
            persona.setNombre(vista.getNombre().getText());
            persona.setEdad(Integer.parseInt(vista.getEdad().getText()));
            if (persona.getEdad() >= 0 && persona.getEdad() <= 110) {
                personas.add(persona);
                JOptionPane.showMessageDialog(null, "Datos en lista", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                vista.getNombre().setText("");
                vista.getEdad().setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Edad mal ingresada\nIngrese nuevamente la edad", "ERROR", JOptionPane.ERROR_MESSAGE);
                vista.getNombre().setText("");
                vista.getEdad().setText("");

            }

        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(ventana donde se mostrara(null para mostar en medio), "MEnsaje principal", "Titulo de ventana", JOptionPane.ERROR_MESSAGE(icono de error));
            JOptionPane.showMessageDialog(null, "Datos mal ingresados", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void mostrar() {
        if (personas.size() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese una persona para poder mostar esta tabla", "ERROR", JOptionPane.ERROR_MESSAGE);

        } else {
            TablaPersonas tablaPersonas = new TablaPersonas(new javax.swing.JFrame(), true);
            FormatoTabla(tablaPersonas);
            tablaPersonas.setVisible(true);
        }

    }

    public static void FormatoTabla(TablaPersonas vista) {
        vista.getModelo().setColumnCount(0);
        vista.getModelo().setNumRows(0);
        vista.getModelo().addColumn("Nombre");
        vista.getModelo().addColumn("Edad");
        for (Persona persona : personas) {
            Object[] fila = new Object[2];
            fila[0] = persona.getNombre();
            fila[1] = persona.getEdad();
            vista.getModelo().addRow(fila);
        }
        vista.getTable().setModel(vista.getModelo());
        vista.getTable().getColumnModel().getColumn(0).setPreferredWidth(40);
        vista.getTable().getColumnModel().getColumn(1).setPreferredWidth(10);

    }

}
