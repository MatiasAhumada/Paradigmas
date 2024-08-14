package controllers;

import Vistas.*;

import models.*;

public class Controllers {

    private static final Ejemplares ejemplares = new Ejemplares();

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

    public static void crearLibro(VEjemplares vista) {
        Ejemplar ejemplar = new Ejemplar();
        ejemplar.setId(Integer.parseInt(vista.getTextId().getText()));
        ejemplar.setCarrera(vista.getTextCarrera().getText());
        ejemplar.setTematica(vista.getTextTematica().getText());
        ejemplar.setTitle(vista.getTextTitulo().getText());
        ejemplares.agregarejemplar(ejemplar);
        ejemplares.mostrarEjemplares();
    }

    public static void mostrar(VEjemplares ve) {
        VMostrarEjemplares ej = new VMostrarEjemplares(ve, true);
        formatoTabla(ej);
        ej.setVisible(true);
    }

    public static void formatoTabla(VMostrarEjemplares vista) {
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

    /* 
    public static void crearUsuario(int legajo, String name, String tipo, String situacion) {
        Usuario usuario = new Usuario(legajo, name, tipo, situacion);
        usuarios.crearUsuario(usuario);
    }

    public static void validarUS(int usuario) {
        String mensaje = usuarios.validarUsuario(usuario);
        if (mensaje.equals("No es socio")) {
            crearUsuario(57900, "Lucas Campos", "Profesor", "al dia");
            System.out.println("Socio Creado");
        } else {
            System.out.println(mensaje);
        }
    }

    public static String buscarlibro(String title) {
        String libro = ejemplares.buscarEjemplar(title);
        return libro;
    }

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
