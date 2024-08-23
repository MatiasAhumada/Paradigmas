/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Matias Ahumada Legajo 57903 Comision 2K05
 */
public class Grupos {

    private ArrayList<Grupo> grupos = new ArrayList<>();

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    public void agg(Grupo grupo) {
        grupos.add(grupo);
    }

    public void mostrar() {
        for (Grupo grupo : grupos) {
            System.out.println(grupo);
        }
    }

    public Grupo buscarGrupo(String nombre) {
        for (int i = 0; i < grupos.size(); i++) {
            if (grupos.get(i).getDescripcion().equals(nombre)) {
                return grupos.get(i);
            }

        }
        return null;
    }

}
