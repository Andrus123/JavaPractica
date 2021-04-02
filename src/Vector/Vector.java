/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vector;

/**
 *
 * @author andru
 */
public class Vector {

    private int dato;

    public Vector() {
        this.dato = 0;
    }

    public Vector(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    public static void Ordenar(Vector[] vctr){
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < vctr.length - 1; i++){
                if (vctr[i].getDato() > vctr[i+1].getDato()){
                    temp = vctr[i].dato;
                    vctr[i].dato = vctr[i + i].dato;
                    vctr[i + 1].dato = temp;
                    sorted = false;
                }
            }
        }
    }
    
    public static void impresion(Vector[] vctr) {
        System.out.println("Lista de datos");
        
        for (int i = 0; i < vctr.length; i++) {
            System.out.println("[" + vctr[i].getDato() + "]");
        }
    }

}
