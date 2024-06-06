package EJERCICIO_3.models;

import java.util.ArrayList;

public class Ejemplares {
    private ArrayList<Ejemplar> ejemplares=new ArrayList<Ejemplar>();
    

    public ArrayList<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(ArrayList<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

   
    public  void agregarejemplar(Ejemplar ejemplar){
            ejemplares.add(ejemplar);
    }

    public String buscarEjemplar(String title){
        //Ejemplar ejemplar = new Ejemplar();
        for (int i = 0; i < ejemplares.size(); i++){
            if(ejemplares.get(i).getTitle()==title){
                return ejemplares.get(i).toString();
            }
        }
        return "no se encontro nada";
    }
   
    public void mostrarEjemplares(){
       
        for(Ejemplar ejemplar: ejemplares){
            System.out.println(ejemplar+"\n");
        }
    }
}
