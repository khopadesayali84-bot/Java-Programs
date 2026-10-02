import java.util.Scanner;
public class Trimorphic
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("\n\nEnter a number to check if it is Trimorphic or not: ");
int n=sc.nextInt();
int temp=n,rev=0,count=0,modval=1;
while(temp>0)
{
count++;
temp=temp/10;
}
int cub=n*n*n;
for(int i=1;i<=count;i++)
{
modval=modval*10;
}
rev=cub%modval;
if(n==rev)
{
System.out.println(n + " is a Trimorphic number");
}
else
{
System.out.println(n + " is not Trimorphic number");
}
}
}