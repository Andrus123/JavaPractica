/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.io.Serializable;

/**
 *
 * @author Andrés Aquin
 */
public class Computadora implements Serializable{
    private int cod;
    private String marca;
    private float precio;

    public Computadora(int cod, String marca, float precio) {
        this.cod = cod;
        this.marca = marca;
        this.precio = precio;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
