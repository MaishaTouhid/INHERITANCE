package Employee2;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Mim",34500.0);
        System.out.println(emp);
        Manager man = new Manager("john",34500.00,"CSE");
        System.out.println(man);
        Executive executive = new Executive("Carol", 120000, "Operations");
        System.out.println(executive);

    }
}
