import java.util.*;

class EntradaSalida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        double d = input.nextDouble();

        System.out.printf("El double es %10.3", d);    
        input.close();
    }
}