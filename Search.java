import java.util.Scanner;
class Search
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no of elements in the array:");
int n =sc.nextInt();
int[] ar= new int[n];
System.out.println("enter the elements into the array");
for(int i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
System.out.println("Enter the key");
int key=sc.nextInt();
int low=0, high=n-1, result=1;
while(low<=high)
{
int mid=(low+high)/2;
if(ar[mid]==key)
{
result=mid;
break;
}
else if(ar[mid]>key)
{
high=mid-1;
}
else
{
low=mid+1;
}
}
if(result==-1)
{
System.out.println("element not found");
}
else
{
System.out.println("element found at position:"+ result);
}
}
}

Output:
C:\Users\lakku\OneDrive\Documents\33g5>javac Search.java

C:\Users\lakku\OneDrive\Documents\33g5>java Search
enter no of elements in the array:
4
enter the elements into the array
10
19
35
22
Enter the key
35
element found at position:2