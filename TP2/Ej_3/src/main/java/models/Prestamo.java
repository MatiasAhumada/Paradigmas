package models;

public class Prestamo {

    private String fecha;
    private int id;
    private String ejemplarPrestamo;
    private int IDUsuario;
    private int devolucion;

    public Prestamo() {
    }

    public Prestamo(Fecha fecha, int id, String ejemplarPrestamo, int IDUsuario, int devolucion) {
        this.fecha = fecha.toString();
        this.id = id;
        this.ejemplarPrestamo = ejemplarPrestamo;
        this.IDUsuario = IDUsuario;
        this.devolucion = devolucion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEjemplarPrestamo() {
        return ejemplarPrestamo;
    }

    public void setEjemplarPrestamo(String ejemplarPrestamo) {
        this.ejemplarPrestamo = ejemplarPrestamo;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public int getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(int devolucion) {
        this.devolucion = devolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fecha=" + fecha + ", id=" + id + ", ejemplarPrestamo=" + ejemplarPrestamo + ", IDUsuario=" + IDUsuario + ", devolucion=" + devolucion + '}';
    }

}
