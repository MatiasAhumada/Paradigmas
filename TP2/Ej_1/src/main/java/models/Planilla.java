package models;

import java.time.LocalDate;

public class Planilla {

    private final String fecha;
    private final String profesor;

    public Planilla(String fecha, String profesor) {
        this.fecha = fecha;
        this.profesor = profesor;
    }

    public String getFecha() {
        return fecha;
    }

    public String getProfesor() {
        return profesor;
    }

    public String toString() {
        return "Profesor = " + profesor + ", Fecha = " + fecha;
    }

}
