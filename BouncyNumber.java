import java.util.*;  
public class BouncyNumber  
{  
public static void main(String args[])   
{  
Scanner scan = new Scanner(System.in);  
System.out.print("Enter any number you want to check: ");  
int inputNumber = scan.nextInt();     
if (isIncreasing(inputNumber) || isDecreasing(inputNumber) || inputNumber < 101)   
System.out.println(inputNumber+" not a bouncy number.");  
else    
System.out.println(inputNumber+" is a bouncy number.");  
}  
public static boolean isIncreasing(int inputNumber)   
{  
String str = Integer.toString(inputNumber);  
char digit;  
boolean flag = true;  
for(int i=0;i < str.length()-1;i++)   
{  
digit = str.charAt(i);    
if(digit > str.charAt(i+1))   
{     
flag = false;  
break;  
}      
}  
return flag;  
}  
public static boolean isDecreasing(int inputNumber)   
{    
String str = Integer.toString(inputNumber);  
char digit;    
boolean flag = true;   
for(int i=0;i < str.length()-1;i++)   
{  
digit = str.charAt(i);  
if(digit < str.charAt(i+1))   
{  
flag = false;  
break;  
}      
}  
return flag;          
}  
}  
