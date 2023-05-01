public class CallClass {
    int a,b;
    CallClass(int x,int y){
//        this.a = a;
//        this.b = b;
        a = x;
        b = y;
    }
    void reff(CallClass change){
        change.a *= 2;
        change.b *= 2;
    }
    public static void main(String[] args) {
//        test_02 obj = new test_02();
//        Box ans = new Box();
//        System.out.println(ans.getArea());
        CallClass ans = new CallClass(10,15);
        System.out.println("Before: " + ans.a + " " + ans.b);
        ans.reff(ans);
        System.out.println("After: " + ans.a + " " + ans.b  );
    }
}
