import java.util.*;
class Rectangle
{
double length;
double width;
void readAttributes()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter length");
length=sc.nextDouble();
System.out.println("Enter width");
width=sc.nextDouble();
}
double calculateArea()
{
double area;
area=length*width;
return area;
}
double calculatePerimeter()
{
double perimeter;
perimeter=2*(length+width);
return perimeter;
}
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.readAttributes();
System.out.println(r.calculateArea());
System.out.println(r.calculatePerimeter());
}
}

