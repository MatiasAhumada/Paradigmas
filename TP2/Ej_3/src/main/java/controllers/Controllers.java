package controllers;

import Vistas.*;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

import models.*;

public class Controllers {

    private static final Ejemplares ejemplares = new Ejemplares();
    private static final Usuarios usuarios = new Usuarios();
    private static final Prestamos prestamos = new Prestamos();

    public static void inicio() {
        new VistaPrincipal().setVisible(true);
    }

    public static void salir(VistaPrincipal vista) {
        vista.dispose();
    }

    public static void VistaEj(VistaPrincipal vp) {
        VEjemplares vistaEj = new VEjemplares(vp, true);
        vistaEj.setVisible(true);
    }

    public static void VistaUs(VistaPrincipal vp) {
        VUsuarios vistaUs = new VUsuarios(vp, true);
        vistaUs.setVisible(true);
    }

    public static void VPres(VistaPrincipal vista) {
        VPrestamo prestamo = new VPrestamo(vista, true);
        Fecha fecha = new Fecha();
        prestamo.getLabelFecha().setText(fecha.toString());
        prestamo.setVisible(true);

    }

    public static void crearLibro(VEjemplares vista) {
        try {
            Ejemplar ejemplar = new Ejemplar();
            ejemplar.setId(Integer.parseInt(vista.getTextId().getText()));
            ejemplar.setCarrera(vista.getTextCarrera().getText());
            ejemplar.setTematica(vista.getTextTematica().getText());
            ejemplar.setTitle(vista.getTextTitulo().getText());
            ejemplares.agregarejemplar(ejemplar);

            JOptionPane.showMessageDialog(vista, "Ejemplar Cargado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Datos mal ingresados", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void mostrarEjemplares(VEjemplares ve) {
        VMostrarEjemplares ej = new VMostrarEjemplares(ve, true);
        formatoTablaEjemplares(ej);
        ej.setVisible(true);
    }

    public static void formatoTablaEjemplares(VMostrarEjemplares vista) {
        vista.getModelo().setColumnCount(0);
        vista.getModelo().setNumRows(0);
        vista.getModelo().addColumn("ID");
        vista.getModelo().addColumn("Titulo");
        vista.getModelo().addColumn("Carrera");
        vista.getModelo().addColumn("Tematica");

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

    public static void crearUsuario(VUsuarios vu) {
        try {
            Usuario usuario = new Usuario();
            usuario.setLegajo(Integer.parseInt(vu.getTextLegajo().getText()));
            usuario.setName(vu.getTextNombre().getText());
            usuario.setTipo(vu.getComboTipo().getSelectedItem().toString());
            usuario.setEstado(vu.getLabelSituacion().getText());

            usuarios.crearUsuario(usuario);

            JOptionPane.showMessageDialog(vu, "Usuario Cargado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vu, "Datos mal ingresados", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void mostrarUsuarios(VUsuarios vu) {
        VMostrarUsuarios us = new VMostrarUsuarios(vu, true);
        formatoTablaUsuarios(us);
        us.setVisible(true);
    }

    public static void formatoTablaUsuarios(VMostrarUsuarios vista) {
        vista.getModelo().setColumnCount(0);
        vista.getModelo().setNumRows(0);
        vista.getModelo().addColumn("Legajo");
        vista.getModelo().addColumn("Nombre");
        vista.getModelo().addColumn("Tipo");
        vista.getModelo().addColumn("Estado");

        for (Usuario usuario : usuarios.getUsuarios()) {
            Object[] fila = new Object[4];
            fila[0] = usuario.getLegajo();
            fila[1] = usuario.getName();
            fila[2] = usuario.getTipo();
            fila[3] = usuario.getEstado();
            vista.getModelo().addRow(fila);
        }

        vista.getTabla().setModel(vista.getModelo());
    }

    public static void crearPrestamo(VPrestamo vp) {
        Prestamo pres = new Prestamo();
        Fecha fec = new Fecha();
        try {
            pres.setId(Integer.parseInt(vp.getTextIDP().getText()));
            pres.setIDUsuario(Integer.parseInt(vp.getTextIDus().getText()));
            pres.setFecha(fec.toString());
            pres.setEjemplarPrestamo(ejemplares.buscarEjemplar(vp.getTextEjemplar().getText()).getTitle());
            pres.setDevolucion(Integer.parseInt(vp.getTextDevolucion().getText()));
            prestamos.agregarPrestamo(pres);
        } catch (Exception ex) {
            System.out.println("Error de sistema");
        }
    }

    public static void mostrarPrestamos(VPrestamo vp) {
        VMostrarPrestamos ps = new VMostrarPrestamos(vp, true);
        formatoTablaPrestamos(ps);
        ps.setVisible(true);
    }

    public static void formatoTablaPrestamos(VMostrarPrestamos vista) {
        vista.getModelo().setColumnCount(0);
        vista.getModelo().setNumRows(0);
        vista.getModelo().addColumn("Fecha");
        vista.getModelo().addColumn("ID Prestamo");
        vista.getModelo().addColumn("ID Usuario");
        vista.getModelo().addColumn("Ejemplar");
        vista.getModelo().addColumn("Devolucion");

        for (Prestamo prestamo : prestamos.getPrestamos()) {
            Object[] fila = new Object[5];
            fila[0] = prestamo.getFecha();
            fila[1] = prestamo.getId();
            fila[2] = prestamo.getIDUsuario();
            fila[3] = prestamo.getEjemplarPrestamo();
            fila[4] = prestamo.getDevolucion();
            vista.getModelo().addRow(fila);
        }

        vista.getTabla().setModel(vista.getModelo());
    }

}
