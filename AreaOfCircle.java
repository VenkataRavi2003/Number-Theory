import java.util.Scanner;
public class AreaOfCircle{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter the radius : ");
    double radius = sc.nextDouble();

    double area_of_circle = Math.PI * radius * radius;
    System.out.println("\nArea of the circle is : "+area_of_circle);
    sc.close();
  }
}
