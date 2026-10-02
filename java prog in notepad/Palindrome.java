import java.util.Scanner;
public class Palindrome
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();  
    int palin=0,rev=0,num=n;
    while(n>0)
    {
      rev=n%10;
      palin=palin*10+rev;
      n=n/10;
    }
    if(n==palin)
    System.out.println(num+" is a Palindrome Number");
    else
    System.out.println(num+" is not a Palindrome Number");
  }
}