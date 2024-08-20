/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Matias
 */
public class Planta {

    private int IDPlanta;
    private String NombrePlanta;
    private int CantPlantas;

    public Planta() {
    }

    public Planta(int IDPlanta, String NombreP, int CantPlantas) {

        this.IDPlanta = IDPlanta;
        this.NombrePlanta = NombreP;
        this.CantPlantas = CantPlantas;

    }

    public void setIDPlanta(int IDPlanta) {
        this.IDPlanta = IDPlanta;
    }

    public int getIDPlanta() {
        return IDPlanta;
    }

    public void setNombrePlanta(String NombreP) {
        this.NombrePlanta = NombreP;
    }

    public String getNombrePlanta() {
        return NombrePlanta;
    }

    public void setCantPlantas(int CantPlantas) {
        this.CantPlantas = CantPlantas;
    }

    public int getCantPlantas() {
        return CantPlantas;
    }

    @Override
    public String toString() {
        return "Planta{" + ", IDPlanta=" + IDPlanta + ", NombreP=" + NombrePlanta + ", CantXMes=" + CantPlantas + '}';
    }

}
