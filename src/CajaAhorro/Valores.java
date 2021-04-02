/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajaAhorro;

/**
 *
 * @author andru
 */
public class Valores {

// j) Crear una clase Valores con los atributos:
    
    private int numCuenta;
    private int cantidad;
    private String tipoBono;
    private int precioUni;
    private String fechaVenc;
    private int tazaRend;
    private int montoDep;
    private int montoCobrar;

    public Valores() {
        numCuenta = 0;
        cantidad = 0;
        tipoBono = "";
        precioUni = 0;
        fechaVenc = "";
        tazaRend = 0;
        montoDep = 0;
        montoCobrar = 0;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoBono() {
        return tipoBono;
    }

    public void setTipoBono(String tipoBono) {
        this.tipoBono = tipoBono;
    }

    public int getPrecioUni() {
        return precioUni;
    }

    public void setPrecioUni(int precioUni) {
        this.precioUni = precioUni;
    }

    public String getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public int getTazaRend() {
        return tazaRend;
    }

    public void setTazaRend(int tazaRend) {
        this.tazaRend = tazaRend;
    }

    public int getMontoDep() {
        return montoDep;
    }

    public void setMontoDep(int montoDep) {
        this.montoDep = montoDep;
    }

    public int getMontoCobrar() {
        return montoCobrar;
    }

    public void setMontoCobrar(int montoCobrar) {
        this.montoCobrar = montoCobrar;
    }
    //Los siguientes metodos los usamos en cajaAhorro apartado k)
    //De esta forma podemos crear un metodo que utiliza dos clases para comprar 
    // valores del banco
    
    public void leer() {
        System.out.println("Cantidad: ");
        setCantidad(Leer.datoInt());
        System.out.println("Tipo de Valor: ");
        setTipoBono(Leer.dato());
        System.out.println("Precio Unitario: ");
        setPrecioUni(Leer.datoInt());
        System.out.println("Fecha de Vencimiento: ");
        setFechaVenc(Leer.dato());
        System.out.println("Taza de rendimiento: ");
        setTazaRend(Leer.datoInt());
    }
    
    public void mostrar() {
        System.out.println("Numero de cuenta: " + getNumCuenta());
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Tipo de Valor: " + getTipoBono());
        System.out.println("Precio Unitario: " + getPrecioUni());
        System.out.println("Fecha de vencimiento: " + getFechaVenc());
        System.out.println("Taza de rendimiento: " + getTazaRend());
        System.out.println("Monto depositado: " + getMontoDep());
        System.out.println("Monto a cobrar: " + getMontoCobrar());
    }

    public void calcular() {
        setMontoDep(cantidad * precioUni);
        setMontoCobrar(getMontoDep() + getMontoDep() * getTazaRend() / 100);
    }
}
