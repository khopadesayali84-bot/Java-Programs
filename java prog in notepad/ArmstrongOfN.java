import java.util.Scanner;
public class ArmstrongOfN
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit: ");
        int n=sc.nextInt();
        int count=0,sq=1,sum=0,rev,modval=0;
        for(int i=1; ;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int temp=j;
                sq=0;
                 while(temp>0)
                {
                temp=temp/10;
                modval++;
                }
                temp=j;
                while(temp>0)
                {
                rev=temp%10;
                for(int k=0;k<modval;k++)
                {
                    sq=sq*rev;
                }
                sum=sum + sq;
                temp=temp/10;
                }
                if(sum==j)
                {
                    System.out.print(j + " ");
                    count++;
                }
            }
            if(count==n)
            {
                break;
            }
        }
    }
}