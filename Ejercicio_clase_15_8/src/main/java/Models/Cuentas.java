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
public class Cuentas {
    private ArrayList<Cuenta> cuentas= new ArrayList<>();

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    public void agregarCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }
    public void mostrarCuentas(){
        for(Cuenta cuenta : cuentas){
            System.out.println(cuenta);
        }
    }
    public Cuenta buscarCuenta(int ID){
        for(int i = 0; i < cuentas.size(); i++){
            if(cuentas.get(i).getIdCliente()==ID){
                return cuentas.get(i);
            }
        }
        return null;
    }
}
