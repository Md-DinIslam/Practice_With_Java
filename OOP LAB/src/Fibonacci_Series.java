import java.util.Scanner;

public class Fibonacci_Series {
    static int fibo(int j) {
        if (j == 0 || j == 1) return 1;
        return fibo(j - 2) + fibo(j - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
