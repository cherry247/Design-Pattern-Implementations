package Questions;

/* Define a Shape interface with a getArea() method. Implement it with Circle, Rectangle, and Triangle. 
Write a method that accepts any Shape and prints its area — without knowing the concrete type. */

interface Shape {
    double getArea();

    String getName();
}

class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;

    }

    @Override
    public String getName() {
        return "Circle";
    }
}

class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}

class Square implements Shape {

    private final double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public String getName() {
        return "Square";
    }

}

class ShapeArea{
    public static void main(String[] args){
        Square sq = new Square(34);
        Rectangle rect = new Rectangle(45,34);
        System.out.println(sq.getName() + " has area: " + sq.getArea());
        System.out.println(rect.getName() + " has area: " + rect.getArea());
    }
}
