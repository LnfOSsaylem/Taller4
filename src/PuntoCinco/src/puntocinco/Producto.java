/*
Se desea crear una aplicación en java para el registro del inventario de productos de una tienda. Para ello, se solicita
diseñar e implementar la clase Producto, con atributos de instancia para el Código, nombre, precio de compra,
porcentaje de utilidad. La clase debe implementar método constructor, getters y setters para sus atributos y el método
precioVenta, que retornara el precio de venta al público (a partir del % de utilidad del producto). Implementar una clase
principal, en la que se defina un arreglo de Productos, se registren datos de diferentes productos y luego se impriman
incluyendo el precio de venta.
*/
package puntocinco;

public class Producto{
    // ATRIBUTOS
    private String codigo;
    private String nombre;
    private double precio;
    private double porcentaje;
    
    // CONSTRUCTOR
    public Producto() {
    }
    
    // METODOS GETTER Y SETTER
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public String getCodigo() {return codigo;}
    
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getNombre() {return nombre;}

    public void setPrecio(double precio) {this.precio = precio;}
    public double getPrecio() {return precio;}

    public void setPorcentaje(double porcentaje) {this.porcentaje = porcentaje;}
    public double getPorcentaje() {return porcentaje;}
    
    public double precioVenta(){return this.precio*(1+(this.porcentaje/100));} 
    
    
}
