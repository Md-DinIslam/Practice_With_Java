import java.util.Scanner;

class Box{
    double A,B;
    void Box(){
//        System.out.println("Constructor: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        getVal(a,b);
//        getVal(A,B);
        A = 5; B = 10;
    }
//    void getVal(int a, int b){
//        this.A = a;
//        this.B = b;
//    }
    double getArea(){
        return A * B;
    }
}
public class test_02 {
    int A,B;
    void test_02(int a, int b){
        A = a;
        B = b;
    }
    class Adder{
        int mul(int a, int b){
            return a*b;
        }
        static int add(int a, int b) {
            return a+b;
        }
        static double add(int a, double b){
            return a * b;
        }
        static int add(int a){
            return a+5;
        }
    }
    long getFact(int n){
        if(n == 0) return 1;
        return n * getFact(n-1);
    }
    boolean getAns(char s){
        if(s == 'a' || s == 'e'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
//        System.out.println(Adder.add(10,20));
//        System.out.println(Adder.add(10,25.5));
//        System.out.println(Adder.add(50));
//        test_02 ans = new test_02();
//        System.out.println(ans.A + " " + ans.B);
        Scanner sc = new Scanner(System.in);
//        char s = sc.next().charAt(0);
//        test_02 ans = new test_02();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
        Box ans = new Box();
        Box ans2 = new Box();
        double vol = ans.getArea();
        System.out.println(vol);
//        vol = ans2.getArea();
//        System.out.println(vol);
        //        System.out.println(ans.getAns(s));
//        int n = sc.nextInt();
//        long sum = 0;
//        for(int i = 1;i <= n; i++){
//            sum += (ans.getFact(i));
//            System.out.print("Fact: " + ans.getFact(i)+ " ");
//            System.out.print("Sum: " + sum + " ");
//        }
//        System.out.println(sum);
    }
}
