class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5,6,7,8,9,10};
int sum=0;
float avg=0;
for(int b:a)
{
sum=sum+b;
avg=sum/2;
}
System.out.println(avg);
}
}
Output:
27.0
