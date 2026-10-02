import java.util.Scanner;
public class Reverse
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int rev=0,temp=0;
    while(n>0)
    {
    temp=n%10;
    rev=rev*10+temp;
    n=n/10;
    }
    System.out.println("Reverse of number is"+rev);
  }
}