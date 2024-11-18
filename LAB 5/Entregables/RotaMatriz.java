/* 
* Grupo: Lab_B001 
* Miembro 1: Daniel Domínguez Macías 
* Miembro 2: Nadia Gonzalez Garcia
* Miembro 3: Pablo Calderon Bermejo
* Fecha: 18/11/2024
* Descripción: Programa para crear una matriz con valores aleatorios y de dimension introducida y rotarlo posteriormente. 
* Versión: 1.0 */
import java.util.Random;
import java.util.Scanner;

public class RotaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos la dimension de la matriz: 
        System.out.print("Ingrese la dimensión de la matriz cuadrada (N): ");
        int n = scanner.nextInt();

        // Validar que la dimensión sea positiva
        if (n <= 0) {
            System.out.println("La dimensión debe ser mayor que 0.");
            return;
        }

        // Crear y llenar la matriz con números aleatorios entre 0 y 9
        int[][] matriz = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(10); // Números entre 0 y 9
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        printmatriz(matriz);

        // Generar la matriz rotada a la derecha
        int[][] matrizRotada = rotamatriz(matriz);

        // Mostrar la matriz rotada
        System.out.println("Matriz rotada a la derecha:");
        printmatriz(matrizRotada);
    }

    // Método para imprimir una matriz
    public static void printmatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    // Método para rotar la matriz a la derecha
    public static int[][] rotamatriz(int[][] matriz) {
        int n = matriz.length;
        int[][] matrizRotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotada[j][n - 1 - i] = matriz[i][j];
            }
        }

        return matrizRotada;
    }
}

