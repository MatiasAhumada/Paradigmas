package models;

import java.time.LocalDate;

public class Planilla {
    private LocalDate fecha;
    private String profesor;

    public Planilla(LocalDate fecha, String profesor) {
        this.fecha = fecha;
        this.profesor = profesor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getProfesor() {
        return profesor;
    }

    public String toString() {
        return "{" + "Profesor = " + profesor + ", Fecha = " + fecha + "}";
    }

}
