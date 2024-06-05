package EJERCICIO_1.models;



import java.util.ArrayList;

public class Planillas{
    private ArrayList<Planilla> planillas = new ArrayList<>();

    public ArrayList<Planilla> getPlanilla() {
        return planillas;
    }

    public void setPlanilla(ArrayList<Planilla> planillas) {
        this.planillas = planillas;
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
