/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericidad;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {

    public static void main(String[] args) {
        ArrayObject v1 = new ArrayObject();
        v1.adicionar((float) 1.5); // upcasting
        v1.adicionar(2.5);
        v1.adicionar(7);
        v1.adicionar("Genericidad");
        v1.adicionar('a');
        v1.adicionar(true);
        v1.mostrar();

        System.out.println("\n");
        float a = (float) v1.obtiene(1); //downcasting
        System.out.println(a);
        int b = (Integer) v1.obtiene(3);
        System.out.println(b);
        boolean c = (Boolean) v1.obtiene(6);
        System.out.println(c);
        char d = (Character) v1.obtiene(5);
        System.out.println("\nEliminando Elementos");
        
        v1.eliminar(2);
        v1.mostrar();
    }
}
