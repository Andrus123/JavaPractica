/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificioUniversitario;

import Estudiante.Leer;

/**
 *
 * @author Andrés Aquin
 */
public class Piso {
    private int na;
    private Aula[] aulas;
    
    public Piso(){
        this.na=25;
        aulas=new Aula[na + 1]; //Creando el array
        for(int i=1; i<=na;i++){
            aulas[i]=new Aula(); //y en cada posicion i creamos un objeto aula
        }
    }

    public int getNa() {
        return na;
    }

    public void setNa(int na) {
        this.na = na;
    }
    public void leer(){
        System.out.println("Numero de aulas: ");
        setNa(Leer.datoInt());
        for(int i=0;i<=getNa();i++){
            aulas[i].leer();
        }
    }
    
}
