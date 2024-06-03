package EJERCICIO_2.controllers;

import EJERCICIO_2.models.Figura;
import EJERCICIO_2.models.Figuras;

public class Controllers {
    private static Figuras figuras = new Figuras();

    public static void crearFigura() {
        Figura figura = new Figura("cuadrado", 10, 20, 0);
        figuras.agregarFigura(figura);
        Figura figura2 = new Figura("triangulo", 10, 20, 0);
        figuras.agregarFigura(figura2);
        Figura figura3 = new Figura("circulo", 0, 0, 100);
        figuras.agregarFigura(figura3);
    }

    public static void mostrarFiguras() {
        figuras.mostrarFigura();
    }

    public static void plano() {
        Controllers.crearFigura();
        Controllers.mostrarFiguras();
    }
    

}