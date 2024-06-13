package EJERCICIO_1.models;

public class Materia {
    private String name;

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
