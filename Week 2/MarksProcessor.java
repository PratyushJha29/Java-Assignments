import java.util.Scanner;

public class MarksProcessor {

    static boolean isValidMark(int mark) {
        return mark >= 0 && mark <= 100;
    }

    static double average(int sum, int count) {
        if (count == 0) return 0;
        return (double) sum / count;
    }

    static void display(int count, int sum, int highest, int pass, int fail) {
        System.out.println("Valid Marks = " + count);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average(sum, count));
        System.out.println("Highest = " + highest);
        System.out.println("Pass = " + pass);
        System.out.println("Fail = " + fail);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mark, count = 0, sum = 0, highest = 0, pass = 0, fail = 0;

        while (true) {
            System.out.print("Enter mark (-1 to stop): ");
            mark = sc.nextInt();

            if (mark == -1) break;

            if (!isValidMark(mark)) {
                System.out.println("Invalid mark");
                continue;
            }
            count++;
            sum += mark;

            if (count == 1 || mark > highest)
                highest = mark;

            if (mark >= 50)
                pass++;
            else
                fail++;
        }
        display(count, sum, highest, pass, fail);
    }
}