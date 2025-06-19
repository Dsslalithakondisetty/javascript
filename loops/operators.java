import java.util.Scanner;
class Operators
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter value:");
int a=s.nextInt();
int target=a;
for(int i=0;i<=a;i++)
{
if(i==target)
{
System.out.println(i + "is equal to" +  target);
}
else
{
System.out.println(i + "is not equal to" +  target);
}
}
}
}
Output:
Enter value:
5
0is not equal to5
1is not equal to5
2is not equal to5
3is not equal to5
4is not equal to5
5is equal to5