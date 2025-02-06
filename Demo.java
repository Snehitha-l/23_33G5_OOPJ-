class Demo
{
  Demo()
{  
  System.out.println("empty Constructor");
}
   Demo(int a)
{
   a=a*a;
   System.out.println("a value is a:"+a);
}
}
class ConstructorOverloading
{
   public static void main(String[] args)
{
   Demo obj1=new Demo(6);
   Demo obj2=new Demo();
}
}