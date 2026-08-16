import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0) return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n) ? "Prime" : "Not Prime");
    }
}//loop condition means that we will check divisor only till square root of the number
