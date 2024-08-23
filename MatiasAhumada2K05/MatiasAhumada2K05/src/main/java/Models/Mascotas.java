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
public class Mascotas {

    private ArrayList<Mascota> mascotas = new ArrayList<>();

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void agg(Mascota mascota) {
        mascotas.add(mascota);
    }

    public void mostrar() {
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
    }

    public Mascota buscarMascota(int ID) {
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getCodMascota() == ID) {
                return mascotas.get(i);
            }

        }
        return null;
    }
}
