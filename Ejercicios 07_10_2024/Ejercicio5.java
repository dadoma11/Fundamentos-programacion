public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = 2147483646;
        System.out.println("Numero: " +numero);
        numero=numero+1;
        System.out.println("Numero: " +numero);
        numero=numero+1; //Aqui ya alcanzamos el maximo numero positivo que podemos representar al desbordarse nos va a añadir un bit mas que va a hacer que se vuelva negativo el valor.
        System.out.println("Numero: " +numero);
        numero=numero+1;
        System.out.println("Numero: " +numero);
    }
}
