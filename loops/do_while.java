import java.util.Scanner;
class d0_while
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number is:");
int a=s.nextInt();
int i=a;
do{
System.out.println(i);
i++;
}while(i<=10);
}
}
Output:
Enter the number is:
1
1
2
3
4
5
6
7
8
9
10