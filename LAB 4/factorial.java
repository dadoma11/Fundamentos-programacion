
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        double fact = 1;
        double n;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el numero del que quieras saber su factorial: ");
        n = leer.nextDouble();
        for (double i = n; i > 0; i--) {
            fact = fact * i ;
        }
        System.out.println(n+"! = "+fact);
    }
}
