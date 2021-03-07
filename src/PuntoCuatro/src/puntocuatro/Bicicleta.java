/*
Implementa la clase Bicicleta, que tiene tres atributos, velocidadActual, platoActual y piñonActual, de tipo entero,
método constructor, getters y setters, y los siguientes métodos miembros: acelerar (), frenar (), cambiarPlato (int plato),
y cambiarPiñon (int piñon), donde el primero dobla la velocidad actual, el segundo reduce a la mitad la velocidad actual,
y el tercero y cuarto ajustan el plato y el piñón actual respectivamente según los parámetros recibidos. Crear una clase
principal, e instancia un objeto bicicleta y mostrar sus comportamientos.
*/
package puntocuatro;

public class Bicicleta {
    // ATRIBUTOS
    private double velocidadActual;
    private int platoActual;
    private int pinonActual;

    // CONSTRUCTOR
    public Bicicleta() {
    }
    
    // METODOS SETTER
    public void setvelocidadActual(double velocidad){this.velocidadActual=velocidad;}
    public double getvelocidadActual(){return this.velocidadActual;}
    public void setcambiarPlato(int plato){this.platoActual=plato;}
    public int getcambiarPlato(){return this.platoActual;}
    public void setcambiarPinon(int pinon){this.pinonActual=pinon;}
    public int getcambiarPinon(){return this.pinonActual;}
    
    // METODOS GETTER
    public double acelerar(){
        return this.velocidadActual=this.velocidadActual*2;
    }
    public double frenar(){
        return this.velocidadActual=this.velocidadActual/2;
    }
    
}
