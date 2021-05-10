/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recibo;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args){
        
        Mueble[] muebles= new Mueble[10];
        Mueble m1= new Mueble(100, "Sofa",70000);
        Mueble m2= new Mueble(200, "Silla",10000);
        Mueble m3= new Mueble(250, "Cama",15000);
        
        Recibo Recibo1 = new Recibo(10, 05, 2021, 1235, "Peter Parker", muebles, 'A', 21);
        Recibo1.agregarMueble(m1);
        Recibo1.agregarMueble(m2);
        Recibo1.agregarMueble(m3);
        Recibo1.mostrarRecibo();
    }
}
