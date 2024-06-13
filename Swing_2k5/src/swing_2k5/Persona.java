/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package swing_2k5;

/**
 *
 * @author Paradigmas
 */
public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private char sexo;
    private String telefono;

    public Persona(){}

    public Persona(int dni, String nombre, String apellido){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void mostrar(){}

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + "nombre=" + nombre + "apellido=" + apellido + "sexo=" + sexo + "telefono=" + telefono + '}';
    }


}
