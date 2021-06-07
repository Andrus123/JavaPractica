/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args) {
        Computadora[] computadoras = new Computadora[10];
        Computadora c1 = new Computadora(1241, "DELL", 15700);
        Computadora c2 = new Computadora(1221, "RYZEN", 25700);
        Computadora c3 = new Computadora(1212, "MAC", 35700);
        
        Factura factura1 = new Factura(2, 05, 2021, 123, "Peter Parker", computadoras);
        factura1.agregarComputadora(c1);
        factura1.agregarComputadora(c2);
        factura1.agregarComputadora(c3);
        factura1.mostrarFactura();
    }
}
