class Animal
{
    Animal()
    {
        System.out.println("Constructor is called");
    }
    Animal(int a)
    {
        System.out.println("Number is "+a);
    }
}
public class Constructor {

    public static void main(String[] args)
    {
        Animal a = new Animal();

        Animal a1 = new Animal(5);
    }
}
