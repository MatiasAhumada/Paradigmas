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

    private int IDProd;
    private String TipoP;
    private int PrecioXKG;
    private int CantXmes;

    public Producto() {
    }

    public Producto(int IDProd, String TipoP, int PrecioXKG, int CantXmes) {
        this.IDProd = IDProd;
        this.TipoP = TipoP;
        this.PrecioXKG = PrecioXKG;
        this.CantXmes = CantXmes;
    }

    public void setIDProd(int IDProd) {
        this.IDProd = IDProd;
    }

    public int getIDProd() {
        return IDProd;
    }

   

    public void setTipoP(String TipoP) {
        this.TipoP = TipoP;
    }

    public String getTipoP() {
        return TipoP;
    }

    public void setPrecioXKG(int PrecioXKG) {
        this.PrecioXKG = PrecioXKG;
    }

    public int getPrecioXKG() {
        return PrecioXKG;
    }

    public void setCantXmes(int CantXmes) {
        this.CantXmes = CantXmes;
    }

    public int getCantXmes() {
        return CantXmes;
    }

    @Override
    public String toString() {
        return "Producto{" + "IDProd=" + IDProd + ", TipoP=" + TipoP + ", PrecioXKG=" + PrecioXKG + ", CantXmes=" + CantXmes + '}';
    }
    
    

}
