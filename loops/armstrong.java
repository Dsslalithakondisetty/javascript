import java.util.Scanner;
class Armstrong{
public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
System.out.print("Enter a number: ");
int a = s.nextInt();
 int originalNumber = a;
int result = 0;
while (a != 0) {
int digit = a % 10;
result += digit * digit * digit;
 a /= 10;
}
if (result == originalNumber) {
System.out.println(originalNumber + " is an Armstrong number.");
} else {
System.out.println(originalNumber + " is not an Armstrong number.");
 }
s.close();
}
}
Output:
Enter a number: 1026
1026 is not an Armstrong number.