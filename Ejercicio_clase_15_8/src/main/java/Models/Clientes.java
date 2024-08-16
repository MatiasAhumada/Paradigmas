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
public class Clientes {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void agregarCuenta(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostrarCuentas() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

}
