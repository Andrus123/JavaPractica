/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

import CajaAhorro.Leer;

/**
 *
 * @author andru
 */
public class Casa {

    protected int nPuertas, nVentanas;
    protected String color;

    public Casa() {
        this.nPuertas = 2;
        this.nVentanas = 1;
        this.color = "cafe";
    }

    public Casa(int nPuertas, int nVentanas, String color) {
        this.nPuertas = nPuertas;
        this.nVentanas = nVentanas;
        this.color = color;
    }

    public void pintar(String co) {
        this.color = co;
    }

    public void abrirVentana(int n) {
        this.nVentanas = this.nVentanas + n;
    }

    public void cerrarVentanas(int n) {
        this.nVentanas = this.nVentanas - n;
        if (nVentanas < 0) {
            nVentanas = 0;
        }
    }

    public void abrirPuertas(int n) {
        this.nPuertas = this.nPuertas + n;
    }

    public void cerrarPuertas(int n) {
        this.nPuertas = this.nPuertas - n;
        if (nPuertas < 0) {
            nPuertas = 0;
        }
    }

    public void leer() {
        System.out.println("Numero de puertas: ");
        nPuertas = Leer.datoInt();
        System.out.println("Numero de ventanas: ");
        nVentanas = Leer.datoInt();
        System.out.println("Color: ");
        color = Leer.dato();
    }

    public void mostrar() {
        System.out.println("Numero de puertas: " + nPuertas);
        System.out.println("Numero de ventanas: " + nVentanas);
        System.out.println("Color: " + color);
    }
}
