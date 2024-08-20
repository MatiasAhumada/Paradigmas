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
public class Fabricantes {

    private ArrayList<Fabricante> fabricantes = new ArrayList<>();

    public void setFabricantes(ArrayList<Fabricante> fabricantes) {
        this.fabricantes = fabricantes;
    }

    public ArrayList<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public void agg(Fabricante fab) {
        fabricantes.add(fab);
    }

    public void mostrar() {
        for (Fabricante fabricante : fabricantes) {
            System.out.println(fabricante);
        }
    }

    public Fabricante buscar(int ID) {
        for (int i = 0; i < fabricantes.size(); i++) {
            return fabricantes.get(i);
        }
        return null;
    }

}
