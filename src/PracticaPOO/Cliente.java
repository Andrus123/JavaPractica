/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPOO;

import Estudiante.Leer;

/**
 *
 * @author andru
 */
public class Cliente {
    private int nrocuenta;
    private String nombre;
    private Double monto;
    private String fechadep;
    
    public Cliente(){
        this.nrocuenta = 124567;
        this.nombre = "Juan Perez";
        this.monto = 4500.50;
        this.fechadep = "12/07/2021";
    }
    public Cliente(int nrocuenta, String nombre){
        this.nrocuenta = nrocuenta;
        this.nombre = nombre;
        this.monto = 2000.00;
        this.fechadep = "04/04/2021";
    } 

    public int getNrocuenta() {
        return nrocuenta;
    }

    public void setNrocuenta(int nrocuenta) {
        this.nrocuenta = nrocuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getFechadep() {
        return fechadep;
    }

    public void setFechadep(String fechadep) {
        this.fechadep = fechadep;
    }
    public void leer(){
        System.out.println("Ingrese Nro de Cuenta: ");
        this.nrocuenta = Leer.datoInt();
        System.out.println("Ingrese el Nombre: ");
        this.nombre = Leer.dato();
        System.out.println("Introduzca el Monto: ");
        this.monto = Leer.datoDouble();
        System.out.println("Introduzca la fecha de la transacción");
        this.fechadep = Leer.dato();
    }
    public void mostrar(){
        System.out.println("Nro de Cuenta: " + this.getNrocuenta());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Monto: " + this.getMonto());
        System.out.println("Fecha: " + this.getFechadep());
    }
    
    public void Incremento(){
        this.setMonto(monto + (monto*70)/100);
    }
    public void mostrar(Double x){
        if(this.getMonto()< x){
            System.out.println("Cliente con monto menor a 5000 BS: "+ this.getNombre());
        }
        System.out.println("Cliente con monto mayor a 5000 BS: "+ this.getNombre());
    }
    public void Fecha(String x){
        
    }
    
    public static void main(String[] args){
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        
        //c1.leer();
        c1.mostrar();
        //c2.leer();
        //c2.mostrar();
        //c3.leer();
        //c3.mostrar();
        
        c1.Incremento();
        c1.mostrar();
        
        c2.Incremento();
        c2.mostrar();
        
        c1.mostrar(5000.00);
    }
}
