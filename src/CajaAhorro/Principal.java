/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajaAhorro;

import Vector.Leer;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author andru
 */
public class Principal {
        
    
    public static void main(String[] args) {
        Valores[] bonos = new Valores[10];
        CajaAhorro c1 = new CajaAhorro(100, 2270682, "Sandra Sandoval", 700, bonos);
        c1.mostrar();
        System.out.println("DEPOSITANDO DINERO");
        c1.ingresarSaldo(300);
        System.out.println("Saldo Actual: " + c1.getSaldo());

        System.out.println("RETIRANDO DINERO");
        c1.retirarSaldo(100);
        System.out.println("Saldo Actual: " + c1.getSaldo());

        System.out.println("INTERES SUMADO AL SALDO ACTUAL");
        c1.interesAnual();
        c1.mostrar();

        CajaAhorro c2 = new CajaAhorro(200, 2270623, "Pedro Perez", 900, bonos);
        c2.mostrar();

        c1.transferencia(c2, 100);
        c1.mostrar();
        c2.mostrar();
        
        System.out.println("CLIENTE CON MAYOR SALDO");
        c1.premio(c2, 18);
        
        //i) Crear un array de objetos de la cajaAhorro para n clientes
        //   generando cuenta con número de cuenta por el sistema y mostrarlo
        //Creando el array de objetos de tipo cajaAhorro
        
        int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "numero de CLIENTES: ", "BANCO UNION", JOptionPane.QUESTION_MESSAGE));
        CajaAhorro[] clientes = new CajaAhorro[dato];
        double maxsaldo = 0;
        String nmxsaldo = "";
        for (int i = 0; i < clientes.length; i++) {
            int nc = (int) (Math.random() * 1000);   //genera numero randomico para cuenta
            System.out.println("Carnet de identidad: ");
            int ci = Leer.datoInt();
            System.out.println("Nombres: ");
            String nom = Leer.dato();
            System.out.println("Saldo: ");
            double s = Leer.datoDouble();
            clientes[i] = new CajaAhorro(nc, ci, nom, s, bonos);
            if(clientes[i].getSaldo()>maxsaldo){
                maxsaldo = clientes[i].getSaldo();
                nmxsaldo = clientes[i].getNombres();
            }
            //clientes[i].setSaldo(maxsaldo+50000);
        }
        System.out.println("CLIENTES DEL BANCO UNION");
        for (int i = 0; i < clientes.length; i++) {
            clientes[i].mostrar();
        }
        System.out.println("El ganador de los 50000 Bs. es "+nmxsaldo+"con un saldo de: " +(maxsaldo + 50000));
        
        //k) Crear un método que permita a un cliente de cajaAhorro 
        //   comprar Valores del banco
        CajaAhorro m1 = new CajaAhorro();
        int j=0;
        while (true) {
            System.out.println("COMPRA DE VALORES 'BANCO UNION'");
            System.out.println("CODIGO DEL CLIENTE: ");
            int num = (new Scanner(System.in).nextInt());
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i].getNumCuenta() == num) {
                    m1 = clientes[i];
                    break;
                }
                else{
                    System.out.println("El número ingresado no se encuentra registrado");
                    System.exit(1);
                }
            }
            
            System.out.println("INFORMACION DEL CLIENTE DE CAJA AHORRO");
            m1.mostrar();
            m1.valores(j);
            System.out.println("Desea continuar s/n?");
            String c = (new Scanner(System.in).next());
            if (c.equals("n")) {
                break;
            }
            j++;
        }
        // k)----------------------------------------------------
    }

}
