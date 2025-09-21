package OOP;

class myrun implements Runnable
{
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("Runnable");
        }
    }
}
public class Multithreading {
    public static void main(String args[])
    {
        myrun r = new myrun();
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<8;i++)
        {
            System.out.println("Main");
        }
    }
}
