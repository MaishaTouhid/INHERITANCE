package ex2;

public class BankAccount {
    private  double initialBalance;

    public BankAccount(double initialBalance) {
        this.initialBalance = initialBalance;
    }
     public  void deposit(double amount){
        if(amount > 0 ){
            initialBalance += amount;
        }
     }
     public void  withdraw(double amount){
         initialBalance -= amount;
     }

    public double getInitialBalance() {
        return initialBalance;
    }



}
