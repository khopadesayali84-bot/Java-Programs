import java.util.Scanner;

public class Sum{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value");
        int a=sc.nextInt();
        System.out.println("Enter second value");
        int b=sc.nextInt();
        int sum= a+b;
        System.out.println("Addition is:"+sum);
        int sub= a-b;
        int mul= a*b;
        int div= a/b;
        System.out.println("Subtraction is:"+sub);
        System.out.println("Multiplication is:"+mul);
        System.out.println("Division is:"+div);
    }

}