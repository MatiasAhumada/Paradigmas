package controllers;

import VistaPrincipal.VistaPrincipal;
import java.awt.Graphics;


public class Controllers {
    public static void Inicial() {
        new VistaPrincipal().setVisible(true);
    }

    public static void linea(Graphics g, int x, int y, int x1, int y1) {
        g.drawLine(x, y, x1, y1);
    }

    public static void circulo(Graphics g, int x, int y, int x1, int y1) {
        g.drawOval(x, y, x1, y1);
    }

    public static void cuadrado(Graphics g, int x, int y, int x1, int y1) {
        g.drawRect(x, y, x1, y1);
    }

    public static void triangulo(Graphics g) {
        // , int[] x, int[] y, int x1, int y1
        int[] x = {100, 190, 280};
        int[] y = {200, 50, 200};
        g.drawPolygon(x, y, 3);
    }

    public static void controladorCombobox(VistaPrincipal vista) {
        String nombre = vista.getCombo().getSelectedItem().toString();
        switch (nombre) {
            case "Cuadrado" -> {
                cuadrado(vista.getPanel().getGraphics(), 50, 50, 200, 200);
                vista.getLabel1().setText(nombre);
            }
            case "Linea" -> {
                linea(vista.getPanel().getGraphics(), 200, 50, 400, 200);
                 vista.getLabel1().setText(nombre);
            }
            case "Circulo" -> {
                circulo(vista.getPanel().getGraphics(), 150, 50, 200, 200);
                 vista.getLabel1().setText(nombre);
            }
            case "Triangulo" -> {
                triangulo(vista.getPanel().getGraphics());
                 vista.getLabel1().setText(nombre);
            }
            default -> {
            }
        }
    }

   

}
