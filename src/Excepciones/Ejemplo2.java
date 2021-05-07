/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Andrés Aquin
 */
public class Ejemplo2 {

        public static void main(String[] args) {
            String str = " 12 ";

            try {
                int numero = Integer.parseInt(str);

                System.out.println(numero);
            } //bloque catch que trata la excepción, caracteres no numéricos
            catch (NumberFormatException e) {
//imprimir el objeto e de la clase NumberFormatException que informa del error
                System.out.println(e);

                System.out.println("La cadena no es NUMÉRICA");
            } finally {
                System.out.println("Este bloque se imprime despues del bloque try/catch");

            }
        }//fin del método main
    }//fin de la clase Ejemplo2

