/* 
* Grupo: Lab_B001 
* Miembro 1: Daniel Domínguez Macías 
* Miembro 2: Nadia Gonzalez Garcia
* Miembro 3: Pablo Calderon Bermejo
* Fecha: 11/11/2024
* Descripción: Programa para indicar la cantidad e numeros primos desde 1 a X numero. 
* Versión: 1.0 */
package Entregables;
import java.util.Scanner;
public class CuentaPrimos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        System.out.println("Vamos a contar los numeros primos que existen desde 1 a un numero. Elige ese numero a continuacioón: ");
        int numero = teclado.nextInt();
        for (int i = 2; i <= numero; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " numeros primos entre 1 y " + numero);

    }
}
