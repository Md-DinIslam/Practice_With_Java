public class ExtendClass {
    String name = "Rasel vlo na";
    int age = 12;
    void print(){
        System.out.println("Hello Habu");
    }
}
class daddyClass extends ExtendClass{
    String leader = "Din";
    public static void main(String[] args) {
        daddyClass ans = new daddyClass();
        System.out.println(ans.leader);
        System.out.println(ans.name);
        System.out.println(ans.age);
        ans.print();
    }
}
