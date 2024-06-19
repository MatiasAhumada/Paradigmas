/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;
import Vistas.VerLista;
import Vistas.VistaPersona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author bonaparte
 */
public class Controlador {
    
    private static ArrayList<Persona> personas = new ArrayList<>();
    
    public static void inicio(){
        new VistaPersona().setVisible(true);
    }
    
    public static void fin(VistaPersona vista){
        vista.dispose();
        System.exit(0);
    }
    
    public static void agregar(VistaPersona vista){
        Persona persona = new Persona();
        try{
            persona.setNombre(vista.getNombre().getText());
            persona.setEdad(Integer.valueOf(vista.getEdad().getText()));
            personas.add(persona);
            JOptionPane.showMessageDialog(vista, "Datos en lista", "Mensaje", JOptionPane.CLOSED_OPTION);
            vista.getNombre().setText("");
            vista.getEdad().setText("");
        } catch (Exception ex) {
               JOptionPane.showMessageDialog(vista, "Datos mal ingresados", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void mostrar(){
        VerLista dialog = new VerLista(new javax.swing.JFrame(), true);
        formatoTabla(dialog);
        dialog.setVisible(true);
    }
    
    public static void formatoTabla(VerLista vista){
        //reconfigura el modelo que se aplica en la JTabla
        vista.getModelo().setColumnCount(0);
        vista.getModelo().setNumRows(0);
        vista.getModelo().addColumn("Nombre");
        vista.getModelo().addColumn("Edad");
        // alimenta al modelo filas con los datos de las personas
        for (Persona persona : personas){
            Object[] fila = new Object[2];
            fila[0] = persona.getNombre();
            fila[1] = persona.getEdad();
            vista.getModelo().addRow(fila);
        }
        vista.getTabla().setModel(vista.getModelo());
        // 40 pixel de ancho a la columna 0
        vista.getTabla().getColumnModel().getColumn(0).setPreferredWidth(40);
        vista.getTabla().getColumnModel().getColumn(1).setPreferredWidth(10);

    }
    
    public static void salirVerLista(VerLista vista){
        vista.dispose();
    }
}
