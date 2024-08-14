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
            if (usuarios.get(i).getLegajo() == legajo && usuarios.get(i).getEstado() == "Al dia") {
                return "Al dia";
            } else if (usuarios.get(i).getLegajo() == legajo && usuarios.get(i).getEstado() == "DEBE") {
                return "Debe";
            }

        }
        return "No es socio";
    }
   

    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario + "\n");
        }
    }

}
