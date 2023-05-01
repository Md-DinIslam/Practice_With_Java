import java.util.Scanner;
public class Sum_Nth_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0L;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            long fact = 1L;
            while (temp != 0) {
                fact *= temp;
                temp--;
            }
            sum += fact;
        }
        System.out.println(sum);
    }
}
