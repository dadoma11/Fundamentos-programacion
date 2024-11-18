/* 
* Grupo: Lab_B001 
* Miembro 1: Daniel Domínguez Macías 
* Miembro 2: Nadia Gonzalez Garcia
* Miembro 3: Pablo Calderon Bermejo
* Fecha: 11/11/2024
* Descripción: Programa para hacer una piramede de asteriscos con bucles. 
* Versión: 1.0 */
package Entregables;


import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = scanner.nextInt();
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
