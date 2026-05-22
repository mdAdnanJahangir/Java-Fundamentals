package methods;
import java.util.Scanner;

public class PrimeNumber {


    static boolean prime(int n){
        if (n <= 1) return false;
        for (int i = 2; i <= n-1; i++) {
            if(n%i==0) return false;
        }
        return true ;
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       boolean  ans = prime(n);
        System.out.println(ans);
    }
}
