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
public class Recibo extends Comprobante{

    private float total;
    private Proveedor proveedor;
    private Mueble[] muebles;
    private int nromuebles;

    public Recibo(int dia, int mes, int anio, int ci, String nombre, Mueble[] m, char t, int num) {
        super(t,num, dia, mes, anio);
        this.total = total;
        this.muebles = m;
        proveedor = new Proveedor(ci,nombre);
        this.nromuebles = 0;
    }
    
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getNromuebles() {
        return nromuebles;
    }

    public void setNromuebles(int nromuebles) {
        this.nromuebles = nromuebles;
    }
    

    public void agregarMueble(Mueble m) {
        muebles[nromuebles] = m;
        nromuebles++;
        setTotal(getTotal() + m.getPrecio());
    }

    public void mostrarMueble() {
        for (int i = 0; i < getNromuebles() ; i++) {
            System.out.print("\t" + muebles[i].getCodigo());
            System.out.print("\t" + muebles[i].getDescripcion());
            System.out.println("\t" + muebles[i].getPrecio());
        }
    }

    public void mostrarRecibo() {
        System.out.println("Tipo: " + getTipo() + " Numero: " + getNumero()
                + " Fecha: " + getFecha().getDia() + "/" + getFecha().getMes() + "/" + getFecha().getAnio());
                //Accedemos a getDia solo porque existe una relacion de agregacion de Fecha a Comprobante
        System.out.println("CI: " + proveedor.getCi() + "\nNombres: " + proveedor.getNombre());
        System.out.println("Detalle de productos");
        mostrarMueble();
        System.out.println("\n\t\tTotal: " +"\t"+ getTotal());
    }
    
}
