package models;

import java.util.ArrayList;

public class Alumnos {
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void mostrarAlumnos() {
        System.out.println("\nAlumnos\n");
        System.out.println("\tNombre\t\tLegajo\n"); 
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
        }

    }
    

}
