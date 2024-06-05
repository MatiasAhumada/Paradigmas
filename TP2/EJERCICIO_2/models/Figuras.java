package EJERCICIO_2.models;

import java.util.ArrayList;

public class Figuras {
    private ArrayList<Figura> figuras = new ArrayList<Figura>();

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void mostrarFigura() {
        for (Figura figura : figuras) {
            figura.fig();
        }
    }
}
