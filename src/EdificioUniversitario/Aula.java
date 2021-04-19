/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificioUniversitario;

import Clinica.Leer;

/**
 *
 * @author Andrés Aquin
 */
public class Aula {
    private String nom;
    private int cap;

    public Aula() {
        this.nom = "";
        this.cap = 60;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }
    public void leer(){
        System.out.println("Nombre de aula: ");
        setNom(Leer.dato());
        System.out.println("Capacidad del aula: ");
        setCap(Leer.datoInt());
    }
    
    public void mostrar(){
        System.out.println("Nombre del aula: " +getNom());
        System.out.println("Capacidad del aula: " +getCap());
    }
    
    
}
