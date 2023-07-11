
// Drawable interface
interface Drawable {
    void draw();
}

// Circle class implementing Drawable
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Rectangle class implementing Drawable
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main class
public class Q4 {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Calling draw() method on each object
        circle.draw(); // Drawing a circle
        rectangle.draw(); // Drawing a rectangle
    }
}
