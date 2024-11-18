import java.util.Random;
import java.util.Scanner;

public class LoteriaPrimitiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de apuestas
        System.out.print("Ingrese el número de apuestas que desea generar: ");
        int numApuestas = scanner.nextInt();

        // Validar que el número de apuestas sea mayor a 0
        if (numApuestas <= 0) {
            System.out.println("El número de apuestas debe ser mayor que 0.");
            return;
        }

        // Generar el boleto de lotería
        int[][] boleto = generarBoleto(numApuestas);
        int[] reintegros = generarReintegros(numApuestas);

        // Calcular el coste total
        int costeTotal = calcularCosto(numApuestas);

        // Imprimir el boleto
        imprimirBoleto(boleto, reintegros, costeTotal);
    }

    /**
     * Método que genera un boleto con n apuestas, donde cada apuesta es un array de 6 números.
     */
    public static int[][] generarBoleto(int numApuestas) {
        Random random = new Random();
        int[][] boleto = new int[numApuestas][6];

        for (int i = 0; i < numApuestas; i++) {
            // Generar 6 números únicos entre 1 y 49
            for (int j = 0; j < 6; j++) {
                int numero;
                do {
                    numero = random.nextInt(49) + 1; // Generar número entre 1 y 49
                } while (contiene(boleto[i], numero)); // Evitar repetidos
                boleto[i][j] = numero;
            }
        }
        return boleto;
    }

    /**
     * Método que genera un array con reintegros para cada apuesta.
     */
    public static int[] generarReintegros(int numApuestas) {
        Random random = new Random();
        int[] reintegros = new int[numApuestas];
        for (int i = 0; i < numApuestas; i++) {
            reintegros[i] = random.nextInt(10); // Generar número entre 0 y 9
        }
        return reintegros;
    }

    /**
     * Método que calcula el costo total del boleto.
     */
    public static int calcularCosto(int numApuestas) {
        return numApuestas; // Cada apuesta cuesta 1 euro
    }

    /**
     * Método que imprime el boleto con apuestas, reintegros y coste total.
     */
    public static void imprimirBoleto(int[][] boleto, int[] reintegros, int costeTotal) {
        System.out.println("\n--- Boleto de Lotería Primitiva ---");
        for (int i = 0; i < boleto.length; i++) {
            System.out.printf("Apuesta %d: ", i + 1);
            for (int numero : boleto[i]) {
                System.out.printf("%2d ", numero);
            }
            System.out.printf("| Reintegro: %d\n", reintegros[i]);
        }
        System.out.printf("\nCoste total: %d euros\n", costeTotal);
    }

    /**
     * Método auxiliar que verifica si un número está contenido en un array.
     */
    public static boolean contiene(int[] array, int numero) {
        for (int n : array) {
            if (n == numero) {
                return true;
            }
        }
        return false;
    }
}
