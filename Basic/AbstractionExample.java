import java.util.Scanner;
abstract class Circle
{
    protected int r;
    protected static float pi=3.14f;
    public void accept(int r)
    {
        this.r=r;
    }
    abstract void area();
    abstract void circum();
}
class Area extends Circle
{
    public void area()
    {
        // double a=pi*(r*r);
        System.out.println("Area of circle: "+pi*r*r);
    }
     public void circum()
    {
        // double a=pi*(r*r);
        System.out.println("Area of circle: "+2*pi*r);
    }
}
public class AbstractionExample
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter radius: ");
    int r=sc.nextInt();
    Circum obj=new Circum();
    obj.accept(r);
    obj.area();
    obj.circum();
    }
}