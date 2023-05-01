public class Main {
    public static void main(String[] args) {
        Constructor myInfo = new Constructor();
//        myInfo.setName("Din");
//        myInfo.setID(2475);
        System.out.println(myInfo.getName());
        System.out.println(myInfo.getID());
        Area ans = new Area();
        System.out.println(ans.ansVolume());
        System.out.println(ans.ansArea());
    }
}