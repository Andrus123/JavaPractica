/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Andrés Aquin
 */

public class Ejemplo4 {

    public static void main(String[] args) {
        int num, den, res;
        try {

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader teclado = new BufferedReader(isr);
            System.out.print("NUMERADOR: ");
            num = Integer.parseInt(teclado.readLine());
            System.out.print("DENOMINADOR: ");
            den = Integer.parseInt(teclado.readLine());
            res = num / den;
            System.out.println("EL RESULTADO ES: " + res);
        }//fin de try
        catch (Exception e) {
            System.out.println(e);

            System.out.println("error: a intentado dividir entre cero o introducido carácter no numérico...");

        } finally {
            System.out.println("FIN DEL PROGRAMA...");
        }
    }//fin del método main
}//fin de la clase Ejemplo4
