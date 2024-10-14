
import java.util.Scanner;

// Escriba un programa que permita convertir de unidades a docenas
// El programa deberá solicitar el número de unidades y deberá calcular e imprimir el
// número de docenas completas correspondientes, así como el número restante de
// unidades del total original, no tiene por qué haber siempre un número exacto de
// docenas
// Por ejemplo, 14 unidades son 1 docena más 2 unidades
// El programa debe realizar la lectura haciendo uso de la clase Scanner y la escritura
// a través del método printf

public class Ejercicio10 {
    public static void main(String[] args) {
        float unidades;
        float docenas;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el valor a analizar:");
        unidades = scan.nextFloat();
        docenas = unidades / 12;
        unidades = unidades % 12;
        System.out.printf("\nEl valor introducido tiene " + docenas + " docena y " + unidades + " unidades sueltas.");
    }
}
