/* 
* Grupo: Lab_B001 
* Miembro 1: Daniel Domínguez Macías 
* Fecha: 28/10/2024
* Descripción: Programa para leer 2 numeros indicando cual es mayor y cual es menor o si son iguales.. 
* Versión: 1.0 */
import java.util.Scanner;
public class numeros3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1, num2;
        System.out.println("Introduce el primer numero: ");
        num1 = leer.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        num2 = leer.nextDouble();
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println(num1 + " es igual que " + num2);
        }   
    }
}
