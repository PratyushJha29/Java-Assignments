import java.util.Scanner;

public class MenuCalculator {
    public static void printMenu() {
        System.out.println("\n1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }
    public static double calculate(int choice, double a, double b) {
        switch (choice) {
            case 1: return a + b;
            case 2: return a - b;
            case 3: return a * b;
            case 4: return a / b;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Calculator Closed");
            }
            else if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                if (choice == 4 && b == 0) {
                    System.out.println("Cannot divide by zero!");
                } else {
                    double result = calculate(choice, a, b);
                    System.out.println("Result = " + result);
                }
            }
            else {
                System.out.println("Invalid Choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}