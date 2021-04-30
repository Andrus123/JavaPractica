/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseAbstracta;

/**
 *
 * @author Andrés Aquin
 */
abstract class Docente {
    protected int ci;
    protected String nombres;
    protected String apellidos;
    protected int aIngreso;
    
    public Docente(){
        this.ci = 1235;
        this.nombres = "Peter Pepe";
        this.apellidos = "Parker Pilar";
        this.aIngreso = 2020;
    }

    public Docente(int ci, String nombres, String apellidos, int aIngreso) {
        this.ci = ci;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.aIngreso = aIngreso;
    }
    
}
