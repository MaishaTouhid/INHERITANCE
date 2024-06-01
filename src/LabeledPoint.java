public class LabeledPoint {
    private int x;
    private int y;
    private String label ;

    public LabeledPoint(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public String toString(){
        return  "LabelPoint[x =" + x +",y=" + y +",label =" + label +"]";
    }

}
