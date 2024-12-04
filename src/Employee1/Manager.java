package Employee1;

public class Manager extends Employee {
    private double bonus;
    public Manager(String name, double baseSalary,double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public double getsalary() {
        return super.getsalary() + bonus;
    }
    
   @Override
    public void display(){
         super.display();
       System.out.println("Total Salary With Bonus: " + bonus);
   }
}
