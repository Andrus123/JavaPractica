/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MCD;

/**
 *
 * @author andru
 */
public class Principal {

    public static void main(String[] args) {

        MCD ol = new MCD();
        ol.leer();
        ol.mcd();
        ol.mostrar();
        System.out.println("Valores a=12 y b=4");
        MCD o2=new MCD(12,4);
        o2.mcd();
        o2.mostrar();
        System.out.println("Valores a=8 y b=3");
        MCD o3 = new MCD();
        o3.setA(8);
        o3.setB(3);
        o3.mcd();
        o3.mostrar();
        MCD o4=new MCD(6,3);
        o4.mcd();
        System.out.println(o4.getB());
    }
}
