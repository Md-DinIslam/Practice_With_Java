import java.util.Scanner;

public class test_01 {
        private String Name;
        private String ExpireDate;
        private String ProductionDate;
        private double Price;

        public test_01(String name, String expireDate, String productionDate, double price) {
            this.Name = name;
            this.ExpireDate = expireDate;
            this.ProductionDate = productionDate;
            this.Price = price;
//            if (price < 10.00) {
//                this.Price = 10.00;
//            } else {
//                this.Price = price;
//            }
        }

//        public void test_01(String name, String expireDate, String productionDate) {
//            getProductionDate(name, expireDate, productionDate, 10.00);
//        }

        public String getName() {
            return Name;
        }

        public String getExpireDate() {
            return ExpireDate;
        }

        public String getProductionDate() {
            return ProductionDate;
        }

        public double getPrice() {
            return Price;
        }

        public boolean available() {
                if(Price < 10.0) return false;
                return true;
//            String now = String.now();
//            return now.isAfter(productionDate) && now.isBefore(expireDate);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String exDate = sc.nextLine();
        String proDate = sc.nextLine();
        double prize = sc.nextDouble();
        test_01 obj = new test_01(name,exDate,proDate, prize);
//        System.out.println(obj.getName() + " " + obj.getProductionDate());
//        System.out.println(obj.Name + " " + obj.ExpireDate + " " + obj.Price);
        System.out.println(obj.Name + " " + obj.ExpireDate + " " + obj.getPrice());
//        System.out.println(obj.available());
        if(obj.available() == false){
            System.out.println("Not Available");
        }
        else System.out.println("Available");
    }
}
