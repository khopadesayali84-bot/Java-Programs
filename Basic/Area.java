import java.util.Scanner;

public class Area{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        int l=sc.nextInt();
        System.out.println("Enter breadth of rectangle:");
        int b=sc.nextInt();
        int recarea= l*b;
        System.out.println("Area of rectangle:"+ recarea);
        System.out.println("Enter side of square:");
        int side=sc.nextInt();
        int squarea=side*side;
        System.out.println("Area of square:"+squarea);
        System.out.println("Enter radius of circle:");
        int r1=sc.nextInt();
        float cirarea= 3.14f*r1*r1;
        float cirvol= 2*3.14f*r1;
        System.out.println("Area of circle:"+cirarea);
        System.out.println("Volume of circle:"+cirvol);
        System.out.println("Enter base of triangle:");
        int base1=sc.nextInt();
        System.out.println("Enter height of triangle:");   
        int height1=sc.nextInt();
        float triarea= 1.5f*base1*height1;  
        System.out.println("Area of Triangle:"+triarea);
        System.out.println("Enter height of cylinder:");   
        int h2=sc.nextInt();
         System.out.println("Enter radius of cylinder:");
        int r2=sc.nextInt();
        float cyvol=2*3.14f*r2*r2*h2;  
        System.out.println("Area of cylinder:"+cyvol);
    }
}