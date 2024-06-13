package models;



public class Alumno {
    private final int legajo;
    private final String name;

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

    @Override
    public String toString() {

        return"\t"+ name +"\t"+ legajo+"\n" ;
    }
}
