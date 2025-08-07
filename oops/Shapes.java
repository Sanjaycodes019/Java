abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.2f%n", result);
    }

    @Override
    void perimeter() {
        double result = 2 * Math.PI * radius;
        System.out.printf("Perimeter of Circle: %.2f%n", result);
    }
}


class Rectangle extends Shape {
    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape c = new Circle(12);
        c.area();
        c.perimeter();

        Shape r = new Rectangle(10, 5);
        r.area();
        r.perimeter();
    }
}
