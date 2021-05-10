/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recibo;

/**
 *
 * @author Andrés Aquin
 */
public class Proveedor {
    private int ci;
    private String nombre;

    public Proveedor(int ci, String nombre) {
        this.ci = ci;
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
