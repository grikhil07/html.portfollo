class Shapes {

    // Overloaded methods for area calculation
    void Rectangle(int length, int width) {
        System.out.println("Rectangle Area (int): " + (length * width));
    }

    void Rectangle(double length, double width) {
        System.out.println("Rectangle Area (double): " + (length * width));
    }

    void Square(int side) {
        System.out.println("Square Area (int): " + (side * side));
    }

    void Square(double side) {
        System.out.println("Square Area (double): " + (side * side));
    }

    void Circle(double radius) {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }

    void Triangle(double base, double height) {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }

    // Overloaded methods for volume calculation
    void Cube(double side) {
        System.out.println("Cube Volume: " + (side * side * side));
    }

    void Cuboid(double length, double width, double height) {
        System.out.println("Cuboid Volume: " + (length * width * height));
    }

    void Sphere(double radius) {
        System.out.println("Sphere Volume: " + ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3)));
    }

    void Cylinder(double radius, double height) {
        System.out.println("Cylinder Volume: " + (Math.PI * radius * radius * height));
    }

    void Cone(double radius, double height) {
        System.out.println("Cone Volume: " + ((1.0 / 3.0) * Math.PI * radius * radius * height));
    }
}

// Main class to test the methods
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Shapes shape = new Shapes();

        // Area calculations
        shape.Rectangle(5, 10);
        shape.Rectangle(5.5, 10.5);
        shape.Square(4);
        shape.Square(4.5);
        shape.Circle(7);
        shape.Triangle(6, 8);

        // Volume calculations
        shape.Cube(3);
        shape.Cuboid(4, 5, 6);
        shape.Sphere(5);
        shape.Cylinder(3, 7);
        shape.Cone(3, 7);
    }
}
