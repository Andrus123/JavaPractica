/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificioUniversitario;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Aquin
 */
public class EdificioUniversitario {

    private String nombre;
    private int np;
    private Piso[] pisos;

    public EdificioUniversitario() {
        this.nombre = "";
        this.np = 10;
        pisos = new Piso[np + 1];
        for (int i = 1; i <= np; i++) {
            pisos[i] = new Piso();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }

    public void leer() {
        String nomU = JOptionPane.showInputDialog("Nombre del edificio Universitario:", "UMSA");
        setNombre(nomU);
        setNp(Integer.parseInt(JOptionPane.showInputDialog("Numero de pisos", "1")));
        for (int i = 0; i <= getNp(); i++) {
            System.out.print("Piso: " + i);
            pisos[i].leer();
        }
    }

    public void mostrar() {
        System.out.println("Nombre del edificio Universitario: " + getNombre());
        for (int i = 0; i <= getNp(); i++) {
            System.out.print("Piso: " + i);
            pisos[i].mostrar();
        }
    }

}
