// super keyword as constructor
class one 
{
    one()
    {
        System.out.println("this is class one");
    }
}
public class SuperKeywordConstructor extends one
{
    SuperKeywordConstructor()
    {
        super();
        System.out.println("this is class two");
    }
    public static void main (String[]args)
    {
        SuperKeywordConstructor obj = new SuperKeywordConstructor();
    }
}
