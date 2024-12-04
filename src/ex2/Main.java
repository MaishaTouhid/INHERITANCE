package ex2;

public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BasicAccount(10000);
        System.out.println("Basic balance: " + a1.getInitialBalance());
        a1.deposit(5000);
        System.out.println("balance after deposit:" + a1.getInitialBalance());
        a1.withdraw(12500);
        System.out.println("after 1st withdraw :" + a1.getInitialBalance());
        a1.withdraw(3000);
        System.out.println("after 2nd  withdraw :" + a1.getInitialBalance());
       // a1.withdraw(-20.0);
    }
}
