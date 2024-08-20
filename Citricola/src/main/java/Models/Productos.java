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
public class Productos {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void setproductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getproductos() {
        return productos;
    }

    public void agg(Producto producto) {
        productos.add(producto);
    }

    public void mostrar() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public Producto buscarProducto(String NompreProd) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getTipoP() == NompreProd) {
                return productos.get(i);
            }
        }
        return null;
    }
}
