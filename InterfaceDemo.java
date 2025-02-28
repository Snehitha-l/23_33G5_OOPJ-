interface Animal
{
void makesound();
}
class Cat implements Animal
{
public void makesound()
{
System.out.println("cat meowow");
}
}
class Dog implements Animal
{
public void makesound()
{
System.out.println("Dog Barks");
}
}
class InterfaceDemo
{
public static void main(String[] args)
{
Cat obj1=new Cat();
obj1.makesound();
Dog obj2=new Dog();
obj2.makesound();
}
}

Output:
D:\33g5>javac InterfaceDemo.java

D:\33g5>java InterfaceDemo
cat meowow
Dog Barks