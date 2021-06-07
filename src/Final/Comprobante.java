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
public class Comprobante {
    protected Fecha fecha;

    public Comprobante(int dia, int mes, int anio) {
        fecha = new Fecha(dia, mes, anio);
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
}
