package EJERCICIO_2.models;

public class Figura {
    private String tipo;
    private int base;
    private int altura;
    private int radio;

    public Figura(String tipo, int base, int altura, int radio) {
        this.tipo = tipo;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }

    public Figura() {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String toString() {
        if (tipo == "cuadrado" ) {
            return "\n Soy una figura de tipo: " + tipo + " con base:" + base;
        } else if (tipo == "triangulo") {
            return "\n Soy una figura de tipo: " + tipo + " con base: " + base + " y altura: " + altura;
        } else if (tipo == "circulo") {
            return "\n Soy una figura de tipo: " + tipo + " con radio: " + radio;
        } else {
            return "\nNO EXISTE VALOR 1 \n";
        }

    }
}
