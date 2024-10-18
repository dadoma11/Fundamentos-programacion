/* 
* Grupo: Lab_B001 
* Miembro 1: Daniel Domínguez Macías 
* Miembro 2: Nadia Gonzalez García 
* Miembro 3: Pablo Calderón Bermejo 
* Fecha: 18/10/2024
* Descripción: Programa para realizar la formula de la energia cinetica a partir de unos valores de la masa y la velocidad introducidos por teclado usando la class Scanner. 
* Versión: 1.0 */
import java.util.Scanner;

public class EnergiaCinetica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Asignamos a teclado el valor que queremos tener en la masa.
        System.out.println("Ingrese la masa: "); //Solicitamos la masa.
        double masa = teclado.nextDouble(); // Asignacion de la masa que se escribe en la consola a la variable masa de tipo double.
        System.out.println("Ingrese la velocidad: "); // Solicitamos la velocidad.
        Scanner tecladodos = new Scanner(System.in); // Asignamos al tecladodos el valor que queremos tener en la velocidad.
        double velocidad = tecladodos.nextDouble(); // Asignacion de la velocidad que se escribe en la consola a la variable velocidad de tipo double.
        double energiaCinetica = 0.5 * masa * Math.pow(velocidad, 2); // Calculo de la energia cinetica.
        System.out.printf("La energía cinética es: %.2f J", energiaCinetica); // Mostramos eel resultado final.
    }
}
