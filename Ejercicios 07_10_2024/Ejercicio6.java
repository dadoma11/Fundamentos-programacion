import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        double centigrados;
        double fahrenheit;
        Scanner scan = new Scanner(System.in);

        // Entrada de datos
        System.out.printf("Escribe los grados centígrados que quieres convertir a Fahrenheit (Decimales separar con una coma): \nCentígrados: ");
        centigrados = scan.nextDouble();

        // Imprimir los grados centígrados con formato
        System.out.printf(Locale.US, "\nLos grados centígrados introducidos son: %7.4f ºC\n", centigrados);

        // Cálculo de Fahrenheit
        fahrenheit = (centigrados * 1.8) + 32;

        // Imprimir los grados Fahrenheit con formato
        System.out.printf(Locale.US, "Los grados Fahrenheit correspondientes a %7.4f ºC son: %7.4f ºF.\n", centigrados, fahrenheit);
    }
}
