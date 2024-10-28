import java.util.Scanner;
public class Ecuacion2G {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de ax^2 bx c");
        System.out.println("Ingrese el valor de a:");
        int a = leer.nextInt();
        System.out.println("Ingrese el valor de b:");
        int b = leer.nextInt();
        System.out.println("Ingrese el valor de c:");
        int c = leer.nextInt();
        int discriminante = (b*b) - (4 * a * c);
        if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2*a);
                System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
                double x = -b / (2*a);
                System.out.println("La solución es x = " + x);
        } else {
                System.out.println("No existen soluciones reales");
        }
    }
}
