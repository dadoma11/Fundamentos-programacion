
import java.util.Scanner;

public class argumentos {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int[] vectorSuma = new int[args.length / 2 + 1]; //vector resultado
        int suma = 0; //la suma parcial antes de cada caracter especial de separación
        int contadorSumas = 0;
        for (int i = 0; i < args.length; i++) {
            String valor = args[i];
            if (!valor.equals('#')) {
                int valorEntero = Integer.parseInt(valor);
                suma += valorEntero;
            } else {
                vectorSuma[contadorSumas] = suma; // se pone la suma acumulada
                suma = 0; // se resetea la suma
                contadorSumas++; // se avanza el contador
            }
        }
        vectorSuma[contadorSumas] = suma; //se pone la suma acumulada
        System.out.print("\nResultado = | ");
        for (int i = 0; i <= contadorSumas; i++) {
            System.out.print(vectorSuma[i] + " | ");
        }
    }
}
