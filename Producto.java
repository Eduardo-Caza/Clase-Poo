public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;
    public Producto(){

    }
    public Producto(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    public Producto(String nombre, double precio, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    public void imprimir(String nombre, double precio){
        System.out.println("Producto: "+nombre+" Precio: "+precio);
    }
    public void imprimir(String nombre, double precio, int cantidad){
        System.out.println("Producto: "+nombre+" Precio: "+precio+ " Cantidad: "+cantidad);
    }

    public static void main(String[] arg){
        System.out.println("Dos Parametros");
        Producto producto1=new Producto();
        Producto producto2=new Producto();
        Producto producto3=new Producto();
        Producto producto4=new Producto();
        producto1.imprimir("Arroz",5.25);
        producto2.imprimir("Azucar",1.25);
        System.out.println("Tres Parametros");
        producto3.imprimir("Carne Molida",4.55, 4);
        producto4.imprimir("Atun",2.25, 2);
    }
}
