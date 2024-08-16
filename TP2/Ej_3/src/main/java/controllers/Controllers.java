package controllers;

import Vistas.*;
import javax.swing.JOptionPane;

import models.*;

public class Controllers {

    private static final Ejemplares ejemplares = new Ejemplares();
    private static final Usuarios usuarios = new Usuarios();

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

    
    public static String buscarlibro(String PClave) {
        String libro = ejemplares.buscarEjemplar(PClave);
        return libro;
    }
/*
    public static String buscarUsuario(int legajo) {
        String usuario = usuarios.buscarUsuario(legajo);
        return usuario;
    }

    public static void crearPrestamo(int id, String ejemplar, String usuario, String devolucion) {
        LocalDate fecha = Fecha.obtenerFechaActual();
        Prestamo prestamo = new Prestamo(id, fecha, ejemplar, usuario, devolucion);
        prestamos.agregarPrestamo(prestamo);
    }

    public static void mostrarPrestamo() {
        prestamos.mostrarPrestamos();
    }

    public static void mostrarUsuarios() {
        usuarios.mostrarUsuarios();
    }

   
    public static void biblioteca() {
        crearUsuario(57903, "Matias Ahumada", "Estudiante", "deudor");
        crearLibro(101, "calculo de una variable", "ISI", "Matematica");
        crearLibro(102, "Fisica I", "ISI", "Fisica");
        crearPrestamo(100, buscarlibro("calculo de una variable"), buscarUsuario(57903), "2024-06-10");
        mostrarPrestamo();
        validarUS(57903);
    }*/
}
