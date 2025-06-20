import java.util.Scanner;
class Index
{
public static void main(String[] args) 
{
Scanner s = new Scanner(System.in);
System.out.print("Enter size: ");
int a = s.nextInt();
int arr[] = new int[a];
System.out.println("Enter " + a + " elements:");
for(int i=0; i<a; i++) 
{
arr[i] = s.nextInt();
}
System.out.print("Enter value to find: ");
int val = s.nextInt();
int index = -1;
for(int i=0; i<a; i++) 
if(arr[i]==val)
{ 
index = i; 
break; 
}
System.out.println("Index: " + index);
}
}
Output:
Enter size: 3
Enter 3 elements:
2
3
4
Enter value to find: 4
Index: 2