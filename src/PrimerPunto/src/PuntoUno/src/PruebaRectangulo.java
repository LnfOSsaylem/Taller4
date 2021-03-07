
import java.util.Scanner;


public class PruebaRectangulo{
    public static void main(String [] args){
        Rectangulo rectangulo = createNewRectangulo();
        mostrarResultados(rectangulo);
    }
    public static Rectangulo createNewRectangulo(){
        Rectangulo rectangulo = new Rectangulo();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite la longitud: ");
        rectangulo.setLongitud(input.nextDouble());
        System.out.print("Digite el ancho: ");
        rectangulo.setAncho(input.nextDouble());
        return rectangulo;
    }
    public static void mostrarResultados(Rectangulo rectangulo){
        System.out.println("--------------------------------\n");
          System.out.printf("El area es: %.2f",rectangulo.getArea());
          System.out.printf("\nEl perimetro es: %.2f",rectangulo.getPerimetro());
          System.out.println("\n--------------------------------\n");
    }
}
