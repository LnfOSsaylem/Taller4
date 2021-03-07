
package puntocuatro;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class PruebaBicicleta {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Bicicleta bicicleta = createNewBicicleta();
        printDatos(bicicleta);
        acelerarBicicleta(bicicleta);
        frenarBicicleta(bicicleta);
    }
    public static Bicicleta createNewBicicleta(){
        Bicicleta bicicleta = new Bicicleta();
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digita la velocidad actual: "));
        bicicleta.setvelocidadActual(a);
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digita el plato: "));
        bicicleta.setcambiarPlato(b);
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digita el piñon: "));
        bicicleta.setcambiarPinon(c);
        return bicicleta;
    }
    public static void printDatos(Bicicleta bicicleta){
        System.out.printf("La velocidad actual es: %.2f  m/s\n",bicicleta.getvelocidadActual());
        System.out.printf("El plato actual es: "+bicicleta.getcambiarPlato());
        System.out.printf("\nEl piñon actual es: "+bicicleta.getcambiarPinon());
    }
    public static void acelerarBicicleta(Bicicleta bicicleta){
        Scanner input = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("---------------------------------------");
        System.out.print("\n¿Desea acelerar? (1 = SI)(0 = NO): ");
        
        int a = input.nextInt();
        if (a == 1){
            System.out.printf("             \nAcelerando, la nueva velocidad es: %.2f m/s\n",bicicleta.acelerar());
        }
        
    }
    public static void frenarBicicleta(Bicicleta bicicleta){
        Scanner input = new Scanner(System.in);
        System.out.print("\n");
        System.out.print("---------------------------------------");
        System.out.print("\n¿Desea frenar? (1 = SI)(0 = NO): ");
        int a = input.nextInt();
        if (a == 1){
            System.out.printf("             \nFrenando, la nueva velocidad es: %.2f m/s\n",bicicleta.frenar());
        }
    }
}
