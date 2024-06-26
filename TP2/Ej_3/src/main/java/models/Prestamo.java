package models;

import java.time.LocalDate;

public class Prestamo {
    private static final Ejemplar ejemplar = new Ejemplar();
    private LocalDate fecha;
    private final int id;
    private final String ejemplarPrestamo;
    private final String socio;
    private final String devolucion;

    public String getDevolucion() {
        return devolucion;
    }
    public Prestamo(int id,LocalDate fecha , String ejemplarPrestamo, String socio,String devolucion) {
        this.id = id;
        this.fecha=fecha;
        this.ejemplarPrestamo = ejemplarPrestamo;
        this.socio = socio;
        this.devolucion=devolucion;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public int getId() {
        return id;
    }

    public static Ejemplar getEjemplar() {
        return ejemplar;
    }

    public String getSocio() {
        return socio;
    }

    public String getEjemplarPrestamo() {
        return ejemplarPrestamo;
    }

    @Override
    public String toString() {
        return "\n\tPlanilla de prestamo\n\nID Prestamo: " + id +"\tFecha: "+fecha+ "\n\n" + ejemplarPrestamo + "\n\n" + socio+"\n\nDia Devolucion: "+devolucion;
    }
}
