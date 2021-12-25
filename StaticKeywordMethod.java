// super keyword as method 

class one 
{
    public void display()
    {
        System.out.println("pradeep");
    }
}
public class StaticKeywordMethod extends one
{
    public void display()
    {
        System.out.println("king");
        super.display();
    }
    public static void main (String[]args)
    {
        StaticKeywordMethod obj = new StaticKeywordMethod();
        obj.display();
    }
}
