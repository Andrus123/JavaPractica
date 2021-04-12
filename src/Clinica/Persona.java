/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica;

/**
 *
 * @author andru
 */
public class Persona {
    protected String nombre;
    protected int ci;
    
    public Persona(){
        this.nombre = "";
        this.ci = 0;
    }

    public Persona(String nombre, int ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
    
    public void leer(){
        System.out.println("Nombre: ");
        setNombre(Leer.dato());
        System.out.println("Carnet de Identidad: ");
        setCi(Leer.datoInt());
    }
    public void mostrar(){
        System.out.println("Nombre: " + getNombre() );
        System.out.println("Carnet de identidad: " + getCi());
    }
}
