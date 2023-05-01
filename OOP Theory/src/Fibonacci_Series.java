import java.util.Scanner;
public class Fibonacci_Series {
    /* USING RECURSION FUNCTION */
    static int fibo(int j){
        if(j<= 1){
            return j;
        }
        int value = fibo(j-1) + fibo(j-2);
//        return fibo(j-1) + fibo(j-2);
        return value;
    }
    /* USING GENERAL PROCESS */
    static void GenProc(int n){
        int first = 0, second = 1, third;
        while(n != 0){
            System.out.print(first + " ");
            third = first + second;
            first = second;
            second = third;
            n--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for Fibonacci Series: ");
        int n = sc.nextInt();
        /* USING Recursion FUNCTION */
//        for(int i = 0;i<n;i++){
//            System.out.print(fibo(i) + " ");
//        }
        /* USING GENERAL PROCESS */
        GenProc(n);
    }
}
