/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package swing_2k5;

import java.util.ArrayList;
/**
 *
 * @author Paradigmas
 */
public class ListaAlumnos {
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public ListaAlumnos(){}

    public void agregar(Alumno a){
        alumnos.add(a);
    }
    public void mostrar(){
        for(Alumno a : alumnos )
            a.mostrar();
    }
    public ArrayList<Alumno> getLista(){
        return alumnos;
    }


}
