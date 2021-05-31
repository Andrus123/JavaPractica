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
public class Almacen implements Serializable{
    protected String nombre;
    protected int cont;
    protected Producto[] productos;

    public Almacen() {
        this.nombre = "";
        this.productos = new Producto[4];
    }
    
    public void addProducto(Producto p1){
        try {
            cont++;
            productos[cont] = p1;  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: "+ e);
        }
    }
    
    public void listar(){
        for (int i = 0; i < productos.length; i++) {
            productos[i].mostrar();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    
    
    
}
