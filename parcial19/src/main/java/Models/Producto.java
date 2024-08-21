/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Matias
 */
public class Producto {

    private int ID;
    private String Desc;
    private int Cant;
    private double Precio;
    private int Fab;

    public Producto() {
    }

    public Producto(int ID, String Desc, int Cant, double Precio, int Fab) {
        this.ID = ID;
        this.Desc = Desc;
        this.Cant = Cant;
        this.Precio = Precio;
        this.Fab = Fab;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public int getCant() {
        return Cant;
    }

    public void setCant(int Cant) {
        this.Cant = Cant;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getFab() {
        return Fab;
    }

    public void setFab(int Fab) {
        this.Fab = Fab;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", Desc=" + Desc + ", Cant=" + Cant + ", Precio=" + Precio + ", Fab=" + Fab + '}';
    }

}
