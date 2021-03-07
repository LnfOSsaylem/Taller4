/*
Crea una clase Libro que modele la información que se mantiene en una biblioteca sobre cada libro: título, primer
nombre, segundo nombre, primer apellido, ISBN, páginas, edición, editorial, ciudad, país y fecha de edición (String). La
clase debe proporcionar los siguientes servicios: getters y setters. Implementar una clase principal, en la cual, además
del método main, se debe implementar método para leer la información del Libro y método para mostrar su información.
Este último método mostrará la información del libro con este formato:
*/
package Puntoseis;
public class Libro {
    // ATRIBUTOS
    
    private String titulo;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String isbn;
    private int paginas;
    private int edicion;
    private String editorial;
    private String ciudad;
    private String pais;
    private String fEdicion;
    
    // GETTER Y SETTER
    
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getTitulo() {return this.titulo;}
    
    public void setprimerNombre(String primerNombre) {this.primerNombre = primerNombre;}
    public String getprimerNombre() {return this.primerNombre;}
    
    public void setsegundoNombre(String segundoNombre) {this.segundoNombre = segundoNombre;}
    public String getsegundoNombre() {return this.segundoNombre;}
    
    public void setprimerApellido(String primerApellido) {this.primerApellido = primerApellido;}
    public String getprimerApellido() {return this.primerApellido;}
    
    public void setIsbn(String isbn){this.isbn = isbn;}
    public String getIsbn() {return this.isbn;}
    
    public void setPaginas(int paginas){this.paginas = paginas;}
    public int getPaginas() {return this.paginas;}
    
    public void setEdicion(int edicion){this.edicion = edicion;}
    public int getEdicion() {return this.edicion;}

    public void setEditorial(String editorial) {this.editorial = editorial;}
    public String getEditorial() {return editorial;}
    
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}
    public String getCiudad() {return ciudad;}
    
    public void setPais(String pais) {this.pais = pais;}
    public String getPais() {return pais;}
    
    public void setfEdicion(String fEdicion) {this.fEdicion = fEdicion;}
    public String getfEdicion() {return fEdicion;}
    
    
    
}
