/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

import Estudiante.Leer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andru
 */
public class Departamento extends Casa {

    private int nHabitaciones;
    private ArrayList<Departamento>deptos;

    public Departamento() {
        super();
        this.nHabitaciones = 0;
        deptos = new ArrayList<>();
    }

    public Departamento(int np, int nv, String c, int nh) {
        super(np, nv, c);
        this.nHabitaciones = nh;
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Nro. Habitaciones: " + getnHabitaciones());
    }

    @Override
    public void leer() {
        super.leer();
        System.out.println("Nro Habitaciones: ");
        setnHabitaciones(Leer.datoInt());
    }
    //b)
    public boolean minHabitaciones(Departamento d2) {
        return (this.getnHabitaciones() < d2.getnHabitaciones());
    }
    
    public void crearArrayDeptos(){
        String sw = "s";
        do{
            System.out.println("Color: ");
            String c = Leer.dato();
            deptos.add(new Departamento((int)(Math.random()*10),(int)(Math.random()*10),c,(int)(Math.random()*10)));
            System.out.println("Continuar? s/n");
            sw = (new Scanner(System.in).next());
        }while (sw.equals("s"));
    }
    
    public void mostrarArrayDeptos(){
        for(int i = 0; i < deptos.size(); i++){
            deptos.get(i).mostrar();
        }
    }
    public void maxMinDeptos(){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Departamento[] dep = new Departamento[2];
        for(int i = 0; i < deptos.size(); i++){
            if(deptos.get(i).getnHabitaciones()>max){
                max = deptos.get(i).getnHabitaciones();
                dep[0] = deptos.get(i);
            }
            if (deptos.get(i).getnHabitaciones()<min){
                min = deptos.get(i).getnHabitaciones();
                dep[1] = deptos.get(i);
            }
        }
        System.out.println("Departamento con MAX Habi.");
        dep[0].mostrar();
        System.out.println("Departamento con MIN Hab.");
        dep[1].mostrar();
    }
}
