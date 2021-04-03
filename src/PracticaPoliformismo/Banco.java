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
public class Banco {
    private int ci;
    private String paterno;
    private String materno;
    private String nombres;
    private Double saldo;
    
    public Banco(){
        this.ci = 10014246;
        this.paterno = "Aquin";
        this.materno = "Flores";
        this.nombres = "Andres Kadir";
        this.saldo = 5600.50;
    }

    public Banco(int ci, String paterno) {
        this.ci = ci;
        this.paterno = paterno;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void leer(){
        System.out.println("Ingrese el ci: ");
        this.ci = Leer.datoInt();
        System.out.println("Ingrese apellido paterno");
        this.paterno = Leer.dato();
        System.out.println("Ingrese apellido madterno ");
        this.materno = Leer.dato();
        System.out.println("Ingrese nombres");
        this.nombres = Leer.dato();
        System.out.println("Ingrese saldo: ");
        this.saldo = Leer.datoDouble();
    }
    public void mostrar(){
        System.out.println("ci: " + getCi());
        System.out.println("Cliente: " + getPaterno()+" "+getMaterno()+" "+getNombres());
        System.out.println("Saldo: " + getSaldo());
    }
    public void cliente(){
        System.out.println("Ingrese el ci: ");
        ci = Leer.datoInt();
        System.out.println("Ingrese el saldo: ");
        saldo = Leer.datoDouble();
        System.out.println("NUEVO CLIENTE: Ci "+getCi()+" Saldo "+getSaldo());
    }
    
    public static void buscar(Banco x, Banco y, Banco z){
        System.out.println("Ingrese ci para buscar en la base de datos: ");
        int c = Leer.datoInt();
        if(c == x.ci){
            x.mostrar();
        }
        else if(c == y.ci){
            y.mostrar();
        }
        else if(c == z.ci){
            z.mostrar();
        }
        else{
            System.out.println("El ci ingresado no se encuentra registrado");
        }
    }
    
    public static void main(String[] args){
        Banco c1 = new Banco();
        Banco c2 = new Banco(12357, "Quiroga");
        Banco c3 = new Banco();
        c1.mostrar();
        c2.leer();
        c2.mostrar();
        c3.cliente();
        buscar(c1,c2,c3);
    }
}
