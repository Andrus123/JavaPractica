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
public class Medico extends Persona {

    protected int regMed;

    public Medico() {
        super();
        this.regMed = 0;
    }

    public Medico(String n, int ci, int regMed) {
        super(n, ci);
        this.regMed = regMed;
    }

    public int getRegMed() {
        return regMed;
    }

    public void setRegMed(int regMed) {
        this.regMed = regMed;
    }

    public void leer() {
        super.leer();
        System.out.println("Registro Medico: ");
        setRegMed(Leer.datoInt());
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Registro Medico: " + getRegMed());
    }
}
