import java.util.Scanner;
class Largest_num_If_else 
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter three numbers:");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int largest;
if (a >= b && a >= c)
{
largest = a;
} 
else if (b >= a && b >= c) 
{
largest = b;
}
else 
{
largest = c;
 }
System.out.println("Largest number is: " + largest);
}
}
Output:
Enter three numbers:
20
10
30
Largest number is: 30