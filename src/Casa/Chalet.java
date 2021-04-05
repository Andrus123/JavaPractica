/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

import CajaAhorro.Leer;

/**
 *
 * @author andru
 */
public class Chalet extends Casa {

    private int mJardin;

    public Chalet() {
        super();
        this.mJardin = 100;
    }

    public Chalet(int np, int nv, String c, int mj) {
        super(np, nv, c);
        this.mJardin = mj;
    }

    public int getmJardin() {
        return mJardin;
    }

    public void setmJardin(int mJardin) {
        this.mJardin = mJardin;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Jardin: " + getmJardin());
    }

    public void leer() {
        super.leer();
        System.out.println("Jardin: ");
        setmJardin(Leer.datoInt());
    }
}
