/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Andrés Aquin
 */
public class PersistenciaFactura extends Factura{
    
    public PersistenciaFactura(int dia, int mes, int anio, int ci, String nombre, Computadora[] c) {
        super(dia, mes, anio, ci, nombre, c);
    }
    
    public void guardar(Factura f1){
        try {
            ObjectOutputStream w1 = new ObjectOutputStream(new FileOutputStream("Factura.dat"));
            w1.writeObject(f1);
            w1.close();
        } catch (Exception e) {
            System.out.println("Error: "+ e);
        }
    }
    
    public Factura recuperar() throws IOException, ClassNotFoundException{
        ObjectInputStream r1 = new ObjectInputStream(new FileInputStream("Factura.dat"));
        Factura f1 = (Factura) r1.readObject();
        r1.close();
        return (f1);
    }
}
