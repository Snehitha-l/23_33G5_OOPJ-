class A
{
int i,j;
void display1(int a,int b)
{
i=a;
j=b;
System.out.println("This is a parent class");
System.out.println(i);
System.out.println(j);
}
}
class B extends A{
void display2(){
System.out.println("This is a sub class");
}
}
class SingleInheritance{
public static void main(String[] args)
{
A obj1=new A();
obj1.display1(10,15);
B obj2=new B();
obj2.display2();
}
}


Output:
D:\33g5>javac SingleInheritance.java

D:\33g5>java SingleInheritance
This is a parent class
10
15
This is a sub class