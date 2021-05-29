/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesgenericas;
import java.util.Vector;
/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args) {
        Vector<String> nombres = new Vector<>();
        nombres.addElement("Bitcoin 300000");
        nombres.addElement("Ethereum 100000");
        nombres.addElement("Dogecoin 4000");
        System.out.println(nombres);
        System.out.println("Eliminando el primer elemento ...");
        nombres.remove(0);
        System.out.println(nombres);
    }
}
