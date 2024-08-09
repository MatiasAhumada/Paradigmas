/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author bonaparte
 */
public class Personas {
    private ArrayList<Persona> personas = new ArrayList<>();

    public ArrayList getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList personas) {
        this.personas = personas;
    }

    public void agregarPersona(Persona persona){
        personas.add(persona);
    }
    
    public void mostrarPersonas(){
        for(Persona persona : personas){
            System.out.println(persona);
        }
    }
}
