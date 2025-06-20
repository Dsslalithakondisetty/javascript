import java.util.Scanner;
class spec_val
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter size: ");
int n = s.nextInt();
int arr[]= new int[n];
System.out.println("Enter elements:");
for(int i = 0; i < n; i++)
{
arr[i] = s.nextInt();
}
System.out.print("Enter value to check: ");
int val = s.nextInt();
int foundIndex=-1;
for(int i = 0; i < n; i++)
{
if(arr[i]==val)
{
foundIndex=i;
break;
}
if(foundIndex!=-1)
{
System.out.println("The specific value contains in an array");
}
else
{
System.out.println("The specific value is not contains in an array");
}
}
}
}
