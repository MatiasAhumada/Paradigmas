package models;

import java.util.ArrayList;

public class Ejemplares {

    private ArrayList<Ejemplar> ejemplares = new ArrayList<Ejemplar>();

    public ArrayList<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(ArrayList<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void agregarejemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    public void mostrarEjemplares() {
        for (Ejemplar ejemplar : ejemplares) {
            System.out.println(ejemplar + "\n");
        }
    }
    public Ejemplar buscarEjemplar(String Title) {
        for (int i = 0; i < ejemplares.size(); i++) {
            if (ejemplares.get(i).getTitle().equals(Title) || ejemplares.get(i).getTematica().equals(Title)) {
                return ejemplares.get(i);
            }
        }
        return null;
    }
    
    
    

}
