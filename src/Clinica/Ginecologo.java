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
public class Ginecologo extends Medico {

    private int contrPre;

    public Ginecologo() {
        super();
        this.contrPre = 0;
    }

    public Ginecologo(String n, int ci, int rm, int contrPre) {
        super(n, ci, rm);
        this.contrPre = contrPre;
    }

    public int getContrPre() {
        return contrPre;
    }

    public void setContrPre(int contrPre) {
        this.contrPre = contrPre;
    }

    public void leer() {
        super.leer();
        System.out.println("Control prenatal: ");
        setContrPre(Leer.datoInt());
    }
    public void mostrar() {
        super.mostrar();
        System.out.println("Control prenatal: "+ getContrPre());
    }
}
