/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPoliformismo;

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
        this.libro[0][0] = "12 Rules for Live"; this.libro[0][0] = "Autoayuda"; 
        this.libro[1][0] = "Clean Code";        this.libro[0][0] = "Tecnología"; 
        this.libro[2][0] = "Superintelligence"; this.libro[0][0] = "Tecnología"; 
    }

    public Biblioteca(String nombre, int nrolibros) {
        this.nombre = nombre;
        this.nrolibros = nrolibros;
        for (int i=0; i<)
    }
    
    
    
}
