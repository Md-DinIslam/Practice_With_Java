import java.util.Scanner;
public class Prime_Number {
    static String PrimeCheck(int n) {
        if (n < 2) return "It is not Prime Number";
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return "It is not Prime Number";
            }
        }
        return "It is Prime Number";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test case: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(PrimeCheck(n));
        }
    }
}
