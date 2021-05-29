/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesgenericas;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args) {
        //Clase Genérica Vector<E> (Donde E se define el tipo de dato 
        //                                          que ingresa al Vector)
        Vector<String> nombres = new Vector<>();
        nombres.addElement("Bitcoin 300000");
        nombres.addElement("Ethereum 100000");
        nombres.addElement("Dogecoin 4000");
        System.out.println(nombres);
        System.out.println("Eliminando el primer elemento ...");
        nombres.remove(0);
        System.out.println(nombres);
        
        //Clase Genérica ArrayList<E> 
        Usuarios u1 = new Usuarios("Carlos Aquin", "Ke@gmail.com", "Ke");
        Usuarios u2 = new Usuarios("Luis Fernando","luisfer@gmail.com","Nano");
        Wallet w1 = new Wallet(700, "Bitcoin", 45000);
        Wallet w2 = new Wallet(650, "Ethereum",15000);
       
        ArrayList<Usuarios> usuarios = new ArrayList<>();
        ArrayList<Wallet> wallets = new ArrayList<>();
        
        usuarios.add(u1);
        usuarios.add(u2);
        
        wallets.add(w1);
        wallets.add(w2);
        //Creando un iterador para recorrer las listas
        Iterator itusuarios = usuarios.iterator();
        Iterator itwallets = wallets.iterator();
        
        while(itusuarios.hasNext()){
            Usuarios usuariolista = (Usuarios)itusuarios.next();
            Wallet walletlista = (Wallet)itwallets.next();
            usuariolista.mostrar();
            walletlista.mostrar();
            System.out.println("Profits: "+
                walletlista.getCoin()*walletlista.getValueusd()+" USD");
        }
    }
}
