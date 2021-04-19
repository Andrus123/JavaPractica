/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificioUniversitario;

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
             pisos[i]=new Piso();
        }
    }
}
