interface Bank{
    void withdraw(double amount);
    void deposit(double amount);
    double fetchBalance();
}

class CreateAccount {
    static Bank createOne(String acType, String name,  int age) {
        if (acType.equals("SavingAccount")) {
            System.out.println("Saving Account is being created.");
            return new SavingAccount();
        } else if (acType.equals("LoanAccount")) {
            System.out.println("Loan Account is being created.");
            return new LoanAccount();
        } else return null;
    }
}

class SavingAccount implements Bank{
    double accountBalance = 0;
    public void withdraw(double amount) {
        System.out.println("Withdrawing the money from SavingAccount.");
        this.accountBalance -= amount;
    }

    public void deposit(double amount) {
        System.out.println("Depositing the money into Saving Account.");
        this.accountBalance += amount;

    }
    public double fetchBalance() {
        return this.accountBalance;
    }
}

class LoanAccount implements Bank{
    double loanBalance = 0.0;   
    public void withdraw(double amount) {
        System.out.println("Withdrawing the money from LoanAccount.");
        this.loanBalance += amount;
    }

    public void deposit(double amount) {
        System.out.println("Depositing the money into LoanAccount.");
        this.loanBalance -= amount;
    }

    public double fetchBalance() {
        return this.loanBalance;
    }

}

public class Assignment1 {
    public static void main(String[] args) {
        Bank account = CreateAccount.createOne("SavingAccount", "Faisal Malik", 21);
        account.deposit(100202);
        System.out.println(account.fetchBalance());
        account.withdraw(100000);
        System.out.println(account.fetchBalance());
    }
}
