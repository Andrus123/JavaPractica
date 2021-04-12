/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica;

/**
 *
 * @author andru
 */
public class Paciente extends Persona{
    private String diagnostico;

    public Paciente() {
        super();
        this.diagnostico = "Ninguno";
    }
    public Paciente(String n, int ci,String diagnostico) {
        super(n,ci);
        this.diagnostico = diagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public void leer(){
        super.leer();
        System.out.println("Diagnostico del paciente: ");
        setDiagnostico(Leer.dato());
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Diagnostico del paciente: " + getDiagnostico());
    }
    
    public boolean buscarPaciente(String dg){
        return this.getDiagnostico().equals(dg);
    }
}
