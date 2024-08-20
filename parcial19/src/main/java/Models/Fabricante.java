/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Matias
 */
public class Fabricante {

    private int codigo;
    private String desc;

    public Fabricante() {
    }

    public Fabricante(int codigo, String desc) {
        this.codigo = codigo;
        this.desc = desc;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "codigo=" + codigo + ", desc=" + desc + '}';
    }
    
    

}
