package Person;

public class Person {
    private String name;
    private  int dateOfBirth;

    public Person(String name, int dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String toString(){
        return "Name: " + name + ", Date Of Birth :" + dateOfBirth;
    }
}
