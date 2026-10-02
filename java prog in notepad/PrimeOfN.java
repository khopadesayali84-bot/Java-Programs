import java.util.Scanner;
public class PrimeOfN
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a limit:");
    int n=sc.nextInt();  
int count=0,cnt=0;
for(int i=1; ;i++)
{
count=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==2)
{
System.out.print(i + " ");
cnt++;
}
if(cnt==n)
{
break;
}
}
}
}