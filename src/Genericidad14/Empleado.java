/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericidad14;

import Factura.Leer;
import static java.lang.Float.parseFloat;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Aquin
 */
public class Empleado<V, T> {
    private V id; //(Cadenas, enteros)
    private String nombre;
    private T sueldo; //(Enteros, flotantes)
    
    private int n;
    private Empleado<Integer, Float>[] empleados;
    
    
    public Empleado(){
        this.nombre = "";
        this.n=0;
        empleados=new Empleado[25];
    }
    public Empleado(V i, String nom, T s){
        this.id = i;
        this.nombre = nom;
        this.sueldo = s;
    }
    
    public void mostrar(){
        System.out.println("Codigo de identificacion: "+getId());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Sueldo: "+getSueldo());
    }
    
    public void buscar(Empleado e2, V x){
        if(getId().equals(x)){
            mostrar();
        }else if(e2.getId().equals(x)){
            e2.mostrar();
        }else{
            System.out.println("No existe el EMPLEADO con ese codigo");
        }
    }
    
    public void crearArray(){
        String[] nom = {"Ana", "Sandra", "Juan", "Oscar", "Carlos", "Carmen","Marco", "Jesus","Daisy","Jhon"};
        System.out.println("Numero de empleado: ");
        n=Leer.datoInt();
        for (int i = 0; i < n; i++) {
            empleados[i]=new Empleado<>((int)(Math.random()*100),nom[(int)(Math.random()*10)], (float)(Math.random()*10000));
            empleados[i].mostrar();
        }
    }
    //buscar por sueldo a los empleados
    public void buscarEmpleado(){
        float sueldo = parseFloat(JOptionPane.showInputDialog("Sueldo a buscar", "0"));
        for(int i=0; i<n; i++){
            if(empleados[i].getSueldo().equals(sueldo)){
                empleados[i].mostrar();
            }
        }
    }

    public V getId() {
        return id;
    }

    public void setId(V id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public T getSueldo() {
        return sueldo;
    }

    public void setSueldo(T sueldo) {
        this.sueldo = sueldo;
    }
    
}
