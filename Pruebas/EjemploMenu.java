import java.io.IOException;
import java.util.*;

public class EjemploMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            clearConsole();
            System.out.println("1. Calculos Matemáticos.");
            System.out.println("2. Mostrar Listado de usuarios del sistema.");
            System.out.println("3. Gestionar Usuarios");
            System.out.println("4. Salir");
            System.out.print("Inserte que desea realizar: ");
            
            int opcion = scan.nextInt();
            
            clearConsole();
            
            switch (opcion) {
                case 1:
                System.out.println("Realizar una operacion (se preguntará) entre 2 numeros introducidos. (Se te solicitarám)");
                System.out.println("1. Suma.");
                System.out.println("Inserte que desea realizar. Los numeros a usar se le solicitaran en cada apartado de manera independiente. \nEs importante que tenga en cuenta que estos no son reutilizables. Es decir no podra referenciar el resultado de una suma para usarlo en una multiplicacion en el mismo programa.: ");
                Scanner opescann = new Scanner(System.in);
                int operacion = opescann.nextInt();


                switch (operacion) {
                    case 1:
                        System.out.println("Indique que dos numeros quiere que se usen en las operaciones:");
                        Scanner num1 = new Scanner(System.in);
                        double numero1 = num1.nextDouble();
                        System.out.print("Numero 1: ");
                        Scanner num2 = new Scanner(System.in);
                        double numero2 = num2.nextDouble();
                        System.out.print("Numero 2: ");
                        System.out.printf("De acuerdo vamos a resolver la operacion de %2f + %2f", numero1, numero2);
                        double resultado = numero1 + numero2;
                        System.out.printf("El resultado es: %f2", resultado);
                    break;
                    default:
                        System.out.println("La operacion deseada no es una de las opciones.");
                    break;
                };
                case 2:
                    System.out.println("Mostrar listado de usuarios del sistema.");
                    break;
                case 3:
                    System.out.println("Gestionar Usuarios");
                    break;
                case 4:
                    System.out.println("Salir");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
            
            System.out.println("\nPresione Enter para continuar...");
            scan.nextLine();
            scan.nextLine();
        }
    }
    
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException | InterruptedException ex) {
            // Handle exceptions
        }
    }
}
