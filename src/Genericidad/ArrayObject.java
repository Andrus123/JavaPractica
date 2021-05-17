/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericidad;

/**
 *
 * @author Andrés Aquin
 */
public class ArrayObject {

    private int n;
    private Object[] v;

    public ArrayObject() {
        this.n = 0;
        v = new Object[87];
    }

    public void adicionar(Object a) {
        n = n + 1;
        v[n] = a;
    }

    public Object obtiene(int i) {
        return (v[i]);
    }

    public boolean esvacia() {
        if (n == 0) {
            return true;
        }
        return false;
    }

    public void eliminar(int i) {
        if (!esvacia()) {
            for (int k = i; k <= n; k++) {
                v[k] = v[k + 1];
            }
            n--;
        }else{
            System.out.println("El ARRAY NO TIENE ELEMENTOS...");
        }
    }
    
    public void mostrar(){
        for (int i = 1; i<=n; i++) {
            System.out.print(v[i] + ", ");
        }
    }
}
