import java.util.Scanner;
public class Swap
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers: ");
int a=sc.nextInt();
int b=sc.nextInt();
int temp=0;
System.out.println("\n\nBefore Swapping:");
System.out.println("Value of a:"+ a + " and b:" + b);
temp=a;
a=b;
b=temp;
System.out.println("\n\nAfter swapping:");
System.out.println("Value of a:" + a + " and b:" + b);
}
}