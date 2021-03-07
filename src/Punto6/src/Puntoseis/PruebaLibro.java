
package Puntoseis;

import java.util.Scanner;

public class PruebaLibro {
    public static void main (String [] args){
        //createNewProducto();
        Libro[] arrayLibros = createNewLibro();
        mostrarDatos(arrayLibros);
    }
    public static Libro[] createNewLibro(){
        Libro[] arrayLibros = new Libro[1];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<arrayLibros.length;i++){
            arrayLibros[i] = new Libro();
            System.out.printf("\n------------- Biblioteca, (ALMACENANDO) libro %d : -------------\n",i+1);
            System.out.printf("\nDigita el Titulo: ");
            String a = input.next();
            arrayLibros[i].setTitulo(a);
            System.out.printf("\nDigita el Primer Nombre: ");
            String b = input.next();
            arrayLibros[i].setprimerNombre(b);
            System.out.printf("\nDigita el Segundo Nombre: ");
            String c = input.next();
            arrayLibros[i].setsegundoNombre(c);
            System.out.printf("\nDigita Primer Apellido: ");
            String d = input.next();
            arrayLibros[i].setprimerApellido(d);
            System.out.printf("\nDigita el ISBN: ");
            String e = input.next();
            arrayLibros[i].setIsbn(e);
            System.out.printf("\nDigita el No. de Páginas: ");
            int f = input.nextInt();
            arrayLibros[i].setPaginas(f);
            System.out.printf("\nDigita el No. de Edición: ");
            int g = input.nextInt();
            arrayLibros[i].setEdicion(g);
            System.out.printf("\nDigita la Editorial: ");
            String h = input.next();
            arrayLibros[i].setEditorial(h);
            System.out.printf("\nDigita la Ciudad: ");
            String j = input.next();
            arrayLibros[i].setCiudad(j);
            System.out.printf("\nDigita el Pais: ");
            String k = input.next();
            arrayLibros[i].setPais(k);
            System.out.printf("\nDigita la Fecha de Edición: ");
            String l = input.next();
            arrayLibros[i].setfEdicion(l);
            if (i==arrayLibros.length-1){
                System.out.print("\n///////////////////////      - -    ///////////////////////////\n");
            }  
        }
        return arrayLibros;
    }
    public static void mostrarDatos(Libro[] arrayLibros){
        for(int i=0;i<arrayLibros.length;i++){
            System.out.printf("\n------------- Biblioteca, (MOSTRANDO) libro %d : -------------\n",i+1);
            System.out.print("\nTitulo: "+arrayLibros[i].getTitulo());
            System.out.print("\n"+arrayLibros[i].getEdicion()+ " Edicion");
            System.out.print("\nAutor: "+arrayLibros[i].getprimerNombre()+" "+arrayLibros[i].getsegundoNombre()+", "+arrayLibros[i].getprimerApellido());
            System.out.print("\nISBN: "+arrayLibros[i].getIsbn());
            System.out.print("\nEditorial: "+arrayLibros[i].getEditorial());
            System.out.print("\n"+arrayLibros[i].getCiudad()+", "+arrayLibros[i].getPais()+", "+arrayLibros[i].getfEdicion());
            System.out.print("\n"+arrayLibros[i].getPaginas()+" Paginas");
            System.out.print("\n-------------------------    --    ----------------------------\n");
        }
    }
}