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
public class Punto {

    private double x, y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }
    

    public String toString(){
        String toString;
        return toString = "(" + x + ", " + y + (")");
    }
    
    
    public double distancia(Punto a, Punto b){
        
        double distancia;
        
        distancia = Math.sqrt(Math.pow((b.x-a.x), 2)+(Math.pow((b.y-a.y), 2)));
        return distancia;
        
    }
    
}
