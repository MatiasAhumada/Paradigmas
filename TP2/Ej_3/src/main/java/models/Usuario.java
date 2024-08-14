package models;

public class Usuario {

    private int legajo;
    private String name;
    private String tipo; // ALUMNO, PROFESOR Y BIBLIOTECARIO
    private String estado;

    public Usuario() {

    }

    public Usuario(int legajo, String name, String tipo, String situacion) {
        this.legajo = legajo;
        this.name = name;
        this.tipo = tipo;
        this.estado = situacion;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(String situacion) {
        this.estado = situacion;
    }

    public String getEstado() {
        return estado;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getName() {
        return name;
    }

    public String getTipo() {
        return tipo;
    }

    ;

    @Override
    public String toString() {
        return "Legajo: " + legajo + " Nombre: " + name + " Tipo: " + tipo + " Condicion: " + estado;

    }
}
