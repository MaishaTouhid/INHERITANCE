package MockLabTest;

public class Worker {
    public  String name;
    public  double wage;

    public Worker(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public double getWage() {
        return wage;
    }
    public String toString(){
        return  "Name:" + name +"," + "Wage:" + wage ;
    }
}
