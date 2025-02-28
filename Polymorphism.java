class Animal
{
public void sound()
{
System.out.println("Animal make sound");
}
}
class Dog extends Animal
{
public void sound()
{
System.out.println("Dog Barks");
}
}
class Cat extends Animal
{
public void sound()
{
System.out.println("Cat meowow");
}
}
class Polymorphism
{
public static void main(String[] args)
{
Animal myAnimal=new Animal();
Animal myDog=new Dog();
Animal myCat=new Cat();
myAnimal.sound();
myDog.sound();
myCat.sound();
}
}

Output:
D:\33g5>javac Polymorphism.java
D:\33g5>java Polymorphism.java
Animal make sound
Dog Barks
Cat meowow