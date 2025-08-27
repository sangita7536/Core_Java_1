package OOP;
class Shape
{
    void show() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape{
    void show()
    {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape{
    void show()
    {
        System.out.println("Drawing Rectangle");
    }
}

public class Overriding {
    public static void main(String args[])
    {
        Shape shape = new Shape();
        shape.show();

        Circle circle = new Circle();
        circle.show();

        Rectangle rectangle = new Rectangle();
        rectangle.show();

        Shape shape1=new Circle();
        shape1.show();
    }
}
