import java.util.*;
class Circle
{
public static void main (String args[])
{
 Scanner sc = new Scanner (System.in);
 System.out.println("Enter the Radius of Circle: ");
 float r = sc.nextFloat();
 float a,p,pi=3.14f;
 a=pi*r*r;
 p=2*pi*r;
 System.out.println("Area of Circle: "+a);
 System.out.println("Perimeter of Circle: "+p);
}
}