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
public class Comprobante {
    protected char tipo;
    protected int numero;
    protected Fecha fecha;

    public Comprobante(char tipo, int numero,int dia, int mes, int anio) {
        this.tipo = tipo;
        this.numero = numero;
        fecha = new Fecha(dia, mes, anio);
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
}
