package controllers;

import java.time.LocalDate;

import models.Ejemplar;
import models.Ejemplares;
import models.Fecha;
import models.Prestamo;
import models.Prestamos;
import models.Usuario;
import models.Usuarios;

public class Controllers {

    private static Ejemplares ejemplares = new Ejemplares();
    private static Usuarios usuarios = new Usuarios();
    private static Prestamos prestamos = new Prestamos();

    public static void crearLibro(int id, String title, String carrera, String tematica) {
        Ejemplar ejemplar = new Ejemplar(id, title, carrera, tematica);
        ejemplares.agregarejemplar(ejemplar);
    }

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
    }
}
    