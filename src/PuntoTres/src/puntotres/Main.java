
package puntotres;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String [] args) {
        Triangulo triangulo = createNewTriangulo();
        printResultados(triangulo);
    }
    public static Triangulo createNewTriangulo(){
        Triangulo triangulo = new Triangulo();
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digita la base: "));
        triangulo.setBase(a);
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digita la altura: "));
        triangulo.setAltura(b);
        return triangulo;
    }
    public static void printResultados(Triangulo triangulo){
        System.out.printf("El area es: %.2f\n",triangulo.getArea());
        System.out.printf("Los lados iguales valen: %.2f\n",triangulo.getLados());
        System.out.printf("El perimetro es: %.2f\n",triangulo.getPerimetro());
        System.out.printf("El angulo es: %.2f°\n",triangulo.getAngulo());
    }
}
