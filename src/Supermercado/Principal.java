/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supermercado;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args){
        Producto[] productos= new Producto[10];
        Fecha f1 = new Fecha(30, 12, 2020);
        Cliente c1 = new Cliente(1235,"Peter Parker");
        Producto p1= new Producto(100, "Vino",70.5);
        Producto p2= new Producto(200, "Cafe",49.5);
        
        Factura Fact1 = new Factura('F', 1, f1, c1, productos);
        Fact1.agregarProducto(p1, 1);
        Fact1.agregarProducto(p2, 2);
        Fact1.mostrarFactura();
    }
}
