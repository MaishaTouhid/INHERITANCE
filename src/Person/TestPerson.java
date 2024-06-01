package Person;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Mim",2003);
        System.out.println(person);
        System.out.println();
        Student student = new Student ("Maisha",2004,"CS");
        System.out.println(student);
        System.out.println();
        Instructor instructor =  new Instructor("Dim",1980,50000);
        System.out.println(instructor);
    }
}
