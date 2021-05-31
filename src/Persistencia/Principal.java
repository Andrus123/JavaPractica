/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.io.IOException;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {

    public static void main(String[] args) {
        try {
            PersistenciaAlmacen op1 = new PersistenciaAlmacen();
            Almacen a1 = new Almacen();
            a1.setNombre("'PRECIO ECONOMICO'");
            Producto p1 = new Producto(100, "Yogurt", "Lacteos", 24);
            Producto p2 = new Producto(200, "Leche", "Lacteos", 6.9f);
            Producto p3 = new Producto(300, "Vino tinto", "Bebidas", 14);
            a1.addProducto(p1);
            a1.addProducto(p2);
            a1.addProducto(p3);

            //Guarda Informacion del estado del objeto
            op1.guardar(a1);
            System.out.println("Datos guardados con EXITO");

            System.out.println("Recuperando datos del ARCHIVO");
            Almacen a2 = op1.recuperar();
            System.out.println(a2.getNombre());
            a2.listar();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
