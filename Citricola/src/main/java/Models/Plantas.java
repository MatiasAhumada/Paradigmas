/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Plantas {

    private ArrayList<Planta> plantas = new ArrayList<>();

    public void setPlantas(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }

    public ArrayList<Planta> getPlantas() {
        return plantas;
    }

    public void agg(Planta planta) {
        plantas.add(planta);
    }

    public void mostrar() {
        for (Planta planta : plantas) {
            System.out.println(planta);
        }
    }

    public Planta buscarPlanta(String NomprePlan) {
        for (int i = 0; i < plantas.size(); i++) {
            if (plantas.get(i).getNombrePlanta() == NomprePlan) {
                return plantas.get(i);
            }
        }
        return null;
    }
}
