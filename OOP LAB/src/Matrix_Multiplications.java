import java.util.Scanner;

public class Matrix_Multiplications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] mul = new int[n][n];
        System.out.println("Enter Value of Matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Value of Matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }

    }
}
