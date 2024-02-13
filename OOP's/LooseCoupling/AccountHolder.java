interface Account{
    void withdraw(double amount);
    void deposit(double amount);
    double fetchBalance();
}

class CreateAccount {
    static Account createOne(String acType, String name,  double amount) {
        if (acType.equals("SavingAccount")) {
            System.out.println(name+", Your saving Account is being created And your current saving balance is "+amount+".");
            return new SavingAccount(name, amount);
        } else if (acType.equals("LoanAccount")) {
            System.out.println(name+", Your loan Account is being created and your current saving balance is "+amount+".");
            return new LoanAccount(name, amount);
        } else return null;
    }
}

class SavingAccount implements Account{
    String name;
    double accountBalance;

    SavingAccount(String name, double amount) {
        this.name = name;
        this.accountBalance = amount;
    }
    public void withdraw(double amount) {
        System.out.println("Withdrawing the money Rs."+amount+"...");
        this.accountBalance -= amount;
        System.out.println("Your remaining balance is Rs."+this.accountBalance+".");
    }

    public void deposit(double amount) {
        System.out.println("Depositing the money Rs."+amount+"...");
        this.accountBalance += amount;
        System.out.println("Now your balance is Rs."+this.accountBalance+".");

    }
    public double fetchBalance() {
        return this.accountBalance;
    }
}

class LoanAccount implements Account{
    String name;
    double loanBalance;
    LoanAccount(String name, double amount) {
        this.name = name;
        this.loanBalance = amount;
    }   
    public void withdraw(double amount) {
        System.out.println("Withdrawing the money Rs."+amount+"...");
        this.loanBalance += amount;
        System.out.println("Now your loan balance is Rs."+this.loanBalance+".");
    }

    public void deposit(double amount) {
        System.out.println("Depositing the money Rs."+amount+"...");
        this.loanBalance -= amount;
        System.out.println("Your remaining loan balance is Rs."+this.loanBalance+".");
    }

    public double fetchBalance() {
        return this.loanBalance;
    }

}

public class AccountHolder {
    public static void main(String[] args) {
        System.out.println("==========Saving Account===========");

        Account account = CreateAccount.createOne("SavingAccount", "Faisal Malik", 20000);
        System.out.println();
        account.deposit(100200);
        System.out.println("Your Saving: "+account.fetchBalance());
        System.out.println();
        account.withdraw(100000);
        System.out.println("Your Saving: "+account.fetchBalance());

        System.out.println("==========Loan Account===========");

        Account account1 = CreateAccount.createOne("LoanAccount", "Mayank Sharma", 10000);
        System.out.println();
        account1.deposit(5000);
        System.out.println("Loan balance: "+account.fetchBalance());
        System.out.println();
        account1.withdraw(7000);
        System.out.println("Loan balance: "+account.fetchBalance());
    }
}
