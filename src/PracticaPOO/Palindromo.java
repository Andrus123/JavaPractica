/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPOO;

import Estudiante.Leer;

/**
 *
 * @author andru
 */
public class Palindromo {
    private String palabra;
    
    public Palindromo(){
        this.palabra = "";
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    public Palindromo(String palabra) {
        this.palabra = palabra;
    }
    public void leer(){
        System.out.println("Ingrese la palabra: ");
        this.palabra = Leer.dato();
    }
    public void mostrar(){
        System.out.println(palabra);
    }
    public void verificar(){
        char[] pdr = this.palabra.toCharArray();
        char begin = 0;
        char end = (char) (pdr.length -1);
        char temp;
        while(end>begin){
            temp = pdr[begin];
            pdr[begin] = pdr[end]; 
            pdr[end] = temp;
            end--;
            begin++;
        }
        String inv = String.valueOf(pdr);
        if(palabra.equals(inv)){
            System.out.println("Es un PALINDROMO");
        }
        else{
            System.out.println("NO es un PALINDROMO");
        }
    }
    
    public static void main(String[] args){
        Palindromo p1 = new Palindromo();
        Palindromo p2 = new Palindromo();
        p1.leer();
        p1.mostrar();
        p1.verificar();
        p2.leer();
        p2.mostrar();
        p2.verificar();
    }
    
    
}
