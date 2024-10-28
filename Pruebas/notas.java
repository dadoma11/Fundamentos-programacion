import java.util.Scanner;
public class notas {
    public static void main(String[] args) {
        float nota;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe la nota del alumno: ");
        nota = scan.nextFloat();
        if (nota >= 0 && nota < 5) {
            System.out.println("Suspenso");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Suficiente");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota no válida");
        }
    }
}
