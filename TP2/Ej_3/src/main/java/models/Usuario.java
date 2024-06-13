package models;

public class Usuario {
    private int legajo;
    private String name;
    private String tipo; // ALUMNO, PROFESOR Y BIBLIOTECARIO
    private String situacion;

    public Usuario() {

    }

    public Usuario(int legajo, String name, String tipo, String situacion) {
        this.legajo = legajo;
        this.name = name;
        this.tipo = tipo;
        this.situacion = situacion;
    }

    public String getSituacion() {
        return situacion;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getName() {
        return name;
    }

    public String getTipo() {
        return tipo;
    };

    @Override
    public String toString() {
        return "Legajo: " + legajo + " Nombre: " + name + " Tipo: " + tipo +" Condicion: "+situacion;

    }
}
