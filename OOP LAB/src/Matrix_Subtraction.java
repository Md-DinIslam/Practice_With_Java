import java.util.Scanner;

public class Matrix_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [][] a = new int[size][size];
        int [][] b = new int[size][size];
        int [][] subtract = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = sc.nextInt();
            }
        }for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                subtract[i][j] = a[i][j] - b[i][j];
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(subtract[i][j] + " ");
            }
            System.out.println();
        }
    }
}
