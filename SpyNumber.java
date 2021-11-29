import java.util.Scanner;  
public class SpyNumber
{  
public static void main(String args[])  
{   
int p, product=1, sum=0, lastdigit;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number to check: " );  
p=sc.nextInt();    
while(p>0)  
{    
lastdigit=p%10;  
sum=sum+lastdigit;  
product=product*lastdigit;  
p=p/10;  
} 
if(sum==product)  
System.out.println("The given number is a spy number.");  
else  
System.out.println("The given number is not a spy number.");  
}  
}  
