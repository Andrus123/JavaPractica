/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

/**
 *
 * @author andru
 */
public class Producto {

    private int codigo;
    private String descr;
    private float precio;

    public Producto() {
        this.codigo = 0;
        this.descr = "";
        this.precio = 0;
    }

    public Producto(int c, String d) {
        this.codigo = c;
        this.descr = d;
        this.precio=100.56f;
    }

    public Producto(int c, String d, float p) {
        this.codigo = c;
        this.descr = d;
        this.precio = p; //ESTAMOS SOBRECARGANDO EL CONSTRUCTOR DE ACUERDO AL NUMERO DE PARAMETROS
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void mostrar(){
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Descripcion del producto: " + this.getDescr());
        System.out.println("Precio: " + this.getPrecio());
    }
}
