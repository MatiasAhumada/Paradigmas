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
public class Movimientos {

    private ArrayList<Movimiento> movimientos = new ArrayList<>();

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void agregarMov(Movimiento mov) {
        movimientos.add(mov);
    }

    public void mostrarMovs() {
        for (Movimiento mov : movimientos) {
            System.out.println(mov);
        }
    }
    

}
