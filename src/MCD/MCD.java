/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MCD;

import java.util.Scanner;

/**
 *
 * @author andru
 */
public class MCD {

    private int a, b;

    public MCD() {
        this.a = 0;
        this.b = 0;
    }

    public MCD(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void mostrar() {
        System.out.println(a);
    }

    public void leer() {
        System.out.println("Valor para a:  ");
        setA(new Scanner(System.in).nextInt());
        System.out.println("Valor para b:  ");
        setB(new Scanner(System.in).nextInt());
    }

    public void mcd() {
        while (a != b) {
            if (a > b) {
                setA(a - b);//a=a-b;
            } else {
                setB(b - a);
            }
        }
    }
}
