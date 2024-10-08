/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Matias
 */
public class Movimiento {

    private String Fecha;
    private int IDCliente;
    private int IDCuenta;
    private String TipoMov;
    private int CantMov;
    private int Saldo;

    public Movimiento() {
    }

    public Movimiento(Fecha fecha, int IDCliente, int IDCuenta, String TipoMov, int CantMov, int Saldo) {
        this.Fecha = fecha.toString();
        this.IDCliente = IDCliente;
        this.IDCuenta = IDCuenta;
        this.TipoMov = TipoMov;
        this.CantMov = CantMov;
        this.Saldo = Saldo;
    }

    public void setFecha(String fecha) {
        this.Fecha = fecha;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCuenta(int IDCuenta) {
        this.IDCuenta = IDCuenta;
    }

    public int getIDCuenta() {
        return IDCuenta;
    }

    public void setTipoMov(String TipoMov) {
        this.TipoMov = TipoMov;
    }

    public String getTipoMov() {
        return TipoMov;
    }

    public void setCantMov(int CantMov) {
        this.CantMov = CantMov;
    }

    public int getCantMov() {
        return CantMov;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    public int getSaldo() {
        return Saldo;
    }

    @Override
    public String toString() {
        return "\nFecha=" + Fecha + "\nIDCliente=" + IDCliente + "\nIDCuenta=" + IDCuenta + "\nTipoMov=" + TipoMov + "\nCantMov=" + CantMov + "\nSaldo=" + Saldo;
    }

}
