package OOP;
class Car
{
    void model()
    {
        System.out.println("Model is of Mercedes");
    }
}
class Car1 extends Car
{

}
public class Inheritance {
    public static void main(String args[])
    {
        Car1 c= new Car1();
        c.model();
    }
}
