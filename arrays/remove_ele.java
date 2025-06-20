import java.util.Scanner;
 class Remove_Ele
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter size: ");
int a = s.nextInt();
int arr[] = new int[a];
System.out.println("Enter elements:");
for(int i=0; i<a; i++)
{
arr[i] = s.nextInt();
}
System.out.print("Enter value to remove: ");
int val = s.nextInt();
System.out.print("Array after removal: ");
for(int i=0; i<a; i++) 
if(arr[i]!=val) 
{
System.out.print(arr[i]+" ");
}
}
}
Output:
Enter size: 3
Enter elements:
1
2
3
Enter value to remove: 3
Array after removal: 1 2