/*
Crear la clase Reloj, con atributos de instancia para las horas, minutos y segundos, atributo de clase para el formato
de impresión (0 – militar, 1 – AM/PM, 2-Texto), método constructor, getters y setters, los métodos miembros: SS+(),
MM+(), HH()+, para incrementar en 1, los segundos, minutos y horas respectivamente. Así mismo, los métodos SS-(),
MM-(), HH-(), para disminuir en 1 los segundos, minutos y horas respectivamente, métodos que retornen la hora en
formato militar, en formato AM/PM, en formato texto (“cinco y cincuenta am”, o “dos y treinta y cinco pm”) y finalmente
un método denominado getHora que debe retornar la hora en el formato correspondiente según el atributo indicado.
Crea una clase principal e instancia dos objetos reloj, la ejecución del aplicativo debe mostrar las horas de los relojes
en distintos formatos.

*/
package PuntoOcho;

public class Reloj {
    // ATRIBUTOS
    private int horas;
    private int minutos;
    private int segundos;
    
    public int militar;
    public int am_pm;
    public int texto;

    public Reloj() {
    }
    
    public int SSa(){return this.segundos+1;}
    public int MMa(){return this.minutos+1;}
    public int HHa(){return this.horas+1;}
    
    public int SSd(){return this.segundos-1;}
    public int MMd(){return this.minutos-1;}
    public int HHd(){return this.horas-1;}
    
    public int h_Militar(int militar){return this.segundos+1;} 
    
    
    
    
    
}
