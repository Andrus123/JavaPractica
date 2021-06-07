/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.io.IOException;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {

    public static void main(String[] args) {

        try {
            Computadora[] computadoras = new Computadora[10];
            Factura factura1 = new Factura(2, 05, 2021, 123, "Peter Parker", computadoras);
            PersistenciaFactura op1 = new PersistenciaFactura(2, 05, 2021, 123, "Peter Parker", computadoras);
//            Computadora c1 = new Computadora(1241, "DELL", 15700);
//            Computadora c2 = new Computadora(1221, "RYZEN", 25700);
//            Computadora c3 = new Computadora(1212, "MAC", 35700);
//            factura1.agregarComputadora(c1);
//            factura1.agregarComputadora(c2);
//            factura1.agregarComputadora(c3);
//            //Guardando Factura en op1
//            op1.guardar(factura1);
            System.out.println("Factura guardada con exito");
            
            System.out.println("Recuperando Factura de Archivo...");
            Factura facturarec = op1.recuperar();
            
            System.out.println("Factura: "+facturarec.clientes.getNombres());
            facturarec.mostrarFactura();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error:"+ e);
        }
    }
}
