/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiante;

/**
 *
 * @author andru
 */
public class Principal {

    public static void main(String[] args) {
       Estudiante e1 = new Estudiante("Pedro", 77);
       e1.mostrar();
       Estudiante e2 = new Estudiante();
       e2.setNombres("Sandra");
       e2.setNota(78);
       e2.mostrar();
       Estudiante e3 = new Estudiante();
       e3.leer();
       e3.mostrar();
       e1.maxNota(e1,e2); 
       
       //Creando el Array de tipo Estudiante

        System.out.println("Cantidad de estudiantes: ");
        int n = Leer.datoInt();
        Estudiante[] ests = new Estudiante[n];
        for (int i = 0; i < ests.length; i++) {
            System.out.println("Nombre: ");
            String nom = Leer.dato();
            System.out.println("Nota: ");
            int nota = Leer.datoInt();
            ests[i] = new Estudiante(nom, nota);
        }
        for(int i = 0; i < ests.length; i++) {
            ests[i].mostrar();
        }
        Estudiante.maxmin(ests);
        Estudiante.reprobados(ests); 
    }
}
