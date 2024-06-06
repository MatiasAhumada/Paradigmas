package EJERCICIO_3.models;

public class Ejemplar {
    private int id ;
    private String title;
    private String carrera;
    private String tematica;

    public Ejemplar() {

    }

    public Ejemplar(int id,String title, String carrera, String tematica) {
        this.id = id;
        this.title = title;
        this.carrera = carrera;
        this.tematica = tematica;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getTematica() {
        return tematica;
    }

    @Override
    public String toString() {
        return "ID Ejemplar: " + id + "\nTitulo: " + title + "\nCarrera: " + carrera + "\nTematica: " + tematica;
    }
}
