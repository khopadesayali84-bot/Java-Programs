import java.util.Scanner;
public class Armstrong
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();  
    int mul=0,rev=0,num=n;
    while(n>0)
    {
      rev=n%10;
      mul=mul+(rev*rev*rev);
      n=n/10;
    }
    if(mul==num)
    System.out.println(num+" is a Armstrong Number");
    else
    System.out.println(num+" is not a Armstrong Number");
  }
}