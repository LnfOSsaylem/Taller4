
package puntodos;
import java.util.Scanner;
public class PruebaCoche {
    public static void main(String [] args){
        // COCHE AL FINAL: METODO CONSTRUCTOR!
        Coche coche1 = createNewCoche();
        printInfoCoche(coche1);
        
    }    // SETTER: CAMBIANDO EL ESTADO AL OBJETO
    public static Coche createNewCoche(){
        Scanner input = new Scanner(System.in);
        Coche coche1 = new Coche();
        System.out.print("Color: ");
        coche1.setColor(input.next());
        System.out.print("Marca: ");
        coche1.setMarca(input.next());
        System.out.print("Matricula: ");
        coche1.setMatricula(input.next());
        System.out.print("N. Caballos: ");
        coche1.setNCaballos(input.nextInt());
        System.out.print("Modelo: ");
        coche1.setModelo(input.nextInt());
        System.out.print("N. Puertas: ");
        coche1.setNPuertas(input.nextInt());
        return coche1;
    }
    
    public static void printInfoCoche(Coche coche){
        System.out.println("\n-------------------");
        System.out.println("Color: "+coche.getColor());
        System.out.println("Marca: "+coche.getMarca());
        System.out.println("Matricula: "+coche.getMatricula());
        System.out.println("NCaballos: "+coche.getNCaballos());
        System.out.println("Modelo : "+coche.getModelo());
        System.out.println("N. de Puertas : "+coche.getNPuertas());
    }
        
        
}
   

