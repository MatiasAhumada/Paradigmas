/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Pedidos {

    private ArrayList<Pedido> Pedidos = new ArrayList<>();

    public ArrayList<Pedido> getPedidos() {
        return Pedidos;
    }

    public void setPedidos(ArrayList<Pedido> Pedidos) {
        this.Pedidos = Pedidos;
    }

    public void agregarPedido(Pedido pedido) {
        Pedidos.add(pedido);
    }

    public void mostrarPedidos() {
        System.out.println("\nPedidos\n");
        for (Pedido pedido : Pedidos) {
            System.out.println(pedido);
        }

    }

}
