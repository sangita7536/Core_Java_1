package OOP;
class Operations
{
    void add(int a,int b)
    {
        System.out.println("Addition is :"+(a+b));

    }
    void add(float a,float b,float c)
    {
        System.out.println("Addition is :"+(a+b+c));

    }
}
public class Overloading {
    public static void main(String args[])
    {
        Operations o = new Operations();
        o.add(10,20,13);
        o.add(25,47);
    }
}
