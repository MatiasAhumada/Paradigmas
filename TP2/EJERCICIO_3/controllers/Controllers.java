package EJERCICIO_3.controllers;



import java.time.LocalDate;

import EJERCICIO_3.models.Ejemplar;
import EJERCICIO_3.models.Ejemplares;
import EJERCICIO_3.models.Fecha;
import EJERCICIO_3.models.Prestamo;
import EJERCICIO_3.models.Prestamos;
import EJERCICIO_3.models.Usuario;
import EJERCICIO_3.models.Usuarios;

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
        if (mensaje == "No es socio") {
            crearUsuario(57900, "Lucas Campos", "Profesor", "al dia");
            System.out.println("Socio Creado");
        } else {
            System.out.println(mensaje);
        }
    }

    public static String buscarlibro(String title){
        String libro=ejemplares.buscarEjemplar(title);
        return libro;
    }
    
    public static String buscarUsuario(int legajo){
        String usuario=usuarios.buscarUsuario(legajo);
        return usuario;
    }

    public static void crearPrestamo(int id, String ejemplar, String usuario,String devolucion){
        LocalDate fecha=Fecha.obtenerFechaActual();
        Prestamo prestamo = new Prestamo(id,fecha, ejemplar, usuario,devolucion);
        prestamos.agregarPrestamo(prestamo);
    }
    
    public static void mostrarPrestamo(){
        prestamos.mostrarPrestamos();
    }

    public static void mostrarUsuarios() {
        usuarios.mostrarUsuarios();
    }

    public static void biblioteca() {
        crearUsuario(57903, "Matias Ahumada", "Estudiante", "deudor");
        crearLibro(101, "calculo de una variable", "ISI", "Matematica");
        crearLibro(102, "Fisica I", "ISI", "Fisica");
        validarUS(57903);
        crearPrestamo(100,  buscarlibro("calculo de una variable"),buscarUsuario(57903),"2024-06-10");
        
        mostrarPrestamo();
                
    }
}
