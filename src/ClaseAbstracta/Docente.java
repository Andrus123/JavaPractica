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
    abstract public double obtenerSueldo();

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getaIngreso() {
        return aIngreso;
    }

    public void setaIngreso(int aIngreso) {
        this.aIngreso = aIngreso;
    }
    public void mostrar(){
        System.out.println("CI: "+getCi());
        System.out.println("Nombres y Apellidos: "+getNombres()+" "+getApellidos());
        System.out.println("Anio de ingreso: " + getaIngreso());
    }
    
}
