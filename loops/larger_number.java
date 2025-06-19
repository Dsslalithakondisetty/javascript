import java.util.Scanner;
class Larger_number
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter three numbers:");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if((a>=b) && (a>=c))
{
System.out.println("a number is larger");
}
else if((a>=b) && (a>=c))
{
System.out.println("b number is larger");
}
else
{
System.out.println("c number is larger");
}
}
}
Output:
Enter three numbers:
10
12
15
c number is larger