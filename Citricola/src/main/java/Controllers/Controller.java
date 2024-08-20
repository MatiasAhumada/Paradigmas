/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.*;
import Vistas.*;

/**
 *
 * @author Matias
 */
public class Controller {

    private static final Productos productos = new Productos();
    private static final Plantas plantas = new Plantas();

    public static void inicio() {
        new VistaPrincipal().setVisible(true);
    }

    public static void AgregarProd() {
        Producto limon = new Producto(1, "Limon", 200, 60);
        productos.agg(limon);
        Producto pomelo = new Producto(2, "Pomelo", 400, 80);
        productos.agg(pomelo);
        Producto naranja = new Producto(3, "Naranja", 300, 70);
        productos.agg(naranja);
    }

    public static void AgregarPlan() {
        Planta limon = new Planta(1, "Limon", 100);
        plantas.agg(limon);
        Planta pomelo = new Planta(2, "Pomelo", 200);
        plantas.agg(pomelo);
        Planta naranja = new Planta(3, "Naranja", 200);
        plantas.agg(naranja);
    }
    
    
}
