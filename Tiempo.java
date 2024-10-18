/* 
* Grupo: Lab_B001 
* Miembro 1: Daniel Domínguez Macías 
* Miembro 2: Nadia Gonzalez García 
* Miembro 3: Pablo Calderón Bermejo 
* Fecha: 18/10/2024
* Descripción: Programa para convertir segundos a dias, horas, minutos y segundos. 
* Versión: 1.0 */
import java.util.*;
public class Tiempo {
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa para convertir segundos a dias, horas, minutos y segundos.");
        int dias; // Declaramos la variable dias de tipo int.
        int horas; // Declaramos la variable horas de tipo int.
        int minutos; // Declaramos la variable minutos de tipo int.
        Scanner sc = new Scanner(System.in); // Declaramos la variable sc de tipo Scanner.
        System.out.println("Introduce el número de segundos a transformar: "); // Solicitamos el número de segundos a transformar.
        int segundos = sc.nextInt(); // Asignamos los segundos a la variable segundos.
        System.out.println("Ahora vamos a pasar esos segundos a dias, horas, minutos y segundos."); // Indicamos la operacion que se va a hacer.
        // Operaciones de conversion con la nueva variable de segundosrest para poder operar correctamente.
        dias = segundos / 86400;
        int segundosrest = segundos % 86400;
        horas = segundosrest / 3600;
        segundosrest = segundosrest % 3600;
        minutos = segundosrest / 60;
        segundosrest = segundosrest % 60;
        System.out.printf("Los segundos introducidos equivalen a %d dias, %d horas, %d minutos y %d segundos.", dias, horas, minutos, segundosrest); // Mostramos el resultado por pantalla.
        
    }
}
