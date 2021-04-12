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
public class Traumatologo extends Medico{
    private String lesion;
    
    public Traumatologo(){
        super();
        this.lesion = "";
    }
    public Traumatologo(String n, int ci, int rm, String lesion){
        super(n, ci, rm);
        this.lesion = lesion;
    }

    public String getLesion() {
        return lesion;
    }

    public void setLesion(String lesion) {
        this.lesion = lesion;
    }
    public void leer(){
        super.leer();
        System.out.println("Tipo de lesion: ");
        setLesion(Leer.dato());
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Tipo de lesion: " + getLesion());
    }
}
