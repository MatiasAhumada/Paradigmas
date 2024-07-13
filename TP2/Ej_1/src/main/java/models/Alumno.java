package models;

public class Alumno {

   private int legajo;
    private String name;

    public Alumno(int legajo, String name) {
        this.legajo = legajo;
        this.name = name;
    }
    
    public Alumno() {

    }
    
    public int getLegajo() {
        return legajo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return "\t" + name + "\t" + legajo + "\n";
    }
}
