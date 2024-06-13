/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package swing_2k5;

/**
 *
 * @author Paradigmas
 */
public class Materia {
    private int codigo;
    private String nombre;
    private int nivel;
    private String carrera;

    public Materia(){}

    public Materia(int codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Materia{" + "codigo=" + codigo + "nombre=" + nombre + "nivel=" + nivel + "carrera=" + carrera + '}';
    }
    public void mostrar(){
        System.out.println("Materia : "+codigo+" "+nombre);
    }
}
