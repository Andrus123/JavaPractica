/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

/**
 *
 * @author andru
 */
public class Principal {
    public static void main(String[] args){
        Factura f1 = new Factura();
        f1.almacenar();
        System.out.println("Mostrar todos los productos");
        f1.mostrar();
        System.out.println("Mostrar hasta x productos");
        f1.mostrar(1);
        System.out.println("Mostrar la cantidad de un tipo de producto");
        f1.mostrar("vino");
        System.out.println("Obtener la suma total de productos de un precio x");
        f1.precioX(Leer.datoFloat());
        System.out.println("Obtener el total de productos de un precio x en el intervalo i,j");
        f1.precioX(Leer.datoFloat(), Leer.datoInt(), Leer.datoInt());
    }
}
