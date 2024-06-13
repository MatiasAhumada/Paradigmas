/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package swing_2k5;

/**
 *
 * @author Paradigmas
 */
public class Alumno extends Persona {
    private int legajo;
    private Materia materia;
    private String comision;

    public Alumno(){}

    public Alumno(int legajo, String nombre, String apellido){
        super(0,nombre,apellido);
        this.legajo=legajo;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Alumno{" + "legajo=" + legajo + "materia=" + materia + "comision=" + comision + '}';
    }

    @Override
    public void mostrar(){
        System.out.println("Legajo:"+legajo+" "+getApellido()+" "+getNombre());
    }


}
