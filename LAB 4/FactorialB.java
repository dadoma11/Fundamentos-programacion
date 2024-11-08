import java.util.Scanner;

public class FactorialB {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // se crea objeto tipo scanner
        char salir = ' '; //variable para recoger la respuesta de seguir o finalizar
        do {
        System.out.println("Introduzca número: ");
        int numero = leer.nextInt(); // se introduce el número para calcular el factorial
        double factorial = 1;
        for (double i = 1; i <= numero; i++) {
        factorial = factorial * i;
        }
        System.out.println("Factorial de " + numero + " es: " + factorial);
        System.out.println("\nOtro factorial? Sí (s) / No (n)");
        salir = leer.next().charAt(0); //recogemos si el usuario quiere seguir o no
        } while (salir == 's' || salir == 'S'); // iteramos sólo si el usuario quiere seguir
        System.out.println("Programa finalizado");
    }
}
