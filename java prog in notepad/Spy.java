import java.util.Scanner;
public class Spy
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\nA Spy number is a number where sum of all digits of provided number is equal to product of all digits\nFor Example, 1124 here sum=1+1+2+4=8 and product=1*1*2*4=8");
System.out.println("\n\nEnter a number to check if it is Spy or not: ");
int n=sc.nextInt();
int temp=n, sum=0,rev=0,product=1;
while(n>0)
{
rev= n % 10;
sum=sum + rev;
product=product*rev;
n= n / 10;
}
if(sum == product)
{
System.out.println(temp + " is a Spy number");
}
else
{
System.out.println(temp + " is not Spy number");
}
}
}