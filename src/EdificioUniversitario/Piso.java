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
        for(int i=1;i<=getNa();i++){
            System.out.println("Aula: "+i);
            aulas[i].leer();
        }
    }
    public void mostrar(){
        System.out.println("Numero de aulas: " + getNa());
        for(int i=1;i<getNa();i++){
            System.out.println("Aula: " + i);
            aulas[i].mostrar();
        }
    }
    public int getCapAula(int a){
        return aulas[a].getCap();
    }
    
    public String getNomAula(int a){
        return aulas[a].getNom();
    }
}
