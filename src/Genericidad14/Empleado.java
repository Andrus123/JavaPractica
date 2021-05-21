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
public class Empleado<V, T> {
    private V id; //(Cadenas, enteros)
    private String nombre;
    private T sueldo; //(Enteros, flotantes)
    
    public Empleado(){
        this.nombre = "";
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
