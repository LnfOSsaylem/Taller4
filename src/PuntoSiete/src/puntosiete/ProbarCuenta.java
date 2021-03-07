
package puntosiete;
import java.util.Scanner;
public class ProbarCuenta {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        Cuenta persona = new Cuenta();
        System.out.print("---------------- BANCOLOMBIA ( ALMACENANDO DATOS ) ----------------");
        System.out.print("\nDigite No. de Cuenta: ");
        persona.setNoCuenta(input.nextInt());
        System.out.print("\nDigite Nombre de Cliente: ");
        persona.setNombreCliente(input.next());
        System.out.print("\nDigite Saldo del Cliente: ");
        persona.setSaldo(input.nextDouble());
        
        System.out.print("\n---------------- BANCOLOMBIA ( MOSTRANDO DATOS ) ----------------");
        System.out.print("\nNo. de Cuenta: "+persona.getNoCuenta());
        System.out.print("\nNombre de Cliente: "+persona.getNombreCliente());
        System.out.print("\nSaldo del Cliente: "+persona.getSaldo());
        System.out.print("\n---------------- ----------------");
        System.out.print("\n¿Desea consignar?: (1 = Si) (0 = No): ");
        int a = input.nextInt();
        if (a == 1){
            System.out.print("\nDigita la cantidad a consignar: ");
            persona.consignar(input.nextDouble());
            System.out.print("\nEl nuevo saldo es: "+persona.getSaldo());
        }
        System.out.print("\n¿Desea retirar?: (1 = Si) (0 = No): ");
        int b = input.nextInt();
        if (b == 1){
            System.out.print("\nDigita la cantidad a retirar: ");
            persona.retirar(input.nextDouble());
            System.out.print("\nEl nuevo saldo es: "+persona.getSaldo());
        }      
        
    }
}
