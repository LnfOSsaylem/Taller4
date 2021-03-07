/*
Implementar en java la clase que se indica en el diagrama de clases (figura), incluyendo las validaciones necesarias
en los métodos consignar y retirar. Crear una clase principal en la que se cree un objeto de dicha y probar sus métodos.
 */
package puntosiete;

public class Cuenta {
    
    // ATRIBUTOS
    private int noCuenta;
    private String nombreCliente;
    private double saldo;

    public Cuenta() {
    }
    // SETTER
    public void setNoCuenta(int n){this.noCuenta=n; }
    public void setNombreCliente(String name){this.nombreCliente=name;}
    public void setSaldo(double v){this.saldo=v;}
    // GETTER
    public int getNoCuenta(){return this.noCuenta;}
    public String getNombreCliente(){return this.nombreCliente;}
    public double getSaldo(){return this.saldo;}
    // METODOS 
    public boolean consignar(double monto){
        if(monto==0){
            System.out.print("\n/// NO ES POSIBLE CONSIGNAR LA CANTIDAD DIGITADA ///\n");
            return false;
        }
        else{
            System.out.print("\n/// CONSIGNACION EXITOSA ///\n");
            this.saldo=monto+this.saldo;
            return true;
        }
    }
    public boolean retirar(double monto){
        if(monto==0 && monto>this.saldo){
            System.out.print("\n/// NO ES POSIBLE RETIRAR LA CANTIDAD DIGITADA ///\n");
            return false;
        }
        else{
            System.out.print("\n/// RETIRO EXITOSO ///\n");
            this.saldo=this.saldo-monto;
            return true;
        }
    }   
}
