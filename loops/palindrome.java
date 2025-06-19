import java.util.Scanner;
class Palindrome
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter a number: ");
 int a = s.nextInt();
int originalNum = a;
int reversedNum = 0;
 while (a != 0) {
int digit = a % 10;
reversedNum = reversedNum * 10 + digit;
 a = a / 10;
}
if (originalNum == reversedNum)
System.out.println(originalNum + " is a palindrome.");
else
System.out.println(originalNum + " is not a palindrome.");
    }
}
Output:
Enter a number: 3773
3773 is a palindrome.