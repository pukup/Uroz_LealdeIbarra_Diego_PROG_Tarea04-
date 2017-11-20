/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import utilidades.Entrada;

/**
 *
 * @author pukup
 */
public class Principal {

    public static void main(String[] args) {

        int numeroTriangulos;

        do {
            System.out.println("Introduzca un número entero positivo");
            numeroTriangulos = Entrada.entero();
        } while (numeroTriangulos < 0);

        
        Punto[] vectorPuntos = new Punto[numeroTriangulos * 3];

        for (int i = 0; i < vectorPuntos.length; i++) {
            vectorPuntos[i] = new Punto((double) (Math.random() * 10), (double) (Math.random() * 10));
        }

        
        
        Triangulo[] vectorTriangulos = new Triangulo[numeroTriangulos];
        int sumadorPuntos = 0;

        for (int i = 0; i < vectorTriangulos.length; i++) {
            vectorTriangulos[i] = new Triangulo(vectorPuntos[sumadorPuntos], vectorPuntos[sumadorPuntos + 1], vectorPuntos[sumadorPuntos + 2]);
            sumadorPuntos += 3;
        }

        
        
    }

}
