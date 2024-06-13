package models;

import java.util.ArrayList;

public class Materias {
    private ArrayList<Materia> materias = new ArrayList<>();

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }
    public void mostrarMaterias(){
    for (Materia materia : materias) {
        System.out.println(materia);
    }
    }
}
