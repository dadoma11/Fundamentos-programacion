/* 
* Grupo: Lab_B001 
* Miembro 1: Daniel Domínguez Macías 
* Miembro 2: Nadia Gonzalez García 
* Miembro 3: Pablo Calderón Bermejo 
* Fecha: 18/10/2024
* Descripción: Progrma para calificar notas usando condiciones if else.
* Versión: 1.0 */
import java.util.Scanner;

public class CalificacionesIF {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indicame la nota obtenida: ");
        int nota = teclado.nextInt(); //para leer la nota
        if (nota < 0) {
            System.out.println(" La nota introducida no es vaida ");
        } else if (nota < 59) {
            System.out.println(" F " + nota);
        } else if (nota > 69) {
            System.out.println(" D " + nota);
        } else if (nota < 79) {
            System.out.println(" C " + nota);
        } else if (nota < 89) {
            System.out.println(" B " + nota);
        } else if (nota < 100) {
            System.out.println(" A " + nota);
        }
    }
}
