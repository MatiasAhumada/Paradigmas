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

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostrarCuentas() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
    public String buscarCliente(int Id){
        for(Cliente cliente : clientes){
            if(cliente.getIDCliente()==Id){
                return cliente.getApeNom();
            }
        }
        return null;
    }
    public int buscarCID(int ID){
        for(Cliente cliente : clientes){
            if(cliente.getIDCliente()==ID){
                return cliente.getIDCliente();
            }
        }
        return 0;
        
    }
}
