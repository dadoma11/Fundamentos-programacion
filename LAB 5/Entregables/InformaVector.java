/* 
* Grupo: Lab_B001 
* Miembro 1: Daniel Domínguez Macías 
* Miembro 2: Nadia Gonzalez Garcia
* Miembro 3: Pablo Calderon Bermejo
* Fecha: 18/11/2024
* Descripción: Programa para crear un vector y mostrar su informacion mas relevante. 
* Versión: 1.0 */
import java.util.*;

public class InformaVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos el tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int tamaño = scanner.nextInt();

        // Comprobamos que el valor sea mas que 0 para que se pueda hacer el ejercicio.
        if (tamaño <= 0) {
            System.out.println("El tamaño del vector debe ser mayor que 0.");
            return;
        }

        // Declaramos y llenamos el vector con números aleatorios entre 0 y 99. Utilizamos random para ello.
        int[] vector = new int[tamaño];
        Random random = new Random();
        for (int i = 0; i < tamaño; i++) {
            vector[i] = random.nextInt(100);
        }

        // Mostramos por pantalla la suma de los elementos del vector.
        System.out.println("Los elementos del vector son: " + Arrays.toString(vector));

        // Calcular la media
        double suma = 0;
        for (int num : vector) {
            suma += num;
        }
        double media = suma / tamaño;
        System.out.println("La media de los elementos del vector es: " + media);

        // Encontrar el elemento mayor y su posición
        int mayor = vector[0];
        int posmayor = 0;
        for (int i = 1; i < tamaño; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
                posmayor = i;
            }
        }
        System.out.println("El elemento mayor es: " + mayor + "y su posición: " + posmayor);

        // Escaneamos todo el vector en busca del valor que mas se repite.
        Map<Integer, Integer> frecuencias = new HashMap<>();
        for (int num : vector) {
            frecuencias.put(num, frecuencias.getOrDefault(num, 0) + 1);
        }

        int masrepetido = vector[0];
        int frecmax = 0;
        for (Map.Entry<Integer, Integer> entrada : frecuencias.entrySet()) {
            if (entrada.getValue() > frecmax) {
                masrepetido = entrada.getKey();
                frecmax = entrada.getValue();
            }
        }

        System.out.println("Número más repetido: " + masrepetido);
    }
}
