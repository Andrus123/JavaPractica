/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPOO;

import Estudiante.Leer;
import java.util.Arrays;

/**
 *
 * @author andru
 */
public class Buses {
        private String placa;
        private int capacidad;
        private int nropasajeros;
        private String[][] pasajero = new String [50][3];
        
        public Buses(){
            this.placa = "XLN345";
            this.capacidad = 50;
            this.nropasajeros = 9;
            this.pasajero[0][0] = "Jhona";   this.pasajero[0][1] = "Masculino"; this.pasajero[0][2] = "24";
            this.pasajero[1][0] = "Fabri";   this.pasajero[1][1] = "Femenino";  this.pasajero[1][2] = "29";
            this.pasajero[2][0] = "Marcelo"; this.pasajero[2][1] = "Masculino"; this.pasajero[2][2] = "24";
            this.pasajero[3][0] = "Totto";   this.pasajero[3][1] = "Masculino"; this.pasajero[3][2] = "23";
            this.pasajero[4][0] = "Chris";   this.pasajero[4][1] = "Masculino"; this.pasajero[4][2] = "24";
            this.pasajero[5][0] = "Oscar";   this.pasajero[5][1] = "Masculino"; this.pasajero[5][2] = "26";
            this.pasajero[6][0] = "Emo";     this.pasajero[6][1] = "Masculino"; this.pasajero[6][2] = "24";
            this.pasajero[7][0] = "Andres";  this.pasajero[7][1] = "Masculino"; this.pasajero[7][2] = "23";
            this.pasajero[8][0] = "Carlo";   this.pasajero[8][1] = "Masculino"; this.pasajero[8][2] = "25";
        }
        public Buses(String placa, int cap, int np){
            this.placa = placa;
            this.capacidad = cap;
            this.nropasajeros = np;
            this.pasajero[0][0] = "Marco";  this.pasajero[0][1] = "Masculino"; this.pasajero[0][2] = "28";
            this.pasajero[1][0] = "Kelly";  this.pasajero[1][1] = "Femenino";  this.pasajero[1][2] = "23";
        }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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
        System.out.println("PLACA: ");
        this.placa = Leer.dato();
        System.out.println("Capacidad: ");
        this.capacidad = Leer.datoInt();
        System.out.println("Nro de Pasajeros: ");
        this.nropasajeros = Leer.datoInt();
        for (int i=0; i<getNropasajeros(); i++){
            for (int j=0; j<3; j++){
                if (j == 0) {
                    System.out.println("Nombre: ");
                }
                if (j == 1) {
                    System.out.println("Género: ");
                }
                if (j == 2) {
                    System.out.println("Edad: ");
                }
                pasajero[i][j] = Leer.dato();
            }
        }
    }
    public void mostrar(){
        System.out.println("BUS con PLACA: "+ this.getPlaca());
        System.out.println("Capacidad: "+ this.getCapacidad());
        System.out.println("Nro de Pasajeros: "+ this.getNropasajeros());
        for (int i = 0; i < getNropasajeros(); i++){
            System.out.println(getPasajero(i,0) + " " + getPasajero(i,1) + " " + getPasajero(i,2));
        }
    }
    public void mostrar(String x, Buses y){
        int c = 0;
        for(int i = 0; i< getNropasajeros(); i++){
            if (y.getPasajero(i, 0)==x){
                c++;
            }
        }
        if (c>0){
            System.out.println("El pasajero "+x+" se encuentra en el bus:" );
            y.mostrar();
        }
        else{
            System.out.println("El pasajero no se encuentra registrado");
        }
    }
    public void ordenar(){
        for(int i = 0; i< getNropasajeros(); i++){
            for(int j = 0;j<getNropasajeros()&& i!=j;j++){
                if(pasajero[i][0].compareToIgnoreCase(pasajero[j][0])<0){
                    String aux = pasajero[i][0];
                    pasajero[i][0] = pasajero[j][0];
                    pasajero[j][0] = aux;
                    //Para el genero
                    String aux1 = pasajero[i][1];
                    pasajero[i][1] = pasajero[j][1];
                    pasajero[j][1] =aux1;
                    //Para la edad
                    String aux2 = pasajero[i][2];
                    pasajero[i][2] = pasajero[j][2];
                    pasajero[j][2] =aux2;
                }
            }
        }
        
    }
    
    
    public static void main(String[] args){
        Buses b1 = new Buses();
        Buses b2 = new Buses("PLT124",60,3);
        Buses b3 = new Buses("RICK9U",50,3);
        
        b1.mostrar();;
//        b2.leer();
//        b2.mostrar();
//        b3.leer();
//        b3.mostrar();
        
//        b1.mostrar("Susan",b1);
//        b2.mostrar("Cristiano",b2);
//        b3.mostrar("Mauren",b3);
        System.out.println("BUS ORDENADO: ");
        b1.ordenar();
        b1.mostrar();
//        b2.ordenar(b2);
//        b2.mostrar();
//        b3.ordenar(b3);
//        b2.mostrar();
    }
}
