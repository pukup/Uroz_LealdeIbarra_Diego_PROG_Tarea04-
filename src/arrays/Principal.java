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
        int contadorVertices = 0;
        int mayorMedia = 0;
        int menorMedia = 0;
        double sumaPerimetros = 0;
        double mayorPerimetro = 0;
        double menorPerimetro = 10;
        double mediaPerimetros;
        Triangulo trianguloMayor = new Triangulo();
        Triangulo trianguloMenor = new Triangulo();

        for (int i = 0; i < numeroTriangulos; i++) {
            vectorTriangulos[i] = new Triangulo(vectorPuntos[contadorVertices], vectorPuntos[contadorVertices + 1], vectorPuntos[contadorVertices + 2]);
            contadorVertices += 3;
            sumaPerimetros = sumaPerimetros + vectorTriangulos[i].perimetro();
        }

        

    }

}
