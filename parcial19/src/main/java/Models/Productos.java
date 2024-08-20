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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agg(Producto prod) {
        productos.add(prod);
    }

    public void mostrar() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public Producto BProdID(int IDP) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getID() == IDP) {
                return productos.get(i);
            }
        }
        return null;

    }

    public Producto BProdFab(int IDF) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getFab()== IDF) {
                return productos.get(i);
            }
        }
        return null;
    }
    

}
