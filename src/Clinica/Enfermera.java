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
public class Enfermera extends Persona {

    private String turno;

    public Enfermera() {
        super();
        this.turno = "";
    }

    public Enfermera(String n, int ci, String turno) {
        super(n, ci);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void leer() {
        super.leer();
        System.out.println("Turno: ");
        setTurno(Leer.dato());
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Turno: " + getTurno());
    }

}
