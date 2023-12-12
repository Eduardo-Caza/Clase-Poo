public class OperacionesMatematicas {
    public double suma;
    public void Operacion(int num1, int num2){
        suma=num1+num2;
        System.out.println("La suma de dos numeros enteros es: "+suma);
    }
    public void Operacion(int num1, int num2, int num3){
        suma=num1+num2+num3+5;
        System.out.println("La suma de tres numeros enteros es: "+suma);
    }
    public void Operacion(double n1, double n2){
        suma=n1+n2+2;
        System.out.println("La suma de dos numeros decimales es: "+suma);
    }
    public static void main(String[] arg) {
        OperacionesMatematicas inicio = new OperacionesMatematicas();
        inicio.Operacion(5, 5);
        inicio.Operacion(5, 5, 5);
        inicio.Operacion(5.25, 5.25);
    }
}
