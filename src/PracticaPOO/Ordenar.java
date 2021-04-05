/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPOO;

/**
 *
 * @author andru
 */
public class Ordenar {

    private int nropasajeros;
    private String[] pasajero = new String[10];

    public Ordenar() {
        this.nropasajeros = 9;
        this.pasajero[0] = "Jhona";
        this.pasajero[1] = "Fabri";
        this.pasajero[2] = "Marcelo";
        this.pasajero[3] = "Totto";
        this.pasajero[4] = "Chris";
        this.pasajero[5] = "Oscar";
        this.pasajero[6] = "Emo";
        this.pasajero[7] = "Andres";
        this.pasajero[8] = "Carlo";
    }

    public Ordenar(int nropasajeros) {
        this.nropasajeros = nropasajeros;
    }

    public int getNropasajeros() {
        return nropasajeros;
    }

    public void setNropasajeros(int nropasajeros) {
        this.nropasajeros = nropasajeros;
    }

    public String[] getPasajero() {
        return pasajero;
    }

    public void setPasajero(String[] pasajero) {
        this.pasajero = pasajero;
    }

    public String getPasajero(int i) {
        return pasajero[i];
    }

    public void mostrar() {
        for (int i = 0; i < getNropasajeros(); i++) {
            System.out.println(getPasajero(i));
        }
    }

    public void ordenar() {
        for (int i = 0; i < getNropasajeros(); i++){
            for(int j = 0;j<getNropasajeros() && i!=j;j++){
                if(pasajero[i].compareToIgnoreCase(pasajero[j])<0){
                    String aux = pasajero[i];
                    pasajero[i] = pasajero[j];
                    pasajero[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Ordenar o1 = new Ordenar();
        System.out.println("SIN ORDENAR: ");
        o1.mostrar();
        System.out.println("ORDENADO: ");
        o1.ordenar();
        o1.mostrar();
    }
}
