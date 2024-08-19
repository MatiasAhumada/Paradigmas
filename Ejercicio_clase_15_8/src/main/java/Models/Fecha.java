/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDateTime;

/**
 *
 * @author Matias
 */
public class Fecha {

    private int Dia;
    private int Mes;
    private int anio;
LocalDateTime fec = LocalDateTime.now();
    public Fecha() {

    }

    public void setDia() {
        this.Dia = fec.getDayOfMonth();
    }

    public int getDia() {
        return Dia;
    }

    public void setMes() {
        this.Mes = fec.getMonthValue();
    }

    public int getMes() {
        return Mes;
    }

    public void setAnio() {
        this.anio = fec.getYear();
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return Dia + "/" + Mes + "/" + anio;
    }
}