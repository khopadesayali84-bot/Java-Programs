import java.util.Scanner;
public class Perfect
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int count=0,sum=0;
    for(int i=1;i<n;i++)
    {
      if(n%i==0)
      {
      sum=sum+i;
      count++;
      }
    }
    if(count>0 && sum==n)
    System.out.println(n+" is a Perfect Number and its divisors sum is:"+sum);
    else
    System.out.println(n+" is not a Perfect Number");
  }
}