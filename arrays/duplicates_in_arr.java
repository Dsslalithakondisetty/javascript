import java.util.Scanner;
class Duplicates_in_arr
{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter size: ");
int a = s.nextInt();
int arr[] = new int[a];       
System.out.println("Enter elements:");
for(int i = 0; i < a; i++)
{
arr[i] = s.nextInt();
}      
System.out.print("Duplicates: ");
int count = 0;
for(int i = 0; i < a; i++) 
{  
for(int j = i + 1; j < a; j++)
 { 
if(arr[i] == arr[j])
 {   
int alreadyPrinted = 0;
for(int k = 0; k < i; k++)
 {
if(arr[k] == arr[i]) 
{
alreadyPrinted = 1;
break;
 }
}
if(alreadyPrinted == 0) 
{
System.out.print(arr[i] + " ");
count++;
 }
break;
 }
 }
 }
if(count == 0) {
System.out.print("None");
 }
 }
}
Output:
Enter size: 3
Enter elements:
456
654
546
Duplicates: None