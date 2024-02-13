class Bank {
    int getRateofInterest() {
        return  5;
    }
}

class SBI extends Bank {
    int getRateofInterest(){
        return 7;
    }
}

class ICICI extends Bank{
    int getRateofInterest(){
        return 9;
    }
}

class AXIS extends Bank{

}

public class Example2 {
    public static void main(String[] args) {
        SBI sbi1 = new SBI();
        ICICI icici1 = new ICICI();
        AXIS axis1 = new AXIS();
        System.out.println("SBI's rate of interest is "+ sbi1.getRateofInterest()+".");
        System.out.println("ICICI's rate of interest is "+ icici1.getRateofInterest()+".");
        System.out.println("AXIS's rate of interest is "+ axis1.getRateofInterest()+".");
    }
}
