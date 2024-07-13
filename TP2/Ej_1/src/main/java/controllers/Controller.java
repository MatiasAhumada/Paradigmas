package controllers;

import javax.swing.JOptionPane;
import models.Alumnos;
import models.Materia;

import Vista.VistaPrincipal;
import java.time.LocalDateTime;

import models.Alumno;
import models.Planilla;

public class Controller {

    private static Alumnos alumnos = new Alumnos();

    public static void inicio() {
        new VistaPrincipal().setVisible(true);

    }

    public static void FormatoTablaChica(VistaPrincipal vista) {

        vista.getModeloChica().setColumnCount(0);
        vista.getModeloChica().setNumRows(0);
        vista.getModeloChica().addColumn("Fecha");
        vista.getModeloChica().addColumn("Profesor");
        vista.getModeloChica().addColumn("Materia");

        Materia materia = new Materia(vista.getMateria().getText());
        LocalDateTime hoy = LocalDateTime.now();
        Planilla planilla = new Planilla(hoy.getDayOfMonth() + "/" + hoy.getMonthValue() + "/" + hoy.getYear(), vista.getProfesor().getText());
        
        Object[] fila = new Object[3];
        fila[0] = planilla.getFecha();
        fila[1] = planilla.getProfesor();
        fila[2] = materia.getName();
        vista.getModeloChica().addRow(fila);

        vista.getTableChica().setModel(vista.getModeloChica());
    }

    public static void FromatoTablaGrande(VistaPrincipal vista) {

        vista.getModeloGrande().setColumnCount(0);
        vista.getModeloGrande().setNumRows(0);
        vista.getModeloGrande().addColumn("Alumno");
        vista.getModeloGrande().addColumn("Legajo");
        for (Alumno alumno : alumnos.getAlumnos()) {
            Object[] fila = new Object[2];
            fila[0] = alumno.getName();
            fila[1] = alumno.getLegajo();

            vista.getModeloGrande().addRow(fila);
        }

        vista.getTableGrande().setModel(vista.getModeloGrande());

    }

    public static void planillaGrande(VistaPrincipal vista) {
        try {
            Alumno alumno = new Alumno(Integer.parseInt(vista.getLegajo().getText()), vista.getAlumno().getText());
            if (alumno.getLegajo() >= 50000 && alumno.getLegajo() <= 70000) {
                alumnos.agregarAlumno(alumno);
                JOptionPane.showMessageDialog(null, "Alumno cargado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                vista.getAlumno().setText("");
                vista.getLegajo().setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Legajo incorrecto\nIngrese nuevamente", "ERROR", JOptionPane.ERROR_MESSAGE);
                vista.getAlumno().setText("");
                vista.getLegajo().setText("");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Datos mal ingresados", "ERROR", JOptionPane.ERROR_MESSAGE);

        }

    }

    /*public static void crearMateria(String name) {
        Materia materia = new Materia(name);
        materias.agregarMateria(materia);

    }

    public static void mostrarPlanilla() {
        planillas.mostrarPlanillas();
    }

    public static void mostrarAlumnos() {
        alumnos.mostrarAlumnos();
    }*/
}
