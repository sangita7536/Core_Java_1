package Exception;

public class exception {
    public static void main(String args[]) throws Exception
    {

        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=i;
        }
        try
        {
           int res = arr[9];
           throw new ArithmeticException("Technical error");
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
        }
    }
}
