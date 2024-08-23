/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Matias Ahumada Legajo 57903 Comision 2K05
 */
public class Grupo {

    private int CodigoGrupo;
    private String Descripcion;

    public Grupo() {
    }

    public Grupo(int CodigoGrupo, String Descripcion) {
        this.CodigoGrupo = CodigoGrupo;
        this.Descripcion = Descripcion;
    }

    public int getCodigoGrupo() {
        return CodigoGrupo;
    }

    public void setCodigoGrupo(int Codigo) {
        this.CodigoGrupo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Veterinaria{" + "Codigo=" + CodigoGrupo + ", Descripcion=" + Descripcion + '}';
    }

}
