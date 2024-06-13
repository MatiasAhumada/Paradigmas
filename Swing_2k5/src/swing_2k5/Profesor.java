/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package swing_2k5;

/**
 *
 * @author Paradigmas
 */
public class Profesor extends Persona {
    private int legajo;
    private Materia materia;

    public Profesor(){}

    public Profesor(int legajo, String nombre, String apellido){
        super(0,nombre,apellido);
        this.legajo=legajo;
    }
    @Override
    public void mostrar(){
        System.out.println("Profesor : "+legajo+" "+getApellido()+" "+getNombre());
    }

}
