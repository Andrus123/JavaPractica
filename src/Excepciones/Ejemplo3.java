/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Andrés Aquin
 */

public class Ejemplo3 {

    public static void main(String[] args) {
        int num, den, res;
        try {

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader teclado = new BufferedReader(isr);
            System.out.print("Numerador: ");
            num = Integer.parseInt(teclado.readLine());
            System.out.print("Denominador: ");
            den = Integer.parseInt(teclado.readLine());;
            res = num / den;
            System.out.println("El resultado es: " + res);
        } //bloque catch que trata la excepción, división por cero
        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Ha intentado dividir por cero");
        } //Bloque catch que trata la excepción, caracteres no numéricos
        catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("No es un numero");
        } //bloque catch que trata la excepción, de E/S de datos.
        catch (IOException e) {

            System.out.println("Error de e/s" + e.getMessage());
        } finally {
            System.out.println("Este bloque se imprime despues del bloque try/catch");
        }
        System.out.println("FIN DEL PROGRAMA...");
    }//fin del metodo main
}//fin de la clase Ejemplo3
