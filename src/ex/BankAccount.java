package ex;

public class BankAccount {
    public double balance;
    public  String accountNumber;
    public BankAccount( String accountNumber) {
        this.balance = 0.0;
        this.accountNumber = accountNumber;
    }

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount) throws InvalidAmountException{
        if(amount >0 ){
            System.out.println("Depositing : $" + amount);
        }
        if(amount <= 0){
            System.out.println("Attempting to deposit -$" + amount);
            throw new InvalidAmountException("Invalid Amount");
        }
        balance = balance + amount;
        System.out.println("New Balance " + balance);
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        System.out.println("Attempting to withdraw $" + amount);
        if( amount <= 0 || amount > balance){
            throw new InsufficientFundsException("Insufficient funds!");

        }
        balance = balance - amount;
        System.out.println("New Balance " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
