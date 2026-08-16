import java.util.Scanner;

public class GreatestCommonDivisor {

    static int findGCD(int first, int second) {
        first = Math.abs(first);
        second = Math.abs(second);

        while (second != 0) {
            int rem = first % second;
            first = second;
            second = rem;
        }
        return first;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter second number:");
        int b = sc.nextInt();

        System.out.println("GCD = " + findGCD(a, b));

        sc.close();
    }
}
