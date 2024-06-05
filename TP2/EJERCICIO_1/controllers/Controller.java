package EJERCICIO_1.controllers;

import java.time.LocalDate;

import EJERCICIO_1.models.Alumno;
import EJERCICIO_1.models.Alumnos;
import EJERCICIO_1.models.Fecha;
import EJERCICIO_1.models.Planillas;
import EJERCICIO_1.models.Planilla;

public class Controller {
    private static Alumnos alumnos = new Alumnos();
    private static Planillas planillas = new Planillas();

    public static void aggAlumno() {
        Alumno alumno = new Alumno(57903, "Matias Ahumada");
        Alumno alumno2 = new Alumno(57900, "Lucas Campos");
        alumnos.agregarAlumno(alumno);
        alumnos.agregarAlumno(alumno2);

    }

    public static void aggPlanilla() {
        LocalDate fechaActual = Fecha.obtenerFechaActual();
        Planilla planilla = new Planilla(fechaActual, "Matias ahumada");
        planillas.agregarPlanilla(planilla);

    }

    public static void mostrarPlanilla() {
        planillas.mostrarPlanillas();
    }

    public static void mostrarAlumnos() {
        alumnos.mostrarAlumnos();
    }

    public static void crearPlanilla() {
        Controller.aggAlumno();
        Controller.aggPlanilla();
        Controller.mostrarPlanilla();
        Controller.mostrarAlumnos();
    }
}
