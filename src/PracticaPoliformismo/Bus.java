/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPoliformismo;

import Estudiante.Leer;

/**
 *
 * @author andru
 */
public class Bus {
    private String nombus;
    private int nropasajeros;
    private String[][] pasajero = new String [50][3];
    
    public Bus(){
        this.nombus = "Bolivar";
        this.nropasajeros = 7;
        this.pasajero[0][0] = "Jhona";   this.pasajero[0][1] = "22905136"; 
        this.pasajero[1][0] = "Fabiana"; this.pasajero[1][1] = "33557797";  
        this.pasajero[2][0] = "Andres";  this.pasajero[2][1] = "10014246"; 
        this.pasajero[3][0] = "Totto";   this.pasajero[3][1] = "56789533"; 
        this.pasajero[4][0] = "Chris";   this.pasajero[4][1] = "11456775"; 
        this.pasajero[5][0] = "Oscar";   this.pasajero[5][1] = "24566787"; 
        this.pasajero[6][0] = "Emo";     this.pasajero[6][1] = "45678865"; 
    }

    public Bus(String nombus, int nropasajeros) {
        this.nombus = nombus;
        this.nropasajeros = nropasajeros;
    }

    public String getNombus() {
        return nombus;
    }

    public void setNombus(String nombus) {
        this.nombus = nombus;
    }

    public int getNropasajeros() {
        return nropasajeros;
    }

    public void setNropasajeros(int nropasajeros) {
        this.nropasajeros = nropasajeros;
    }

    public String[][] getPasajero() {
        return pasajero;
    }

    public void setPasajero(String[][] pasajero) {
        this.pasajero = pasajero;
    }
    public String getPasajero(int i, int j){
        return pasajero[i][j];
    }
    public void leer(){
        System.out.println("BUS: ");
        this.nombus = Leer.dato();
        System.out.println("Nro de Pasajeros: ");
        this.nropasajeros = Leer.datoInt();
        for (int i=0; i<getNropasajeros(); i++){
            for (int j=0; j<3; j++){
                if (j == 0) {
                    System.out.println("Nombre: ");
                }
                if (j == 1) {
                    System.out.println("CI: ");
                }
                pasajero[i][j] = Leer.dato();
            }
        }
    }
    public void mostrar(String x){
        for (int i = 0; i < getNropasajeros(); i++){
            if(x.equals(pasajero[i][0])){
                mostrar();
            }
        }
    }
    public void mostrar(){
        System.out.println("BUS: "+ this.getNombus());
        System.out.println("Nro de Pasajeros: "+ this.getNropasajeros());
        for (int i = 0; i < getNropasajeros(); i++){
            System.out.println(getPasajero(i,0) + " " + getPasajero(i,1));
        }
    }
    public void ordenar(){
        for(int i = 0; i< getNropasajeros(); i++){
            for(int j = 0;j<getNropasajeros()&& i!=j;j++){
                if(pasajero[i][1].compareToIgnoreCase(pasajero[j][1])<0){
                    //Para el nombre
                    String aux = pasajero[i][0];
                    pasajero[i][0] = pasajero[j][0];
                    pasajero[j][0] = aux;
                    //Para el CI
                    String aux1 = pasajero[i][1];
                    pasajero[i][1] = pasajero[j][1];
                    pasajero[j][1] =aux1;
                }
            }
        }   
    }
    
    public static void main(String[] args){
        Bus b1 = new Bus();
        Bus b2 = new Bus("Copacabana",3);
        Bus b3 = new Bus("Dorado",3);
        
        b1.mostrar();
        System.out.println("VERIFICANDO PASAJERO");
        b1.mostrar("Andres");
        b1.ordenar();
        System.out.println("BUS ORDENADO:");
        b1.mostrar();
    }
    
}
