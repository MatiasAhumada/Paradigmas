package controllers;

import java.time.LocalDate;

import models.Alumno;
import models.Alumnos;
import models.Fecha;
import models.Materia;
import models.Materias;
import models.Planillas;
import models.Planilla;

public class Controller {
    private static final Alumnos alumnos = new Alumnos();
    private static final Planillas planillas = new Planillas();
    private static final Materias materias = new Materias();

    public static void aggAlumno(int legajo, String name) {
        Alumno alumno = new Alumno(legajo, name);

        alumnos.agregarAlumno(alumno);

    }

    public static void aggPlanilla(String profesor) {
        LocalDate fechaActual = Fecha.obtenerFechaActual();
        Planilla planilla = new Planilla(fechaActual, profesor);
        planillas.agregarPlanilla(planilla);

    }

    public static void mostrarPlanilla() {
        planillas.mostrarPlanillas();
    }

    public static void mostrarAlumnos() {
        alumnos.mostrarAlumnos();
    }

    public static void crearMateria(String name) {
        Materia materia = new Materia(name);
        materias.agregarMateria(materia);

    }

    public static void crearPlanilla() {
        aggAlumno(57903, "Matias Ahumada");
        aggAlumno(57901, "Lucas Campos");
        aggAlumno(57902, "Agustin Barale");

        crearMateria("fisica");

        aggPlanilla("Edwin");

        mostrarPlanilla();
        materias.mostrarMaterias();
        mostrarAlumnos();
    }
}
