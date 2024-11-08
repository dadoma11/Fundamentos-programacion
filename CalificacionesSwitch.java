/* 
* Grupo: Lab_B001 
* Miembro 1: Daniel Domínguez Macías 
* Miembro 2: Nadia Gonzalez García 
* Miembro 3: Pablo Calderón Bermejo 
* Fecha: 18/10/2024
* Descripción: Progrma para calificar notas usando Switch.
* Versión: 1.0 */
import java.util.Scanner;

public class CalificacionesSwitch {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Índicame la nota obtenida: ");
        int nota = teclado.nextInt(); // para leer la nota

        // Convertimos la nota al rango 0-10
        int rango = nota / 10;

        switch (rango) {
            case 10: // Para la nota 100
            case 9:
                System.out.println("Calificación: A");
                break;
            case 8:
                System.out.println("Calificación: B");
                break;
            case 7:
                System.out.println("Calificación: C");
                break;
            case 6:
                System.out.println("Calificación: D");
                break;
            case 5: // Para notas menores de 60
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Calificación: F");
                break;
            default:
                System.out.println("Introduce una nota válida entre 0 y 100.");
        }
    }
}
