/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Matias Ahumada Legajo 57903 Comision 2K05
 */
public class Mascota extends Grupo {

    private int CodMascota;
    private String Nombre;
    private String Sintomas;

    public Mascota() {
    }

    public Mascota(int CodMascota, String Nombre, String Sintomas, int CodigoGrupo, String Descripcion) {
        super(CodigoGrupo, Descripcion);
        this.CodMascota = CodMascota;
        this.Nombre = Nombre;
        this.Sintomas = Sintomas;
    }

    public int getCodMascota() {
        return CodMascota;
    }

    public void setCodMascota(int CodMascota) {
        this.CodMascota = CodMascota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSintomas() {
        return Sintomas;
    }

    public void setSintomas(String Sintomas) {
        this.Sintomas = Sintomas;
    }

    @Override
    public String toString() {
        return "Mascota{" + "CodMascota=" + CodMascota + ", Nombre=" + Nombre + ", Sintomas=" + Sintomas + '}';
    }

}
