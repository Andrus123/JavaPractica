/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPoliformismo;

import Factura.Leer;

/**
 *
 * @author andru
 */
public class Frase {
        private String titulo;
        private int nropalabras;
        private String [] palabra = new String[30];
        
        public Frase(){
            this.nropalabras = 25;
            this.titulo = "Ozymandias";
            palabra[0] = "And";  palabra[13] = "kings.";  
            palabra[1] = "on";  palabra[14] = "Look"; 
            palabra[2] = "the";  palabra[15] = "on"; 
            palabra[3] = "pedestal";  palabra[16] = "my"; 
            palabra[4] = "these";  palabra[17] = "works,"; 
            palabra[5] = "words";  palabra[18] = "ye"; 
            palabra[6] = "appear:";  palabra[19] = "Mighty,";
            palabra[7] = "‘My";  palabra[20] = "and"; 
            palabra[8] = "name";  palabra[21] = "despair!’"; 
            palabra[9] = "is";  palabra[22] = "Nothing"; 
            palabra[10] = "Ozymandias"; palabra[23] = "beside"; 
            palabra[11] = "king"; palabra[24] = "remains."; 
            palabra[12] = "of";  
        }
        //Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNropalabras() {
        return nropalabras;
    }

    public void setNropalabras(int nropalabras) {
        this.nropalabras = nropalabras;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }
        
    public void leer(){
    System.out.println("Titulo del Poema: ");
    this.titulo = Leer.dato();
    System.out.println("Cantidad de Palabras: ");
    this.nropalabras = Leer.datoInt();
      for(int i=0;i<getNropalabras();i++){
           palabra[i]=Leer.dato();
        }
    }
    public void mostrar(){
        System.out.println("Titulo: " + getTitulo());
        for(int i=0; i<getNropalabras();i++){
            System.out.print(palabra[i] + " ");
            if(i%7==0){
                System.out.println();
            }
        }
        System.out.println();
    }
    public void mostrar(int x){
        for(int i=0; i<getNropalabras();i++){
            System.out.println("Palabra del Poema elegido: ");
            System.out.println(palabra[x]);
            break;
        }
    }
    public void mostrar(int x, int y){
        System.out.println("Rango de Palabras elegidas:");
        for(int i=x;i<y;i++){
                System.out.print(palabra[i] + " ");
            if(i%4==0){
                System.out.println();
                }
        }System.out.println();
    }
    
    public static void main(String[] args){
        Frase f1 = new Frase();
        Frase f2 = new Frase();
        f1.mostrar();
        f1.mostrar(5);
        f1.mostrar(7, 14);
        f2.leer();
        f2.mostrar();
    }
        
}
