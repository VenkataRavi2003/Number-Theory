import java.util.Scanner;
class AreaOfCircle
{
public static void main(String...args)
{
double radius;
System.out.print("ENTER THE RADIUS VALUE = ");
Scanner p=new Scanner(System.in);
radius=p.nextInt();
double area=3.141*radius*radius;
System.out.print("Area of the Circle is = " + area);
}
}
