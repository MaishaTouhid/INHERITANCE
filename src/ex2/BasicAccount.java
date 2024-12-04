package ex2;

public class BasicAccount extends BankAccount {
    private static final double OVERDRAFT_PENALTY = 30.0;

    public BasicAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void withdraw(double amount ){
        if(amount > 0 ) {
            super.withdraw(amount);

            if (getInitialBalance() < 0) {
                System.out.println("give penalty :" + OVERDRAFT_PENALTY);
                super.withdraw(OVERDRAFT_PENALTY);
            }
        }
        else{
            System.out.println("positive balance needed");
        }
    }


}
