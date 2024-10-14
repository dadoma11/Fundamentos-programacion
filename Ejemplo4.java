import java.util.*;
class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Insert a string: ");
        String cad1 = sc.nextLine();

        System.out.print("Insert a string " + "without backspaces: ");
        String cad2 = sc.next();

        System.out.print("Insert a double: ");
        double d = sc.nextDouble();

        System.out.print("Insert an integer: ");
        int i = sc.nextInt();

        System.out.printf(Locale.US,
        "\nThe inserted data String type are: "+
        "\n cad1: %s"+
        "\n cad1: %20s"+
        "\n cad2: %s"+
        "\n cad2: %10.5s \n", 
        cad1,cad1, cad2, cad2
        );
        System.out.printf(Locale.US,
        "\nThe inserted doubles are: "+
        "\ndouble: %7.4f"+
        "\ndouble: %7.3f" +
        "\ndouble: %7.2\n", d,d,d);
        
        System.out.printf(Locale.US,
        "\nThe inserted integers are:"+
        "integer: %d"+
        "\ninteger: %5d",i,i);
    }
}