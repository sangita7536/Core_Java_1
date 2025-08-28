package Keywords;

import java.sql.SQLOutput;

class Animal
{
    String name="Animal";
    void display()
    {
        System.out.println("This is animal");
    }
}

class dog extends Animal{
    String name="Dog";
    void display()
    {
        System.out.println("This is "+super.name);
        System.out.println("Name is "+this.name);
    }
}
public class ThisSuper {
    public static void main(String args[])
    {
        Animal a= new dog();
        Animal a1= new Animal();
        a.display();//calls dog class display
        System.out.println("--------------------");
        a1.display(); // calls Animal class display
    }
}
