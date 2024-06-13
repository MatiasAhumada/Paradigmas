/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package swing_2k5;

/**
 *
 * @author Paradigmas
 */
public class PlanillaAsistencia {
    private Profesor docente;
    private ListaAlumnos lista = new ListaAlumnos();
    private Materia materia;
    private String comision;

    public PlanillaAsistencia(){}

    public PlanillaAsistencia(Materia materia){
        this.materia = materia;
    }
    public ListaAlumnos getLista(){
        return lista;
    }
    public void setDocente(Profesor docente){
        this.docente = docente;
    }
    public void setMateria(Materia materia){
        this.materia=materia;
    }
    public void setComision(String comision){
        this.comision=comision;
    }
    public void mostrar(){
        System.out.println("Comision : "+comision);
        materia.mostrar();
        docente.mostrar();
        lista.mostrar();
    }

}
