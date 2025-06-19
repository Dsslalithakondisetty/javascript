
import java.util.Scanner;
class Switch_even_odd
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int a=s.nextInt();
int b=a%2;
switch(b)
{
case 1:
System.out.println(a + "The number is even");
break;

case 2:
System.out.println(a + "The number is odd");
break;
default:
System.out.println("Error");
break;
}
}
}