/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vector;

/**
 *
 * @author andru
 */
public class Principal {

    public static void main(String[] args) {
     System.out.println("Cantidad de Datos");
     int n = Leer.datoInt();
     Vector[] vctr = new Vector[n];
     for(int i = 0; i< vctr.length; i++){
       System.out.println("Dato: ");
       int dato = Leer.datoInt();
       vctr[i] = new Vector(dato);
     }
     Vector.Ordenar(vctr);
     Vector.impresion(vctr);
   }    
}
