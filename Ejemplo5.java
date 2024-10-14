import java.util.*;

class EntradaSalida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        String s1 = input.nextLine();

        System.out.printf("La cadena que he leido es: %30s ", s1);    
        input.close();
    }
}