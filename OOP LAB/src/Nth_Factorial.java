import java.util.Arrays;
import java.util.Scanner;

public class Nth_Factorial {
    static long fact(int n) {
        long f_product = 1;
        for (int i = 1; i <= n; i++) {
            f_product *= i;
        }
        return f_product;
    }
    static int []dp = new int[100000000];
    static long []getDp = new long[1000000];
static long fact_re(int n){
        if(n == 0) return 1;
        if(getDp[n] != -1) return getDp[n];
        return getDp[n] = n * (fact_re(n-1));
}
    public static void main(String[] args) {
        Arrays.fill(getDp, -1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Factoral Number = ");
//        System.out.print(fact(n));
        /* USING RECURION FUNCTION */
        System.out.print(fact_re(n));
    }
}
