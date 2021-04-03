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
        this.nrolibros = 3;
        this.libro[0][0] = "12 Rules for Live"; this.libro[0][1] = "Autoayuda"; 
        this.libro[1][0] = "Clean Code";        this.libro[1][1] = "Tecnología"; 
        this.libro[2][0] = "Superintelligence"; this.libro[2][1] = "Tecnología"; 
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
            for ( int j = 0; j<2; j++){
                if (j == 0){
                    System.out.println("Titulo: ");
                }
                if (j == 1){
                    System.out.println("Categoria: ");
                }
                libro[i][j] = Leer.dato();
            }
        }
    }
    public void mostrar(){
        System.out.println("BIBLIOTECA: " + getNombre());
        System.out.println("Libros disponibles: " + getNrolibros());
        System.out.println("Titulo:     Categoría:");
        for (int i =0; i < getNrolibros();i++){
            System.out.println(libro[i][0] + "  "+libro[i][1]);
        }
    }
    
    public static void main(String[] args){
        Biblioteca b1 = new Biblioteca();
        b1.mostrar();
    }
    
    
}
