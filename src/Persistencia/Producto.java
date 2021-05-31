/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.io.Serializable;

/**
 *
 * @author Andrés Aquin
 */
public class Producto implements Serializable{
    private int codigo;
    private String nombre;
    private String tipo;
    private float precio;

    public Producto(int codigo, String nombre, String tipo, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    public void leer(){
        System.out.println("Codigo");
        setCodigo(Leer.datoInt());
        System.out.println("Nombre Producto: ");
        setNombre(Leer.dato());
        System.out.println("Tipo: ");
        setTipo(Leer.dato());
        System.out.println("Precio");
        setPrecio(Leer.datoFloat());  
    }
    public void mostrar(){
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Producto: "+getNombre());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Precio"+getPrecio());  
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
