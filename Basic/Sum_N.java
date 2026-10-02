import java.util.Scanner;

public class Sum_N
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("Factorial is :"+ sum);
    }
}