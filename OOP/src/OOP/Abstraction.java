package OOP;
class Bank
{
    private String name;
    private int account_balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }
}
public class Abstraction {
    public static void main(String args[])
    {
        Bank b= new Bank();
        b.setName("Sangita");
        b.setAccount_balance(20000);
        System.out.println(b.getName());
        System.out.println(b.getAccount_balance());
    }
}
