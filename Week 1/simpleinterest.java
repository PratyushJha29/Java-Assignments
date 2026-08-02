import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter Principal Amount:");
        double principal=sc.nextDouble();

        System.out.print("Enter Rate:");
        double rate=sc.nextDouble();

        System.out.print("Enter Time:");
        double time=sc.nextDouble();

       double simpleinterest = principal * rate * time / 100;
       double finalAmount = principal + simpleinterest;

       System.out.println("Simple interest="+simpleinterest);
        System.out.println("Final amount="+finalAmount);


       sc.close();

    }
    }
