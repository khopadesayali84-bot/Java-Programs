import java.util.Scanner;
public class Neon
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\nNeon number is a number where the sum of all digits of square is equal to the number\nFor Example.Square of 9 is 81 and 8+1=9");
System.out.println("\nEnter a number to check if it is neon or not: ");
int n=sc.nextInt();
int rev=0,neon=0;
int sq=n * n;
int temp=sq;
while(sq>0)
{
rev=sq%10;
neon=neon+rev;
sq=sq/10;
}
if(neon == n)
{
System.out.println(n + " is a neon number");
}
else
{
System.out.println(n + " is not neon number");
}
}
}