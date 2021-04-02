/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajaAhorro;

/**
 *
 * @author andru
 */
public class CajaAhorro {
        
    private int numCuenta;
    private int ci;
    private String nombres;
    private double saldo;
    private Valores[] bonos;            
    private static double interesAnual = 3;
                                 //b) 2 Constructores
    public CajaAhorro() {
        this.numCuenta = 0;
        this.ci = 0;
        this.nombres = "";
        this.saldo = 0.0;
    }

    public CajaAhorro(int nc, int ci, String nom, double saldo, Valores[] bonos) {
        this.numCuenta = nc;
        this.ci = ci;
        this.nombres = nom;
        this.saldo = saldo;
        this.bonos = bonos;
    }
                                //c) Metodos para obtener y modificar atributos                                                
    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static double getInteresAnual() {
        return interesAnual;
    }
                                   //d)Metodos para ingresar y retirar el saldo
    public void ingresarSaldo(double s) {
        this.setSaldo(this.getSaldo() + s);
    }

    public void retirarSaldo(double s) {
        if (s <= getSaldo()) {
            setSaldo(getSaldo() - s);
        } else {
            System.out.println("SALDO INSUFICIENTE!!!");
        }
    }
                              //e) Mostrar el valor de los atributos del objeto
                              //   instanciados de la clase
    public void mostrar() {
        System.out.println("CLIENTES 'BANCO UNION'");
        System.out.println("CLIENTES 'Numero de cuenta: " + getNumCuenta());
        System.out.println("CLIENTES 'Carnet de identidad: " + getCi());
        System.out.println("CLIENTES 'Nombres: " + getNombres());
        System.out.println("CLIENTES 'Saldo : " + getSaldo());
    }
                              //f) Calcular el interés anual de un cliente
                              //   y sumarlo a su saldo
    public void interesAnual() {
        saldo += (getSaldo() * getInteresAnual()) / 100;
        System.out.println("SALDO MAS INTERES ANUAL");
    }
                                       //g) Realizar la transferencia de dinero 
                                       //   de una cuenta a otra
    
    public void transferencia(CajaAhorro c2, double m) {
        this.setSaldo(this.getSaldo() - m);
        c2.setSaldo(c2.getSaldo() + m);
        System.out.println("LA TRANSACCION SE REALIZO CON EXITO !!");
    }
                 //b) El banco cada fin de año otorga un premio que
                 //   equivale al 18% al cliente con mayor saldo,
                 //   incrementandolo, mostrar al cliente el incremento de saldo
    
    public void premio(CajaAhorro c2, int p) {
        if (getSaldo() > c2.getSaldo()) {
            this.saldo += (getSaldo() * p) / 100;
            this.mostrar();
        } else if (getSaldo() < c2.getSaldo()) {
            c2.saldo += (c2.getSaldo() * p) / 100;
            c2.mostrar();
        } else {
            System.out.println("SALDOS IGUALES");
        }
    }
                 //k) Crear un método que permita a un cliente de CajaAhorro
                 //   comprar Valores del banco
    
    public void valores(int j) {
        Valores v1 = new Valores();
        System.out.println("COMPRA DE VALORES 'BANCO UNION'");
        v1.setNumCuenta(this.getNumCuenta());
        v1.leer();
        v1.calcular();
        v1.mostrar();
        bonos[j] = new Valores();     
        bonos[j] = v1;
        System.out.println("COMPRA DE VALORES CON EXITO!!!");
    }
}
