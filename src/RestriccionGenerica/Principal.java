/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestriccionGenerica;

/**
 *
 * @author Andrés Aquin
 */
public class Principal {
    public static void main(String[] args) {
        Empleado<Integer> e1 = new Empleado<Integer>(100,"ana",45);
        e1.setId(100);
        e1.setNombre("Carlos");
        e1.setSueldo(5777);
        e1.mostrar();
        
        Empleado<Double> e2 = new Empleado<>(100,"ana",45.9);
        e2.setId(200);
        e2.setNombre("Ana");
        e2.setSueldo(576.89);
        e2.mostrar();
        
        Empleado<Float> e3 = new Empleado<>(100,"ana",45.0f);
        e3.setId(300);
        e3.setNombre("Sandra");
        e3.setSueldo(5786.45f);
        e3.mostrar();
        
        Empleado<Long> e4 = new Empleado<>();
        e4.setId(400);
        e4.setNombre("Susana");
        e4.setSueldo(Long.MAX_VALUE);
        e4.mostrar();
        
        Empleado<Byte> e5 = new Empleado<>();
        e5.setId(500);
        e5.setNombre("Sandra");
        e5.setSueldo((byte)23);
        e5.mostrar();
        System.out.println("id: "+e5.getId()+" Nombre: "
                +e5.getNombre()+" Sueldo: "+e5.getSueldo());
    }
}
