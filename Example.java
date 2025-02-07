abstract class Shape{
abstract void area();
}
class Circle extends Shape{
int radius;
Circle(int r)
{
radius=r;
}
void area()
{
System.out.println("area of Circle is:"+3.14*radius*radius);
}
}
class Rectangle extends Shape{
int length,breadth;
Rectangle(int l,int b)
{
length=l;
breadth=b;
}
void area()
{
System.out.println("area of Rectangle is:"+length*breadth);
}
}
class  Example{
public static void main(String[] args)
{
Circle obj1=new Circle(5);
obj1.area();
Rectangle obj2=new Rectangle(10,15);
obj2.area();
}
}

Output:
D:\33g5>javac Example.java


D:\33g5>java Example.java
area of Circle is:78.5
area of Rectangle is:150
