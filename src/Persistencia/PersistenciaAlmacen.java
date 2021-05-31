/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Andrés Aquin
 */
public class PersistenciaAlmacen extends Almacen {

    public PersistenciaAlmacen() {
        super();
    }

    public void guardar(Almacen a1) {
        try {
            ObjectOutputStream w1 = new ObjectOutputStream(new FileOutputStream("Almacen.dat"));
            w1.writeObject(w1);
            w1.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public Almacen recuperar() throws IOException, ClassNotFoundException {
        ObjectInputStream r1 = new ObjectInputStream(new FileInputStream("Almacen.dat"));
        Almacen a1 = (Almacen) r1.readObject();
        r1.close();
        return (a1);
    }
}
