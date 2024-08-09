/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;
import Modelo.Personas;
import Vista.VistaPersona;
import java.util.ArrayList;



/**
 *
 * @author bonaparte
 */
public class Controlador {
    private static Personas personas = new Personas();
            
    public static void inicio(){
        new VistaPersona().setVisible(true);
    }

    public static void salir(VistaPersona vista){
        vista.dispose();
    }
    
    public static void agregar(VistaPersona vista){
        Persona persona = new Persona();
        persona.setNombre(vista.getNombre().getText());
        persona.setEdad(Integer.valueOf(vista.getEdad().getText()));
        personas.agregarPersona(persona);
    }
    
    public static void mostrar(){
        personas.mostrarPersonas();
    }
}
