/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

/**
 *
 * @author andru
 */
public class Principal {

    public static void main(String[] args) {
        Chalet ch1 = new Chalet();
        Chalet ch2 = new Chalet(3, 2, "Blanco", 200);
        ch1.leer();
        ch1.mostrar();
        ch2.mostrar();
        ch1.abrirVentana(2);
        ch1.mostrar();
        ch1.cerrarVentanas(1);
        ch1.mostrar();

        if (ch1.cantidadMetros(ch2)) {
            ch1.mostrar();
        } else {
            ch2.mostrar();
        }

        Departamento d1 = new Departamento();
        d1.leer();
        Departamento d2 = new Departamento(4, 3, "Plomo", 8);
        d1.mostrar();
        d2.mostrar();
        if (d1.minHabitaciones(d2)) {
            d1.mostrar();
        } else {
            d2.mostrar();
        }
    }
}
