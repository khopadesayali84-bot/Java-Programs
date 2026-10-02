import java.util.Scanner;
public class Happy
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\n\nEnter a number to check if it is Happy or not: ");
int n=sc.nextInt();
int temp=n,rev=0,sum=0;
while(sum!=1 && sum!=4)
{
sum=0;
while(n!=0)
{
rev= n % 10;
sum=sum + (rev*rev);
n= n / 10;
}
n=sum;
}
if(sum == 1)
{
System.out.println(temp + " is a Happy number");
}
else
{
System.out.println(temp + " is not Happy number");
}
}
}