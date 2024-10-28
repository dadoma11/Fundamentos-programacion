/* 
* Grupo: Lab_B001 
* Miembro 1: Daniel Domínguez Macías 
* Fecha: 28/10/2024
* Descripción: Programa para leer la edad introducidos por teclado usando la class Scanner y verificar si es mayor de edad o no. 
* Versión: 1.0 */
import java.util.Scanner;
public class Condicionales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = leer.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
