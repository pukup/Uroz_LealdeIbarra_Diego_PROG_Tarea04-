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
public class Ejercicio2 {

    public static void main(String[] args) {

        String matricula;

        do {
            System.out.println("Introduzca una matrícula válida");
            matricula = Entrada.cadena();
        } while (!matriculaValida(matricula));

    }

    public static boolean matriculaValida(String matricula) {

        Pattern patron = Pattern.compile("\\s*([0-9]{4})( |-)?([bcdfghjklmnpqrstvwxyz]{3})\\s*", Pattern.CASE_INSENSITIVE);
        Matcher empareja = patron.matcher(matricula);

        if (!empareja.find()) {
            System.out.println("Formato incorrecto");
        } else {
            System.out.println("Los dígitos de la matrícula son : " + empareja.group(1));
            System.out.println("Las letras son: " + empareja.group(3));
        }

        return empareja.matches();

    }

}
