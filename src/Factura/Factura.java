/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

import javax.swing.JOptionPane;

/**
 *
 * @author andru
 */
public class Factura {

    private String fecha;
    private int num;
    private Cliente c1;
    private Producto[] productos;

    public Factura() {
        this.fecha = "";
        c1 = new Cliente();
        productos = new Producto[3];
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void almacenar() {
        System.out.println("C1: ");
        c1.setCi(Leer.datoInt());
        System.out.println("Nombres: ");
        c1.setNombres(Leer.dato());
        System.out.println("NIT: ");
        setNum(Leer.datoInt());
        System.out.println("Fecha: ");
        setFecha(Leer.dato());
        for (int i = 0; i < productos.length; i++) {
            String prod = JOptionPane.showInputDialog(null, "Nombre del producto");
            float pre = Float.parseFloat(JOptionPane.showInputDialog(null, "Precio"));
            productos[i] = new Producto(i, prod, pre);
        }
    }

    public void mostrar() {
        System.out.println("NIT: " + getNum());
        System.out.println("Nombres: " + c1.getNombres());
        System.out.println("Fecha: " + getFecha());
        for (int i = 0; i < productos.length; i++) {
            productos[i].mostrar();
        }
    }

    public void mostrar(int x) {
        if (x < 3) {
            for (int i = 0; i <= x; i++) {
                productos[i].mostrar();
            }
        }
    }

    public void mostrar(String cad) {
        int c = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getDescr().equals(cad)) {
                c += 1;
            }
        }
        System.out.println("Cantidad: " + c);
    }

    public void precioX(float x) {
        float suma=0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getPrecio() == x) {
                suma += productos[i].getPrecio();
            }
        }
        System.out.println("La suma total es: " + suma);
    }
    
    public void precioX(float x, int i, int j){
        float suma = 0;
        for (int ini = i; ini <= j; ini++) {
            if (productos[ini].getPrecio() == x) {
                suma += productos[ini].getPrecio();
            }
        }
        System.out.println("La suma total es: " + suma);
    }
}
