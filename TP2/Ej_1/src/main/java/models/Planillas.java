package models;

import java.util.ArrayList;

public class Planillas {
    private ArrayList<Planilla> planillas = new ArrayList<>();
    public Materia getMateria() {
        return materia;
    }

    private Materia materia;

    public ArrayList<Planilla> getPlanilla() {
        return planillas;
    }

    public void setPlanilla(ArrayList<Planilla> planillas,Materia materia) {
        this.planillas = planillas;
        this.materia=materia;
    }

    public void agregarPlanilla(Planilla planilla) {
        planillas.add(planilla);
    }

    public void mostrarPlanillas() {
        System.out.println("\nDatos Planilla\n");
        for (int i = 0; i < planillas.size(); i++) {
            System.out.println(planillas.get(i));
        }

    }
}
