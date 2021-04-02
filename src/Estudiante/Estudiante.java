/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiante;

/**
 *
 * @author andru
 */
public class Estudiante {
    private String nombres;
    private int nota;

    public Estudiante() {
        this.nombres = "";
        this.nota = 0;
    }

    public Estudiante(String nom, int nota) {
        this.nombres = nom;
        this.nota = nota;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void mostrar() {
        System.out.println("Nombres: " + getNombres());
        System.out.println("Nota: " + getNota());
    }
    public void leer(){
        System.out.println("Nombre del tercer estudiante:");
          this.nombres = Leer.dato();
        System.out.println("Nota del tercer estudiante:");
          this.nota = Leer.datoInt();
    }
    public void maxNota(Estudiante x, Estudiante y){
        int maxn = 0;
        if(x.getNota()> y.getNota()){
            System.out.println(x.getNombres()+" Tiene mas nota con "+ x.getNota());
        }
            System.out.println(y.getNombres()+" Tiene mas nota con "+ y.getNota());
    }
    
    public static void maxmin(Estudiante[] ests){
        int maxn = 0;  
        String nmax = ""; 
       for(int i = 0; i < ests.length; i++){
           if (ests[i].getNota()> maxn){
               maxn = ests[i].getNota();
               nmax = ests[i].getNombres();
           }
       }
       System.out.println("El Estudiante con mayor nota es: " + nmax + " con " + maxn + " puntos");
       int minn = ests[0].getNota();  
       String nmin = "";
       for(int i = 0; i < ests.length; i++){
           if (ests[i].getNota()< minn){
               minn = ests[i].getNota();
               nmin = ests[i].getNombres();
           }
       }
       System.out.println("El Estudiante con menos nota es: " + nmin + " con " + minn + " puntos");

    }

    public static void reprobados(Estudiante[] ests) {
        System.out.println("Lista de datos");
        for (int i = 0; i < ests.length; i++) {
            System.out.println(ests[i].getNombres() + " " + ests[i].getNota());
            if(ests[i].getNota()<51){
                System.out.println
       ("Estudiante "+ ests[i].getNombres()+ " reprobó con "+ ests[i].getNota());
            }
        }
    }
}
