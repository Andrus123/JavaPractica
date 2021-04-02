/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaPOO;

import Estudiante.Leer;

/**
 *
 * @author andru
 */
public class Racional {
    private int x;
    private int y;

    public Racional(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Racional(){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void asignaNumerador(int x){
        System.out.println("Ingrese el Numerador");
        this.x = Leer.datoInt();
    }
    public void asignaDenominador(int y){
        System.out.println("Ingrese el Denominador");
        this.y = Leer.datoInt();
    }
    public void imprimir(){
        System.out.println(x+"/"+y+" = "+x/y);
    }
    public void suma(Racional b){
        System.out.println((x+"/"+y)+" + "+ (b.x+"/"+b.y)+" = "+((x/y)+(b.x/b.y)));
    }
    public void resta(Racional b){
        System.out.println((x+"/"+y)+" - "+ (b.x+"/"+b.y)+" = "+((x/y)-(b.x/b.y)));
    }
    public void producto(Racional b){
        System.out.println((x+"/"+y)+" * "+ (b.x+"/"+b.y)+" = "+((x/y)*(b.x/b.y)));
    }
    public void division(Racional b){
        System.out.println((x+"/"+y)+" / "+ (b.x+"/"+b.y)+" = "+((x/y)/(b.x/b.y)));
    }
    public boolean esIgual(Racional b){
        if((x/y)==(b.x/b.y)){
        System.out.println((x+"/"+y)+" = "+ (b.x+"/"+b.y)+" = "+"Son iguales");
        return true;
        }else{
        System.out.println((x+"/"+y)+" = "+ (b.x+"/"+b.y)+" = "+"No Son iguales");    
        return false;    
        }
    }
    
    
    public static void main(String[] args){
        Racional a = new Racional();
        Racional b = new Racional();
        
        a.asignaNumerador(7);
        a.asignaDenominador(7);
        b.asignaNumerador(5);
        b.asignaDenominador(7);
        a.imprimir();
        b.imprimir();
        
        a.suma(b);
        a.resta(b);
        a.producto(b);
        a.division(b);
        a.esIgual(b);
    }
}
