class Constructor
{
  int m,n;
  Constructor()
{
  m=20;
  n=15;
}
void display()
{
System.out.println("m value is:"+m + "n value is:"+n);
}
public static void main(String[] args)
{
Constructor obj1=new Constructor();
obj1.display();
Constructor obj2=new Constructor();
obj2.display();
}
}

Output:
C:\Users\lakku\OneDrive\Documents\33g5>javac Constructor.java

C:\Users\lakku\OneDrive\Documents\33g5>java Constructor
m value is:20 n value is:15
m value is:20 n value is:15