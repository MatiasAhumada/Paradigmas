/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDateTime;

/**
 *
 * @author Matias
 */
public class Pedido {

    private String Nombre;
    private String Apellido;
    private int Cantidad;
    private String Fecha;
    private String Tipo;
    private String Estado;

    public Pedido(String nombre, String apellido, int cantidad, String fecha, String tipo,String estado) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Cantidad = cantidad;
        this.Fecha = fecha;
        this.Tipo = tipo;
        this.Estado=estado;
    }

    public Pedido() {

    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setCantidad(int cantidad) {
        this.Cantidad = cantidad;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setFecha(String fecha) {

        this.Fecha = fecha;
    }

    public String getFecha() {
        return Fecha;
    }

    @Override
    public String toString() {

        return "\tNombre: " + Nombre + "\n\t Apellido: " + Apellido + "\n\t Cantidad: " + Cantidad + "\n\t Fecha:" + Fecha + "\n";
    }

}
