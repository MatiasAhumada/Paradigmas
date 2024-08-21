/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Vistas.*;
import Models.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias Ahumada Legajo 57903 Comision 2K05
 */
public class Controller {

    private static final Grupos grupos = new Grupos();
    private static final Mascotas mascotas = new Mascotas();

    public static void inicio() {
        new VistaPrincipal().setVisible(true);

    }

    public static void CrearGrupos() {
        Grupo grupo1 = new Grupo(1, "Mamiferos");
        grupos.agg(grupo1);
        Grupo grupo2 = new Grupo(2, "Aves");
        grupos.agg(grupo2);
        Grupo grupo3 = new Grupo(3, "Peces");
        grupos.agg(grupo3);
        Grupo grupo4 = new Grupo(4, "Anfibios");
        grupos.agg(grupo4);
        Grupo grupo5 = new Grupo(5, "Reptiles");
        grupos.agg(grupo5);

    }

    public static void CargarCombo(VistaPrincipal vp) {
        for (int i = 0; i < grupos.getGrupos().size(); i++) {
            vp.getComboGrupo().addItem(grupos.getGrupos().get(i).getDescripcion());
        }

    }

    public static void CrearMascota(VistaPrincipal vp) {
        try {

            if (vp.getTextID().getText() == null || vp.getTextNombre().getText() == null || vp.getTextSintomas().getText() == null || vp.getComboGrupo().getSelectedItem().toString().equals("Opciones")) {
                JOptionPane.showMessageDialog(vp, "Debe Cargar todos los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                Mascota mascota = new Mascota();
                mascota.setCodigoGrupo(grupos.buscarGrupo(vp.getComboGrupo().getSelectedItem().toString()).getCodigoGrupo());
                mascota.setDescripcion(vp.getComboGrupo().getSelectedItem().toString());
                mascota.setCodMascota(Integer.parseInt(vp.getTextID().getText()));
                mascota.setNombre(vp.getTextNombre().getText());
                mascota.setSintomas(vp.getTextSintomas().getText());
                mascotas.agg(mascota);
                vp.getTextID().setText("");
                vp.getTextNombre().setText("");
                vp.getTextSintomas().setText("");
                JOptionPane.showMessageDialog(vp, "Mascota Ingresada", "CARGADO", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(vp, "Error de sistema", "ERROR", JOptionPane.ERROR_MESSAGE);

        }

    }

    public static void Mascotas(VistaPrincipal vp) {
        try {
            if (mascotas.getMascotas().size() == 0) {
                JOptionPane.showMessageDialog(vp, "No existen Mascotas cargadas", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                VistaIngresos ingresos = new VistaIngresos(vp, true);
                FormatoProductos(ingresos);
                ingresos.setVisible(true);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de sistema", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void FormatoProductos(VistaIngresos vista) {
        vista.getModelo().setColumnCount(0);
        vista.getModelo().setNumRows(0);
        vista.getModelo().addColumn("ID Grupo");
        vista.getModelo().addColumn("Descripcion");
        vista.getModelo().addColumn("ID Mascota");
        vista.getModelo().addColumn("Nombre Mascota");
        vista.getModelo().addColumn("Sintomas");

        for (Mascota mascota : mascotas.getMascotas()) {
            Object[] fila = new Object[5];
            fila[0] = mascota.getCodigoGrupo();
            fila[1] = mascota.getDescripcion();
            fila[2] = mascota.getCodMascota();
            fila[3] = mascota.getNombre();
            fila[4] = mascota.getSintomas();
            vista.getModelo().addRow(fila);
        }

        vista.getTabla().setModel(vista.getModelo());

    }

}
