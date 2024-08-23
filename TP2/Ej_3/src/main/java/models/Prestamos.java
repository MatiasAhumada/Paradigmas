package models;

import java.util.ArrayList;

public class Prestamos {

    private ArrayList<Prestamo> prestamos = new ArrayList<>();

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public void mostrarPrestamos() {
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }

    public Prestamo BuscarID(int ID) {
        for (int i = 0; i < prestamos.size(); i++) {
            if (prestamos.get(i).getId() == ID) {
                return prestamos.get(i);
            }

        }
        return null;
    }
}
