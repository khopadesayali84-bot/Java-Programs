public class PatternTen
{
    public static void main(String[] args)
    {
        int n=4;
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=n+(i-1);j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<n+1-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}