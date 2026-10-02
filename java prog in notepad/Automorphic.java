import java.util.Scanner;
public class Automorphic
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\n\nEnter a number to check if it is Automorphic or not: ");
int n=sc.nextInt();
int temp=n,count=0,modval=1;
while(temp>0)
{
count++;
temp=temp/10;
}
int sq=n*n;
for(int i=1;i<=count;i++)
{
modval=modval*10;
}
int rev=sq%modval;
if(n==rev)
{
System.out.println(n + " is a Automorphic number");
}
else
{
System.out.println(n + " is not Automorphic number");
}
}
}