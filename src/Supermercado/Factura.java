/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Supermercado;

/**
 *
 * @author Andrés Aquin
 */
public class Factura extends Comprobante {

    private double total;
    private Cliente clientes;
    private Producto[] productos;

    public Factura(char t, int n, Fecha f, Cliente c, Producto[] p) {
        super(t, n, f);
        this.clientes = c;
        productos = p;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void agregarProducto(Producto p, int pos) {
        productos[pos] = p;
        setTotal(getTotal() + p.getPrecio());
    }

    public void mostrarProductos() {
        for (int i = 1; i <= 2; i++) {
            System.out.print("\t" + productos[i].getCodigo());
            System.out.print("\t" + productos[i].getDescripcion());
            System.out.println("\t" + productos[i].getPrecio());
        }
    }

    public void mostrarFactura() {
        System.out.println("Tipo: " + getTipo() + " Numero: " + getNumero()
                + " Fecha: " + getFecha().getDia() + "/" + getFecha().getMes() + "/" + getFecha().getAnio());
                //Accedemos a getDia solo porque existe una relacion de agregacion de Fecha a Comprobante
        System.out.println("CI: " + clientes.getCi() + "\nNombres: " + clientes.getNombre());
        System.out.println("Detalle de productos");
        mostrarProductos();
        System.out.println("\n\t\tTotal: " +"\t"+ getTotal());
    }
    
}
