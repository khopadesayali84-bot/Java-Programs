import java.util.Scanner;
public class PerfectOfN
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit: ");
        int n=sc.nextInt();
        int count=0,sum=0;
        for(int i=1; ;i++)
        {
            sum=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum=sum+j;
                }
            }
            if(sum==i)
                {
                    System.out.print(i + " ");
                    count++;
                }
            if(count==n)
            {
                break;
            }
        }
    }
}