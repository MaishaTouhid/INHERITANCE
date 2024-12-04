package ex;

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(100.0,"12345");
        try{
        a.deposit (50);
         a.withdraw(200);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            a.withdraw(50);
           a.deposit(10);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Final Balance : $" + a.getBalance());
            System.out.println("End of transaction");
        }

    }
}
