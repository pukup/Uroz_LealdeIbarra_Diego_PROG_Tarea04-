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
    
    public static void main (String[] args){
        
        int numeroTriangulos;
        
        do{
        System.out.println("Introduzca un número entero positivo");
        numeroTriangulos = Entrada.entero();
        }while(numeroTriangulos < 0);
        
        Punto[] vectorPuntos = new Punto[numeroTriangulos*3];
        
        
    }
    
}
