package EJERCICIO_2.controllers;

import EJERCICIO_2.models.Figura;
import EJERCICIO_2.models.Figuras;

public class Controllers {
    private static Figuras figuras = new Figuras();

    public static void crearFigura() {
        Figura cuadrado = new Figura(10, "cuadrado");
        figuras.agregarFigura(cuadrado);
        Figura triangulo = new Figura(10,"triangulo");
        figuras.agregarFigura(triangulo);
        //Figura figura3 = new Figura("circulos", 0, 0, 100);
        //figuras.agregarFigura(figura3);
    }

    public static void mostrarFiguras() {
        figuras.mostrarFigura();
    }

    public static void plano() {
        Controllers.crearFigura();
        Controllers.mostrarFiguras();
    }
    

}