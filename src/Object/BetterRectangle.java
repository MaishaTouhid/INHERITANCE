package Object;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    // Constructor
    public BetterRectangle(int x, int y, int width, int height) {
        super(); // Call the Rectangle constructor
        setLocation(x, y); // Set location using Rectangle's method
        setSize(width, height); // Set size using Rectangle's method
      //  super(x, y, width, height);

    }

    // Method to calculate perimeter
    public int getPerimeter() {
        return 2 * (width + height);
    }

    // Method to calculate area
    public int getArea() {
        return width * height;
    }

    // Overriding toString to display rectangle details
    @Override
    public String toString() {
        return "Location: (" + x + ", " + y + "), Width: " + width + ", Height: " + height +
                ", Perimeter: " + getPerimeter() + ", Area: " + getArea();
    }
}
