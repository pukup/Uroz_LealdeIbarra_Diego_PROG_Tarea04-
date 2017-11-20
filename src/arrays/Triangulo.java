/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author pukup
 */
public class Triangulo {

    private Punto vertice1, vertice2, vertice3;

    public Triangulo() {

        vertice1 = new Punto(0,0);
        vertice2 = new Punto(0,0);
        vertice3 = new Punto(0,0);
    }
    
    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {

        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public Punto getVertice1() {
        return vertice1;
    }

    public Punto getVertice2() {
        return vertice2;
    }

    public Punto getVertice3() {
        return vertice3;
    }
    
    public String toString(){
        String toString;
        toString = "A" + vertice1.toString() + "B" + vertice2.toString() + "C" + vertice3.toString();
        return toString;
    }
    
    public double perimetro(){
        double perimetro;
        perimetro = (vertice1.distancia(vertice2))+(vertice2.distancia(vertice3))+(vertice1.distancia(vertice3));
        return perimetro;
    }
    
}
