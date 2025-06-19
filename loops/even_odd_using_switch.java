import java.util.Scanner;
class Even_Odd_using_switch
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter a number: ");
 int a = s.nextInt();
switch (a % 2) {
 case 0:
System.out.println(a + " is even.");
 break;
case 1:
System.out.println(a + " is odd.");
break;
}
}
}
Output:
Enter a number: 10
10 is even.