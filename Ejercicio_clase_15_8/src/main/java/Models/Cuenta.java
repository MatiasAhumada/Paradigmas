/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Matias
 */
public class Cuenta {
    private int IdCliente;
    private int IDCuenta;
    private String Tipo;
    private int Saldo;
    
    
    
    public Cuenta(){
        
    }

    public Cuenta(int IdCliente, String Tipo, int Saldo, int IDCuenta) {
        this.IdCliente = IdCliente;
        this.IDCuenta = IDCuenta;
        this.Tipo = Tipo;
        this.Saldo = Saldo;
        
    }
    
    

    public int getIDCuenta() {
        return IDCuenta;
    }

    public void setIDCuenta(int IDCuenta) {
        this.IDCuenta = IDCuenta;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "IdCliente=" + IdCliente + ", Tipo=" + Tipo + ", Saldo=" + Saldo + ", IDCuenta=" + IDCuenta + '}';
    }
    
    
    
}
