/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPoliformismo;

import Vector.Leer;

/**
 *
 * @author andru
 */
public class Biblioteca {
    private String nombre;
    private int nrolibros;
    private String[][] libro = new String[40][3];
    
    public Biblioteca(){
        this.nombre = "Biblioteca Central";
        this.nrolibros = 5;
        this.libro[0][0] = "Maps of Meaning";   this.libro[0][1] = "Jordan Peterson"; this.libro[0][2] = "Autoayuda"; 
        this.libro[1][0] = "Clean Code";        this.libro[1][1] = "Robert Martin";   this.libro[1][2] = "Tecnologia"; 
        this.libro[2][0] = "Superintelligence"; this.libro[2][1] = "Nick Bostrom";    this.libro[2][2] = "Tecnologia"; 
        this.libro[3][0] = "Zero to One";       this.libro[3][1] = "Peter Thiel";     this.libro[3][2] = "Negocios"; 
        this.libro[4][0] = "Sapiens";           this.libro[4][1] = "Yuval Harari";    this.libro[4][2] = "Historia"; 
    }

    public Biblioteca(String nombre, int nrolibros) {
        this.nombre = nombre;
        this.nrolibros = nrolibros;
        for(int i = 0; i < 40; i++){
            for (int j = 0; j< 3;j++){
                libro[i][j] = "";
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNrolibros() {
        return nrolibros;
    }

    public void setNrolibros(int nrolibros) {
        this.nrolibros = nrolibros;
    }

    public String[][] getLibro() {
        return libro;
    }

    public void setLibro(String[][] libro) {
        this.libro = libro;
    }
    
    public void leer(){
        System.out.println("BIBLIOTECA: ");
        this.nombre = Leer.dato();
        System.out.println("Número de libros: ");
        this.nrolibros = Leer.datoInt();
        for (int i = 0; i < getNrolibros(); i++){
            for ( int j = 0; j<3; j++){
                if (j == 0){
                    System.out.println("Titulo: ");
                }
                if (j == 1){
                    System.out.println("Autor: ");
                }
                if (j == 2){
                    System.out.println("Categoria: ");
                }
                libro[i][j] = Leer.dato();
            }
        }
    }
    public void mostrar(){
        System.out.println("BIBLIOTECA: " + getNombre());
        System.out.println("Libros disponibles: " + getNrolibros());
        System.out.println("Titulo:          Autor:              Categoría:");
        for (int i =0; i < getNrolibros();i++){
            System.out.println(libro[i][0] + "  "+libro[i][1]+ " "+libro[i][2]);
        }
    }
    public void mostrar(String x){
        for(int i = 0; i< getNrolibros(); i++){
          if(x == libro[i][1]){
              System.out.println(libro[i][0]);
          }
        }
    }
    public void ordenar(){
        for(int i = 0; i<getNrolibros(); i++){
            for(int j = 0; j<getNrolibros()&& i!=j;j++){
                if(libro[i][0].compareToIgnoreCase(libro[j][0])<0){
                    //titulo
                    String aux = libro[i][0];
                    libro[i][0]= libro[j][0];
                    libro[j][0]= aux;
                    //autor
                    String aux1 = libro[i][1];
                    libro[i][1] = libro[j][1];
                    libro[j][1] = aux1;
                    //categoria
                    String aux2 = libro[i][2];
                    libro[i][2] = libro[j][2];
                    libro[j][2] = aux2;
                }
            }
        }
    }
    public void ordenar(String x){
        for(int i = 0; i<getNrolibros(); i++){
            for(int j = 0; j<getNrolibros()&& i!=j;j++){
                if(libro[i][1].compareToIgnoreCase(libro[j][1])<0){
                    //autor
                    String aux1 = libro[i][1];
                    libro[i][1] = libro[j][1];
                    libro[j][1] = aux1;
                    //titulo
                    String aux = libro[i][0];
                    libro[i][0]= libro[j][0];
                    libro[j][0]= aux;
                    //categoria
                    String aux2 = libro[i][2];
                    libro[i][2] = libro[j][2];
                    libro[j][2] = aux2;
                }
            }
        }
    }
    public static void main(String[] args){
        Biblioteca b1 = new Biblioteca();
        b1.mostrar();
        b1.mostrar("Jordan Peterson");
        
        System.out.println();
        System.out.println("CATALOGO ORDENADO:");
        b1.ordenar();
        b1.mostrar();
        
        System.out.println();
        System.out.println("CATALOGO ORDENADO POR AUTOR");
        b1.ordenar("por Autor");
        b1.mostrar();
    }
}
