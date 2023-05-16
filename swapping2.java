//pre-defined instance variable(with 3 variable)
class A
{
int a=8;
int b=10;
public static void main(String args[])
{
A obj=new A();
int c;
System.out.println("Before swapping ="+obj.a+"  "+obj.b);
c= obj.a;
obj.a=obj.b;
obj.b=c;
System.out.println("After swapping ="+obj.a+"  "+obj.b);
}
}