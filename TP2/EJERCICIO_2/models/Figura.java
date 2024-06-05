package EJERCICIO_2.models;

public class Figura {
    private String tipo;
    private int lado;

    public String getTipo() {
        return tipo;
    }

    public int getLado() {
        return lado;
    }

    public Figura(int lado, String tipo) {
        this.lado = lado;
        this.tipo = tipo;
    }

    public void cuadrado() {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }

    /*
     * public void der() {
     * for (int i = 0; i <= lado; i++) {
     * for (int k = 0; k < lado - i; k++) {
     * System.out.print(" ");
     * }
     * 
     * for (int j = 0; j < i; j++) {
     * 
     * System.out.print("*");
     * }
     * System.out.println("");
     * }
     * }
     * public void izq() {
     * for (int i = 0; i <= lado; i++) {
     * 
     * for (int j = 0; j < i; j++) {
     * 
     * System.out.print("* ");
     * }
     * System.out.println("");
     * }
     * }
     */

    public void triangulo() {
        for (int i = 0; i <= lado; i++) {
            for (int k = 0; k < lado - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {

                System.out.print(" *");
            }
            System.out.println("");
        }
    }

    public void fig() {
        if (tipo == "cuadrado") {
            cuadrado();
        } else if (tipo == "triangulo") {
            triangulo();
        } else {
            System.out.println("no es un cuadrado");
        }
    }
}
