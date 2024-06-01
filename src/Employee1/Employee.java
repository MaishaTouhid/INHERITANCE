package Employee1;

public class Employee {
    private String name;
    private  double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + baseSalary);

    }
}
