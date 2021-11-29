import java.util.*;  
public class NeonNumber 
{  
public static void main(String args[])  
{  
int sum = 0, p;      
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number to check: ");  
p = sc.nextInt();    
int square = p * p;  
while(square != 0)  
{   
int digit = square % 10;   
sum = sum + digit;  
square = square / 10;  
}  
if(p == sum)  
System.out.println(p + " is a Neon Number.");  
else  
System.out.println(p + " is not a Neon Number.");  
}  
}  
