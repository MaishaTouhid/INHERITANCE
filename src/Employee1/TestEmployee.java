package Employee1;

public class TestEmployee{
    public static void main(String[] args) {
        Employee employee = new Employee("kim", 50000);
       // System.out.println(employee);
        System.out.println("Employee Name: " + employee.getName());
       System.out.println("Employee Base Salary: " + employee.getBaseSalary());
       System.out.println();
        Manager manager = new Manager("Tim", 60000, 10000);
       System.out.println("Manager Name: " + manager.getName());
        System.out.println("Manager Base Salary: " + manager.getBaseSalary());
        System.out.println("Manager Bonus: " + manager.getBonus());
        System.out.println("Manager Total Salary: " + manager.getsalary());
       // System.out.println(manager);
    }
}
