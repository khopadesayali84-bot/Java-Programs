import java.util.*;
public class Sunny
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\n\nEnter a number to check if it is Sunny or not: ");
int n=sc.nextInt();
int a=n+1;
double n1=Math.sqrt(a);
if(n1==(int)n1)
{
System.out.println(n + " is a Sunny number");
}
else
{
System.out.println(n + " is not Sunny number");
}
}
}