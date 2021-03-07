/* Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, 
el número de caballos, el número de puertas y la matricula. Crear el constructor del coche, así como los 
métodos que considere necesarios. Crear una clase PruebaCoche que instancie varios coches, cambiándole el 
color a lo largo de la vida a algunos de ellos y mostrándolo por pantalla.
*/



package puntodos;

public class Coche {
    
    //ATRIBUTOS
    private String color, marca, matricula;
    private int modelo, numeroPuertas, caballosFuerza;
    
    // METODO CONSTRUCTOR

    public Coche() {
      // No importa si se deja vacio, retorna vacios de cada tipo para cada atributo
    }   
    
    // METODO GETTER PARA RETURNAR LOS ATRIBUTOS
    public String getMarca(){return this.marca;}
    public String getColor(){return this.color;}
    public String getMatricula(){return this.matricula;}
    public int getModelo(){return this.modelo;}
    public int getNCaballos(){return this.caballosFuerza;}
    public int getNPuertas(){return this.numeroPuertas;}
    // METODO SETTER PARA ESTABLECER ATRIBUTOS
    public void setMarca(String m){this.marca = m;}
    public void setColor(String m){this.color = m;}
    public void setMatricula(String m){this.matricula = m;}
    public void setModelo(int m){this.modelo = m;}
    public void setNCaballos(int m){this.caballosFuerza = m;}
    public void setNPuertas(int m){this.numeroPuertas = m;}
    
}
