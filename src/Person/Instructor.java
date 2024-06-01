package Person;

public class Instructor extends Person {
    private double salary;
    public Instructor(String name, int dateOfBirth,double salary) {
        super(name, dateOfBirth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return super.toString() + " , salary: " + salary;
    }


}
