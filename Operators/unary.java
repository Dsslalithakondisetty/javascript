class Unary
{
public static void main(String[] args)
{
int a=9, b=5;
System.out.println(a++);
System.out.println(a--);
System.out.println(b++);
System.out.println(b--);
System.out.println(++a);
System.out.println(--b);
System.out.println(++b);
System.out.println(--a);
System.out.println(a++ - --a + ++a + a++ - --a - a++);
}
}