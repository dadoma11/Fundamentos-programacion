import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                int num2 = scanner.nextInt();
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.print("Enter first number: ");
                num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                num2 = scanner.nextInt();
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.print("Enter first number: ");
                num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                num2 = scanner.nextInt();
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                System.out.print("Enter first number: ");
                num1 = scanner.nextInt();
                System.out.print("Enter second number: ");
                num2 = scanner.nextInt();
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
