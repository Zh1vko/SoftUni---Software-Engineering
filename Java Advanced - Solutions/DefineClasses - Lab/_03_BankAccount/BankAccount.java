package BankAccount;

public class BankAccount {

    private static int nextID = 1;
    private static double interestRate = 0.02;
    private int id;
    double balance;

    public BankAccount() {
        this.id = nextID;
        nextID++;
    }

    public int getId() {
        return id;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(int years) {
        return balance * years * interestRate;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }


}
