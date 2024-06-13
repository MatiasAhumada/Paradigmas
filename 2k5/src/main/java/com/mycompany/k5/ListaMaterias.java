/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.k5;

import java.util.ArrayList;
/**
 *
 * @author Paradigmas
 */
public class ListaMaterias {
    private ArrayList<Materia> materias = new ArrayList<>();

    public ListaMaterias(){}

    public void agregar(int codigo, String nombre){
        materias.add(new Materia(codigo,nombre));
    }
    public void mostrar(){
        for(Materia m : materias )
            m.mostrar();
    }
    public ArrayList<Materia> getLista(){
        return materias;
    }

}
