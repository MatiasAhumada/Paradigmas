package models;

import java.util.ArrayList;

public class Usuarios {
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void crearUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public String validarUsuario(int legajo) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getLegajo() == legajo && usuarios.get(i).getSituacion() == "al dia") {
                return "Es socio y esta al dia";
            } else if (usuarios.get(i).getLegajo() == legajo && usuarios.get(i).getSituacion() != "al dia") {
                return "Es socio y DEBE libro/s";
            }

        }
        return "No es socio";
    }
    public String buscarUsuario(int legajo){
        for(int i = 0; i< usuarios.size();i++){
            if(usuarios.get(i).getLegajo()==legajo){    
                return usuarios.get(i).toString();
            }
        }
        return "No hay usuario con ese legajo";

    }

    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario + "\n");
        }
    }

}
