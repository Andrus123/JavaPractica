/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPOO;

import CajaAhorro.Leer;

/**
 *
 * @author andru
 */
public class Docente {

    private int ci;
    private int item;
    private String nombres;
    private Double sueldo;
    private int nromat;
    private String[][] materia = new String[10][2];

    public Docente() {
        this.ci = 12456;
        this.item = 254;
        this.nombres = "Jordan Peterson";
        this.sueldo = 45700.50;
        this.nromat = 2;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                materia[i][j] = "";
            }
        }
    }

    public Docente(int ci, int item, String nombres, Double sueldo, int nromat) {
        this.ci = ci;
        this.item = item;
        this.nombres = nombres;
        this.sueldo = sueldo;
        this.nromat = nromat;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                materia[i][j] = "";
            }
        }
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNromat() {
        return nromat;
    }

    public void setNromat(int nromat) {
        this.nromat = nromat;
    }

    public String[][] getMateria() {
        return materia;
    }
    public String getMateria(int i, int j){
        return materia[i][j];
    }
    public void setMateria(String[][] materia){
        this.materia = materia;
    }
    public void setMateria(String m, int i, int j){
        this.materia[i][j] = m;
    }
    
    
    public void leer(){
        System.out.println("CI: ");
        this.ci = Leer.datoInt();
        System.out.println("Item: ");
        this.item = Leer.datoInt();
        System.out.println("Nombres: ");
        this.nombres = Leer.dato();
        System.out.println("Numero de materias: ");
        this.nromat = Leer.datoInt();
        System.out.println("Sueldo: ");
        this.sueldo = Leer.datoDouble();
        for (int i = 0; i < getNromat() ; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.println("Ci: ");
                }
                if (j == 1) {
                    System.out.println("Nombre de la materia: ");
                }
                materia[i][j] = Leer.dato();
            }
        }
    }
    public void mostrar(){
        System.out.println("Ci: "+ getCi());
        System.out.println("Item: "+ getItem());
        System.out.println("Nombre: "+ getNombres());
        System.out.println("Sueldo: "+ getSueldo());
        System.out.println("Número de materias: "+ getNromat());
        for (int i = 0; i< getNromat();i++){
            System.out.println(getMateria(i,0) + " " + getMateria(i,1));
        }
    }
    
    public void mostrarD(Docente a){
        System.out.println("Ingrese el Nombre del docente: ");
        String x = Leer.dato();
        if(x.equals(nombres)){
            a.mostrar();
        }
        else{
            System.out.println("El nombre ingresado no está registrado");
        }
    }
    
    public static void main(String[] args){
        Docente d1 = new Docente();
        Docente d2 = new Docente();
        d1.leer();
        d1.mostrar();
        d2.leer();
        d1.mostrarD(d1);
        d2.mostrarD(d2);
    }
}
