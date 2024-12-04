package MockLabTest;

public class Test {
    public static void main(String[] args) {
        Worker w = new Worker("mim",1000);
        System.out.println(w);
        Supervisor s = new Supervisor("dim",1200,"Marketing");
        System.out.println(s);
        Director d = new Director("kim",1500,"Sales");
        System.out.println(d);
    }
}
