package EJERCICIO_1.models;



public class Alumno {
    private int legajo;
    private String name;

    public Alumno(int legajo, String name) {

        this.legajo = legajo;
        this.name = name;

    }

    public int getLegajo() {
        return legajo;
    }

    public String getName() {
        return name;
    }

    public String toString() {

        return"\t"+ name +"\t"+ legajo+"\n" ;
    }
}
