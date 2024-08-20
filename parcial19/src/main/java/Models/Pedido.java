/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Matias
 */
public class Pedido {
     private int IDPed;
    private int IDProd;
    private int IDFab;
    private int CantProd;
    private double Precio;

    public Pedido() {
    }

    public Pedido(int IDPed, int IDProd, int IDFab, int CantProd, int Precio) {
        this.IDPed = IDPed;
        this.IDProd = IDProd;
        this.IDFab = IDFab;
        this.CantProd = CantProd;
        this.Precio = Precio;
    }

    public int getIDPed() {
        return IDPed;
    }

    public void setIDPed(int IDPed) {
        this.IDPed = IDPed;
    }

    public int getIDProd() {
        return IDProd;
    }

    public void setIDProd(int IDProd) {
        this.IDProd = IDProd;
    }

    public int getIDFab() {
        return IDFab;
    }

    public void setIDFab(int IDFab) {
        this.IDFab = IDFab;
    }

    public int getCantProd() {
        return CantProd;
    }

    public void setCantProd(int CantProd) {
        this.CantProd = CantProd;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "IDPed=" + IDPed + ", IDProd=" + IDProd + ", IDFab=" + IDFab + ", CantProd=" + CantProd + ", Precio=" + Precio + '}';
    }
}
