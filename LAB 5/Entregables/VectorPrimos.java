/* 
* Grupo: Lab_B001 
* Miembro 1: Daniel Domínguez Macías 
* Miembro 2: Nadia Gonzalez Garcia
* Miembro 3: Pablo Calderon Bermejo
* Fecha: 18/11/2024
* Descripción: Programa para crear numeros primos y alamcenarlos en un vector para posteirormente mostrar su resultado. 
* Versión: 1.0 */
import java.util.Scanner;

public class VectorPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de primos a almacenar
        System.out.print("Ingrese la cantidad de números primos a generar: ");
        int cantidad = scanner.nextInt();

        // Validar que la cantidad sea positiva
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que 0.");
            return;
        }

        // Crear un vector para almacenar los números primos
        int[] primos = new int[cantidad];

        // Generar números primos e introducirlos en el vector
        int numero = 2; // Los números primos empiezan desde 2
        int contadorPrimos = 0;

        while (contadorPrimos < cantidad) {
            if (esPrimo(numero)) {
                primos[contadorPrimos] = numero;
                contadorPrimos++;
            }
            numero++;
        }

        // Imprimir todos los elementos del vector
        System.out.println("Números primos generados:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}

