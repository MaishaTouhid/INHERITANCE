package Bank;

public class BankAccount {

        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }
        public double getBalance() {
            return balance;
        }
        public double deposit(double amount){
            if (amount > 0) {
                balance = balance + amount;
            }
            else {
                return balance;
            }
            return amount;
        }

        public double withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance = balance - amount;
                return balance;
            }
            else {
                return balance;
            }
        }

    }

