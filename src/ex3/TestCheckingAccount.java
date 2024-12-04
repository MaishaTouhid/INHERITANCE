package ex3;

public class TestCheckingAccount {
    public static void main(String[] args) {
        // Create a CheckingAccount object
        CheckingAccount account = new CheckingAccount(100.0);

        System.out.println("Initial Balance: $" + account.getBalance());

        // Perform various transactions
        account.withdraw(50.0);
        System.out.println("After Withdrawal of $50: $" + account.getBalance());

        account.withdraw(70.0);
        System.out.println("After Withdrawal of $70: $" + account.getBalance());

        account.withdraw(10.0);
        System.out.println("After Withdrawal of $10: $" + account.getBalance());

        // Simulate a deposit and further withdrawals in the same month
        account.deposit(50.0);
        System.out.println("After Deposit of $50: $" + account.getBalance());

        account.withdraw(200.0);
        System.out.println("After Withdrawal of $200: $" + account.getBalance());
    }
}
