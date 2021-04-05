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
    }
}
