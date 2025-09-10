abstract class Shapees {
    public abstract double getArea();
    public void displayInfo() {
        System.out.println("This is a shape.");
    }
}
class Circles extends Shapees {
    private double radius;

    public Circles(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public void printDetails() {z
        System.out.println("Circle with radius: " + radius);
    }

    public void printDetails(String color) {
        System.out.println("Circle with radius " + radius + " and color " + color);
    }
}

public class method {
    public static void main(String[] args) {
        Circles myCircle = new Circles(5.0);
        System.out.println("--- Method Overriding ---");
        System.out.println("The area of the circle is: " + myCircle.getArea());
        myCircle.displayInfo();

        System.out.println("\n--- Method Overloading ---");
        myCircle.printDetails();
        myCircle.printDetails("Blue");
        public class MainOverload {

            // 1. The official entry point for the JVM 🚀
            public static void main(String[] args) {
                System.out.println("Original main with String[] args is running.");

                // You can call the overloaded versions from here
                main("Hello!");
                main(2025);
            }

            // 2. Overloaded main method
            public static void main(String message) {
                System.out.println("Overloaded main with String: " + message);
            }

            // 3. Another overloaded main method
            public static void main(int year) {
                System.out.println("Overloaded main with int: " + year);
            }
        }5
    }
}