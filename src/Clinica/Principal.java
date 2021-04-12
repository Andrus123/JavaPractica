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
        
        if(g1.comparaNombre(g2)){
            System.out.println("Los nombres son iguales: " + g1.getNombre()+"-"+g2.getNombre());
        }else{
            System.out.println("Los nombres son diferentes: " + g1.getNombre()+"-"+g2.getNombre());
        }
        
        if(g1.comparaContPre(g2)){
            System.out.println("Nombre: "+g1.getNombre()+" cantidad: "+g1.getContrPre());
        }else{
            System.out.println("Nombre: "+g2.getNombre()+" cantidad: "+g2.getContrPre());
        }
        //d)
        System.out.println("Cuantos Pacientes: ");
        int n = Leer.datoInt();
        Paciente[] pacientes = new Paciente[n];
        for(int i=0;i<pacientes.length;i++){
            pacientes[i] = new Paciente();
            pacientes[i].leer();
        }
    }
}
