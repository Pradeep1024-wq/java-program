import java.util.*;   
public class SunnyNumber
{   
public static void main(String args[])   
{   
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number to check: ");   
int p=sc.nextInt();   
isSunnyNumber(p);   
}        
static boolean findPerfectSquare(double num)   
{    
double square_root = Math.sqrt(num);     
return((square_root - Math.floor(square_root)) == 0);   
}   
static void isSunnyNumber(int p)   
{   
if (findPerfectSquare(p + 1))   
{   
System.out.println("The given number is a sunny number.");   
}
else  
{   
System.out.println("The given number is not a sunny number.");   
}   
}   
}  
