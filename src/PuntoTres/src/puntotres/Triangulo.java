/*
Diseñe e implemente una clase para trabajar con triángulos isósceles. Defina atributos para la base y la altura,
proporcione un método constructor, métodos getter y setter e implemente métodos para calcular: el área, la longitud de
sus lados iguales, el perímetro, el valor del ángulo vértice. 

*/
package puntotres;

public class Triangulo {
    // Atributos
    
    private double base;
    private double altura;
    
    // METODO CONSTRUCTOR
    
    public Triangulo(){
    }
    
    // METODOS SETTER Y GETTER
    
    public void setBase(Double b){this.base = b;}
    public void setAltura(Double a){this.altura = a;}
    
    // METODO PARA CALCULO DE AREA
    public double getArea(){
        return ((this.base*this.altura)/2);
    }
    public double getLados(){
        return Math.sqrt((Math.pow(this.altura,2)+((Math.pow(this.base,2))/4)));
    }
    public double getPerimetro(){
        return (2*getLados()+base);
    }
    public double getAngulo(){
        return Math.toDegrees(2*(Math.asin((this.base/2)/this.altura)));
    }
}
