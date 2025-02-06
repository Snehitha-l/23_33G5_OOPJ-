class MethodOverloading
{
 public int sum(int a,int b,int c)
{
  return a+b+c;
}
public int sum(int a,int b)
{ 
   return a+b;
}
public double sum(double a,double b)
{
   return a+b;
}
public static void main(String[] args)
{
  MethodOverloading obj=new MethodOverloading();
  int c=obj.sum(1,5,9);
  System.out.println(c);
}
}


output:
C:\Users\lakku\OneDrive\Documents\33g5>javac MethodOverloading.java

C:\Users\lakku\OneDrive\Documents\33g5>java MethodOverloading
15






   
