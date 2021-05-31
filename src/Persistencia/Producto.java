/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

/**
 *
 * @author Andrés Aquin
 */
public class Producto {
    private int codigo;
    private String nombre;
    private String tipo;
    private float precio;
    
    public Producto(){
        this.codigo = 213;
        this.nombre = "";
        this.tipo = "";
        this.precio = 0;
    }

    public Producto(int codigo, String nombre, String tipo, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    
}
