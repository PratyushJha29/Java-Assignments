import java.util.Scanner;

public class BitMaskUtility {
    static boolean isBitSet(int number, int position) {
        return (number & (1 << position)) != 0;
    }
    static int setBit(int number, int position) {
        return number | (1 << position);
    }
    static int clearBit(int number, int position) {
        return number & ~(1 << position);
    }
    static int toggleBit(int number, int position) {
        return number ^ (1 << position);
    }
    static String toBinary32(int number) {
        String binary = Integer.toBinaryString(number);
        while (binary.length() < 32) {
            binary = "0" + binary;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter bit position (0-31): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos > 31) {
            System.out.println("Invalid bit position");
            return;
        }
        System.out.println("1. Check Bit");
        System.out.println("2. Set Bit");
        System.out.println("3. Clear Bit");
        System.out.println("4. Toggle Bit");
        System.out.print("Choose: ");
        int choice = sc.nextInt();

        System.out.println("Before: " + num);
        System.out.println(toBinary32(num));

        int result = num;

        switch (choice) {
            case 1:
                System.out.println("Bit is set: " + isBitSet(num, pos));
                break;
            case 2:
                result = setBit(num, pos);
                break;
            case 3:
                result = clearBit(num, pos);
                break;
            case 4:
                result = toggleBit(num, pos);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        if (choice != 1) {
            System.out.println("After: " + result);
            System.out.println(toBinary32(result));
        }
        sc.close();
    }
}