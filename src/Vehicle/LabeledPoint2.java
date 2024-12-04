package Vehicle;

import java.awt.*;

public class LabeledPoint2 {
    private Point location;
    private  String lable;

    public LabeledPoint2(int x ,int y , String lable) {
        this.location = new Point(x,y);
        this.lable = lable;
    }
    @Override
    public  String toString(){
        return "Location : (" + location.toString()+"Lable:"+lable;
    }

    }

