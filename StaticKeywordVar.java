// super keyword as variable 

class one 
{
    String name = "pradeep";
}
public class StaticKeywordVar extends one
{
    String name = "king";
    public void display()
    {
        System.out.println(name);
        System.out.println(super.name);
    }
    public static void main (String[]args)
    {
        StaticKeywordVar obj = new StaticKeywordVar();
        obj.display();
    }
}
