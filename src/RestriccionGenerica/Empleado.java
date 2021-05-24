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
public class Empleado <T extends Number> {
    private int id;
    private String nombre;
    private T sueldo; //(Integer, float, double, byte, long)
    
    public Empleado(){
        super();
    }
    Empleado(int c, String nom, T s){
        id = c;
        nombre = nom;
        sueldo = s;
    }
    public void mostrar(){
        System.out.println("Codigo de identificacion: "+getId());
        System.out.println("Mi nombre es: "+getNombre());
        System.out.println(" Sueldo: "+getSueldo());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
