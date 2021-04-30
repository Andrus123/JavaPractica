/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseAbstracta;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args){
        //Docente d1 = new Docente();
        Titular t1=new Titular();
        t1.setCi(10014246);
        t1.setNombres("Juan");
        t1.setApellidos("Perez");
        t1.setaIngreso(2015);
        System.out.println("Sueldo de: "+t1.obtenerSueldo());
        
        Interino i1=new Interino(3456,"Pedro","Flores", 2020, 30, 300);
        System.out.println("Sueldo de: "+i1.obtenerSueldo());
    }
}
