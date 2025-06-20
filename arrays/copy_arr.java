import java.util.Scanner;
 class Cp_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size: ");
        int a = s.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter " + a + " elements:");
        for(int i=0; i<a; i++) 
{
arr[i] = s.nextInt();
}
int copy[] = new int[a];
for(int i=0; i<a; i++) 
{
copy[i] = arr[i];
}
System.out.print("Copied array: ");
for(int i=0; i<a; i++)
{
System.out.print(copy[i]+" ");
}
}
}