/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import models.Materias;

/**
 *
 * @author Paradigmas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*
 PlanillaAsistencia asistencia = new PlanillaAsistencia();
        ListaMaterias materias = new ListaMaterias();

        materias.agregar(212, "Paradigmas de Programacion");
        materias.agregar(202, "Analisis Matematico 2");
        materias.agregar(210, "Analisis de Sistemas");

        asistencia.setDocente(new Profesor(415,"Juan","Perez"));
        asistencia.setComision("2k5");
        asistencia.getLista().agregar(new Alumno(41541,"Cristian","Andrade"));
        asistencia.getLista().agregar(new Alumno(58490,"Ricardo","Liendro"));
        asistencia.getLista().agregar(new Alumno(49551,"Silvia","Suarez"));

        asistencia.setMateria( materias.getLista().get(0));

        asistencia.mostrar();
*/
        Materias prueba = new Materias();
        VistaMaterias pantalla1 = new VistaMaterias(null,true);
        pantalla1.setLista(prueba);
        pantalla1.setVisible(true);
        prueba.mostrar();
    }

}
