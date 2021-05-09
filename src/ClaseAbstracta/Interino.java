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
public class Interino extends Docente{
    private int diasTrabajados;
    private double sueldoPorDia;
    
    public Interino(){
        super();
        this.diasTrabajados=0;
        this.sueldoPorDia=500;
    }

    public Interino(int diasTrabajados, double sueldoPorDia) {
        this.diasTrabajados = diasTrabajados;
        this.sueldoPorDia = sueldoPorDia;
    }

    public Interino(int ci, String nombres, String apellidos, int aIngreso,int diasTrabajados, double sueldoPorDia) {
        super(ci, nombres, apellidos, aIngreso);
        this.diasTrabajados = diasTrabajados;
        this.sueldoPorDia = sueldoPorDia;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public double getSueldoPorDia() {
        return sueldoPorDia;
    }

    public void setSueldoPorDia(double sueldoPorDia) {
        this.sueldoPorDia = sueldoPorDia;
    }
    
    @Override
    public double obtenerSueldo(){
        return getDiasTrabajados() * getSueldoPorDia();
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Salario: "+obtenerSueldo());
    }
    
}
