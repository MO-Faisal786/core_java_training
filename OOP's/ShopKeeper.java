
class BatBallDetails {
    int price;
    String quality;
}

class Customer {
    static int purchaseBatBall(BatBallDetails batBall) {
        int money = batBall.price;
        System.out.println("Customer is Purchasing Bat Ball of "+batBall.quality+" for Rs."+batBall.price+" Returning the money.");
        return money;
    }

    static int returnBorrow() {
        System.out.println("Customer returning the borrow money of Rs.199 .");

        return 199;
    }

    static void getBorrow(BatBallDetails batBall) {
        System.out.println("Customer is borrowing batBall from ShopKeeper "+batBall.quality+" for Rs."+batBall.price);
    }
}

public class ShopKeeper {

    public static void main(String[] args) {
        BatBallDetails batBall = new BatBallDetails();
        batBall.price = 100;
        batBall.quality = "MRF";
        
        int money = Customer.purchaseBatBall(batBall);
        System.out.println("The shopkeeper is selling a BatBall and getting money of Rs."+money);

        System.out.println("Shopkeeper is taking back borrow money from customer.");
        Customer.returnBorrow();

        System.out.println("Shopkeeper is selling batBall for borrow.");
        Customer.getBorrow(batBall);
    }
}


