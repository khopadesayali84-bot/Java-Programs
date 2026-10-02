import java.util.Scanner;
class Operation
{
    private int x;
    public void setVal(int x)
    {
        this.x=x;
    }
    public void isArmstrong()
    {
        int sum=0,temp=x;
        while(x>0)
        {
            int r=x%10;
            sum=sum+(r*r*r);
            x=x/10;
        }
        if(temp==sum)
        {
            System.out.println("Is a Armstrong Number....");
        }
        else{
            System.out.println("Is not a Armstrong Number....");
        }
    }
    public void isPalin()
    {
        int sum=0,temp=x;
        while(x>0)
        {
            int r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if(temp==sum)
        {
            System.out.println("Is a Palindrome Number....");
        }
        else{
            System.out.println("Is not a Palindrome Number....");
        }
    }
    public void isPerfect()
    {
        int sum=0;
        for(int i=1;i<x;i++)
        {
          if(x%i==0)
          {
            sum=sum+i;
          }
        }
        if(sum==x)
        {
          System.out.println("Is  a Perfect Number....");  
        }
        else{
            System.out.println("Is not a Perfect Number....");
        }
    }
    public void factorial()
    {
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of Number is : "+fact);  
    }
    public void isPrime()
    {
        int count=0;
        for(int i=2;i<x;i++)
        {
          if(x%i==0)
          {
            count++;
          }
        }
        if(count==0)
        {
            System.out.println("Is a Prime Number....");
        }
        else{
            System.out.println("Is not a Prime Number....");
        }
    }
}
public class NumberCheck
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Operation obj=new Operation(); while(true)
        {
        System.out.println("Enter Your Choice : ");
        System.out.println("1.Armstrong Number ");
        System.out.println("2.Palindrome Number ");
        System.out.println("3.Perfect Number ");
        System.out.println("4.Prime Number ");
        System.out.println("5.Find Factorial ");
         System.out.println("6.Exit");
        int ch=sc.nextInt();
       
            switch(ch)
            {
                case 1:
                    obj.setVal(153);
                    obj.isArmstrong();
                    break;
                case 2:
                    obj.setVal(121);
                    obj.isPalin();
                    break;
                case 3:
                    obj.setVal(6);
                    obj.isPerfect();
                    break;
                case 4:
                    obj.setVal(3);
                    obj.isPrime();
                    break;
                case 5:
                    obj.setVal(5);
                    obj.factorial();
                    break;
                    case 6:System.exit(0);
                default:
                    System.out.println("Enter a valid choice...");
            }
        }

        

    }
}