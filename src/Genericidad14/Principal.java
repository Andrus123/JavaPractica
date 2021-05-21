/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericidad14;

/**
 *
 * @author Andrés Aquin
 */
public class Principal<V, T> {

    public static void main(String[] args) {
        Empleado<String, Integer> e2 = new Empleado<>();
        e2.setId("ABC-30982020");
        e2.setNombre("Juan");
        e2.setSueldo(5000);
        e2.mostrar();
        
        Empleado<Integer, Float> e1 = new Empleado<>(100, "Sandra", 6758.78f);
    }
}
