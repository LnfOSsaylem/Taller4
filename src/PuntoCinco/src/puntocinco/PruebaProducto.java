
package puntocinco;
import java.util.Scanner;
public class PruebaProducto {
    public static void main (String [] args){
        //createNewProducto();
        Scanner input = new Scanner(System.in);
        Producto[] arrayProductos = new Producto[2];
        // GUARDANDO CODIGO DE LOS PRODUCTOS
        for(int i=0;i<arrayProductos.length;i++){
            arrayProductos[i]=new Producto();
            System.out.printf("\n------------- Producto %d -------------\n",i+1);
            System.out.printf("\nDigita el codigo: ");
            String a = input.next();
            arrayProductos[i].setCodigo(a);
            System.out.printf("\nDigita el nombre: ");
            String b = input.next();
            arrayProductos[i].setNombre(b);
            System.out.printf("\nDigita el precio de compra: ");
            Double c = input.nextDouble();
            arrayProductos[i].setPrecio(c);
            System.out.printf("\nDigita el porcentaje de utilidad: ");
            Double d = input.nextDouble();
            arrayProductos[i].setPorcentaje(d);
            System.out.print("\n----------------- - - -----------------\n");
        }
        for(int i=0;i<arrayProductos.length;i++){
            System.out.print("\n");
            System.out.printf("\n------------- Producto %d -------------\n",i+1);
            System.out.print("El codigo del producto es: "+arrayProductos[i].getCodigo());
            System.out.print("\nEl nombre del producto es: "+arrayProductos[i].getNombre());
            System.out.printf("\nEl porcentaje del producto es: %.2f",arrayProductos[i].getPorcentaje());
            System.out.printf("\nEl precio de venta para el producto es: %.2f",arrayProductos[i].precioVenta());
            System.out.print("\n");
            System.out.print("\n----------------- - - -----------------\n");
        }
        
    }
}
   