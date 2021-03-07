/*Crear una clase Rectángulo, con atributos longitud y ancho. Crear también el constructor de la clase 
y los métodos necesarios para calcular el área y el perímetro. Crear otra clase PruebaRectangulo 
que pruebe varios rectángulos y muestre por pantalla sus áreas y perímetros.
*/

public class Rectangulo {
     // ATRIBUTOS
    private double longitud;
    private double ancho;

    // CONSTRUCTOR
    public Rectangulo() {
    }
    // METODOS SETTER Y GETTER
    public void setLongitud(double l){this.longitud = l;}
    
    public void setAncho(double a){this.ancho = a;}
    
    public double getArea(){
        return (this.ancho*this.longitud);
    }
    public double getPerimetro(){
        return (2*this.ancho)+(2*this.longitud);
    }
}
