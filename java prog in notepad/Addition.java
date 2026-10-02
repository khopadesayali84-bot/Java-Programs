import java.util.Scanner;
public class Addition
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=a+b;
		System.out.println("Addition of two numbers is:"+ans);
	}
}