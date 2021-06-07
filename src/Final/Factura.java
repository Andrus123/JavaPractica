/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author Andrés Aquin
 */
public class Factura extends Comprobante{
    protected float total;
    protected Cliente clientes;
    protected Computadora[] computadoras;
    protected int nrocomputadoras;

    public Factura(int dia, int mes, int anio, int ci, String nombre,Computadora[]c) {
        super(dia, mes, anio);
        this.total = total;
        this.clientes = new Cliente(ci, nombre);
        this.computadoras = c;
        this.nrocomputadoras = 0;
    }
    
    public void agregarComputadora(Computadora c){
        computadoras[nrocomputadoras] = c;
        nrocomputadoras++;
        setTotal(getTotal()+ c.getPrecio());
    }
    
    public void mostrarComputadora(){
        for (int i = 0; i < getNrocomputadoras(); i++) {
            System.out.print("\t" + computadoras[i].getCod());
            System.out.print("\t" + computadoras[i].getMarca());
            System.out.println("\t" + computadoras[i].getPrecio());
        }
    }
    
    public void mostrarFactura(){
        System.out.println(
                " Fecha: " + getFecha().getDia() + "/" + getFecha().getMes() + "/" + getFecha().getAnio());
                //Accedemos a getDia solo porque existe una relacion de agregacion de Fecha a Comprobante
        System.out.println("CI: " + clientes.getCi() + "\nNombres: " + clientes.getNombres());
        System.out.println("Detalle de productos");
        mostrarComputadora();
        System.out.println("\n\t\tTotal: " +"\t"+ getTotal());
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Computadora[] getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(Computadora[] computadoras) {
        this.computadoras = computadoras;
    }

    public int getNrocomputadoras() {
        return nrocomputadoras;
    }

    public void setNrocomputadoras(int nrocomputadoras) {
        this.nrocomputadoras = nrocomputadoras;
    }
    
    
}
