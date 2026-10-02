import java.util.Scanner;
public class Sum2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter limit:");
int n=sc.nextInt();
int sum=0;
for(int i=0;i<=n;i++)
{
sum+=i;
}
System.out.println("Sum of "+n+"numbers is"+sum);
}
}