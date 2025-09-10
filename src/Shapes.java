class Shape {
    void draw() {
        System.out.println("Drawing a generic shape.");
    }

    void erase() {
        System.out.println("Erasing a generic shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
    @Override
    void erase() {
        System.out.println("Erasing a Circle.");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle.");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Triangle.");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square.");
    }

    @Override
    void erase() {
        System.out.println("Erasing a Square.");
    }
}

public class Shapes {
    public static void main(String[] args) {

        Shape myCircle = new Circle();
        Shape myTriangle = new Triangle();
        Shape mySquare = new Square();
        Shape[] shapes = new Shape[3];
        shapes[0] = myCircle;
        shapes[1] = myTriangle;
        shapes[2] = mySquare;

        System.out.println("--- Demonstrating Polymorphism ---");

        for (Shape shape : shapes) {
            shape.draw();
        }

        System.out.println("\n--- Now Erasing ---");

        for (Shape shape : shapes) {
            shape.erase();
        }
    }
}