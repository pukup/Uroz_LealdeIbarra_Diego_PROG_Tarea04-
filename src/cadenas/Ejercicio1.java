/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

import java.util.regex.*;
import utilidades.Entrada;

/**
 *
 * @author pukup
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int contadorVocales = 0;
        String palabra;
        
        Pattern unaPalabra = Pattern.compile("\\s*[a-z]+\\s*",Pattern.CASE_INSENSITIVE);
        Matcher comprueba;
        
        
        do{
            System.out.println("Introduzca una palabra: ");        
            palabra = Entrada.cadena();
            comprueba = unaPalabra.matcher(palabra);
        }while(!comprueba.matches());
        
        
        
        Pattern cincoVocales = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Matcher comprobador = cincoVocales.matcher(palabra);

        while (comprobador.find()) {
            contadorVocales++;            
        }
        
        System.out.println("Las palabras panvocálicas tienen más de 5 vocales.");
        
        if (contadorVocales > 4) {
            System.out.println(palabra + " es una palabra panvocalica ya que tiene " + contadorVocales);
        }
        else{
            System.out.println(palabra + " no es una palabra panvocalica ya que solo tiene " + contadorVocales);
        }
    }
}
