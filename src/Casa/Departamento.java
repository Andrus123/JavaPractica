/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

import Estudiante.Leer;

/**
 *
 * @author andru
 */
public class Departamento extends Casa {

    private int nHabitaciones;

    public Departamento() {
        super();
        this.nHabitaciones = 0;
    }

    public Departamento(int np, int nv, String c, int nh) {
        super(np, nv, c);
        this.nHabitaciones = nh;
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Nro. Habitaciones: " + getnHabitaciones());
    }

    public void leer() {
        super.leer();
        System.out.println("Nro Habitaciones: ");
        setnHabitaciones(Leer.datoInt());
    }
    //b)
    public boolean minHabitaciones(Departamento d2) {
        return (this.getnHabitaciones() < d2.getnHabitaciones());
    }
}
