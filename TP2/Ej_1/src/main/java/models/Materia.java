package models;

public class Materia {
    private final String name;

    public Materia(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return "\nMateria: " + name;
    }
    
}
