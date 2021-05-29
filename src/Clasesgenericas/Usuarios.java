/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesgenericas;

/**
 *
 * @author Andrés Aquin
 */
public class Usuarios {
    private String nombre;
    private String correo;
    private String username;
    
    public Usuarios(){
        this.nombre = "Andres Aquin";
        this.correo = "andykee@gmail.com";
        this.username = "andrus";
    }

    public Usuarios(String nombre, String correo, String username) {
        this.nombre = nombre;
        this.correo = correo;
        this.username = username;
    }
    
    public void mostrar(){
        System.out.println("\nUsuario: "+getNombre());
        System.out.println("Correo: "+getCorreo());
        System.out.println("Username: "+getUsername());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
