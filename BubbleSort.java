import java.util.Scanner;
class BubbleSort
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no of elements in the array");
int n=sc.nextInt();
int[]ar=new int[n];
System.out.println("enter the elements into the array");
int j;
for(int i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
for(int i=0;i<n-1;i++)
{
for(j=0;j<n-i-1;j++)
{
if(ar[j]>ar[j+1])
{
 int temp=ar[j];
 ar[j]=ar[j+1];
 ar[j+1]=temp;
}
}
}
System.out.println("sorted array");
for(int i=0;i<n;i++)
{
System.out.println(ar[i]);
}
}
}

Output:
C:\Users\lakku\OneDrive\Documents\33g5>javac Bubblesort.java

C:\Users\lakku\OneDrive\Documents\33g5>java BubbleSort
enter no of elements in the array
5
enter the elements into the array
10
50
13
3
25
sorted array
3
10
13
25

