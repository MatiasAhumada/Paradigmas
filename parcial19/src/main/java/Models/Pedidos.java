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
public class Pedidos {

    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void agg(Pedido ped) {
        pedidos.add(ped);
    }

    public void mostrar() {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

}
