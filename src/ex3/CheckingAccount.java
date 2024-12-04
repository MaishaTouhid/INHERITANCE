package ex3;

import java.time.LocalDate;

public class CheckingAccount {
    private double balance;
   private LocalDate lastOverdraftDate;

    private boolean hasIncurredPenalty;

    private static final double FIRST_OVERDRAFT_PENALTY = 20.0;
    private static final double SUBSEQUENT_OVERDRAFT_PENALTY = 30.0;

    // Constructor
    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
        this.lastOverdraftDate = null;
        this.hasIncurredPenalty = false;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        balance -= amount;

        // Handle overdraft
        if (balance < 0) {
            applyOverdraftPenalty();
        }
    }

    // Apply overdraft penalty based on the current month
    private void applyOverdraftPenalty() {
        LocalDate currentDate = LocalDate.now();

        // Reset penalty status if in a new month
        if (lastOverdraftDate == null || !isSameMonth(currentDate, lastOverdraftDate)) {
            hasIncurredPenalty = false;
        }

        if (!hasIncurredPenalty) {
            System.out.println("First overdraft of the month. Applying a penalty of $" + FIRST_OVERDRAFT_PENALTY);
            balance -= FIRST_OVERDRAFT_PENALTY;
            hasIncurredPenalty = true;
        } else {
            System.out.println("Subsequent overdraft of the month. Applying a penalty of $" + SUBSEQUENT_OVERDRAFT_PENALTY);
            balance -= SUBSEQUENT_OVERDRAFT_PENALTY;
        }

        lastOverdraftDate = currentDate;
    }

    // Helper method to check if two dates are in the same month and year
    private boolean isSameMonth(LocalDate date1, LocalDate date2) {
        return date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth();
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Overriding toString to display account information
    @Override
    public String toString() {
        return "CheckingAccount[balance=" + balance + "]";
    }
}
