/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Matias
 */
public class Cliente {

    private int IDCliente;
    private String ApeNom;

    public Cliente() {

    }

    public Cliente(int IDCliente, String ApeNom) {
        this.IDCliente = IDCliente;
        this.ApeNom = ApeNom;        
    }
    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setApeNom(String ApeNom) {
        this.ApeNom = ApeNom;
    }

    public String getApeNom() {
        return ApeNom;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IDCliente=" + IDCliente + ", ApeNom=" + ApeNom + '}';
    }
    
    

}
