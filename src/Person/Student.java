package Person;

public class Student extends Person{
    private String major;
    public Student(String name, int dateOfBirth,String major) {
        super(name, dateOfBirth);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString(){
        return super.toString() + " , major: " + major;
    }
}
