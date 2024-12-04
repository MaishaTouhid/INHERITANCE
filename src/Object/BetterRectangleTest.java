package Object;

public class BetterRectangleTest {
    public static void main(String[] args) {
        // Create a BetterRectangle object
        BetterRectangle rectangle = new BetterRectangle(10, 20, 30, 40);

        // Display rectangle properties
        System.out.println(rectangle);

        // Test individual methods
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
    }
}
