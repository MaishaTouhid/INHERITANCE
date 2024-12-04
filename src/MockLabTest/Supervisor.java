package MockLabTest;

public class Supervisor extends Worker {
    public  String devision;

    public Supervisor(String name, double wage,String devision) {
        super(name, wage);
        this.devision = devision;
    }

    public String getDevision() {
        return devision;
    }
    @Override
    public String toString(){
        return super.toString() + "," + "Devision :"+ devision;
    }
}
