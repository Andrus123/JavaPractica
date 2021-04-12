/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica;

/**
 *
 * @author andru
 */
public class Principal {

    public static void main(String[] args) {
        Ginecologo g1 = new Ginecologo();
        Ginecologo g2 = new Ginecologo();
        System.out.println("Objeto g1: ");
        g1.leer();
        System.out.println("Objeto g2: ");
        g2.leer();
        System.out.println("Listado de medicos Ginecologos:");
        g1.mostrar();
        System.out.println("");
        g2.mostrar();
    }
}
