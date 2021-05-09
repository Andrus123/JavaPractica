/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseAbstracta;

import java.util.Calendar;

/**
 *
 * @author Andrés Aquin
 */
public class Titular extends Docente {

    private double sueldoBase;

    public Titular() {
        super();
        this.sueldoBase = 5000;
    }

    public Titular(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Titular(int ci, String nombres, String apellidos, int aIngreso, double sueldoBase) {
        super(ci, nombres, apellidos, aIngreso);
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double obtenerSueldo() {
        Calendar anio = Calendar.getInstance();
        int aActual = anio.get(Calendar.YEAR);
        int a = aActual - getaIngreso(); //Años de antiguedad
        if (a < 2) {
            return sueldoBase;
        } else if (a >= 2 && a <= 3) {
            return (getSueldoBase() * 0.05) + sueldoBase;
        } else if (a >= 4 && a <= 7) {
            return (getSueldoBase() * 0.10) + sueldoBase;
        } else if (a >= 8 && a <= 15) {
            return (getSueldoBase() * 0.15) + sueldoBase;
        } else {
            return (getSueldoBase() * 0.20) + sueldoBase;
        }
    }
    @Override
    public void mostrar(){
        System.out.println("Salario: "+ obtenerSueldo());
    }

}
