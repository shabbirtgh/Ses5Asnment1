import java.util.Scanner;
abstract class Figure
{
	double dim1;
	abstract void findArea();
	abstract void findPerimeter();
}

class Circle extends Figure
{
	//dim1 = Integer.parseInt(System.console().readLine());
	double radius;
	Scanner sc = new Scanner(System.in);
	void findArea()
	{
		System.out.println("Enter the radius of circle : ");
		radius = sc.nextInt();
		double area = (Math.pow(radius,2)*22)/(2*7);
		System.out.println("Area of the circle with radius "+radius+" is : "+area);
	}
	public void findPerimeter()
	{
		double perimeter = (2*22*radius)/7;
		System.out.println("Perimeter of the circle with radius "+radius+" is : "+perimeter);
	}
}

class Rectangle extends Figure
{
	int length;
	int breadth;
	Scanner sc = new Scanner(System.in);
	public void findArea()
	{
		System.out.println("Enter the length of Rectangle : ");
		length = sc.nextInt();
		System.out.println("Enter the breadth of Rectangle : ");
		breadth = sc.nextInt();
		double area = (length*breadth);
		System.out.println("Area of the Rectangle is : "+area);
	}
	public void findPerimeter()
	{
		double perimeter = 2*(length+breadth);
		System.out.println("Perimeter of the Rectangle is : "+perimeter);
	}
}
class Triangle extends Figure
{
	double side,height;
	Scanner sc = new Scanner(System.in);
	public void findArea()
	{
		
		System.out.println("Enter the legth of a side of equilateral Triangle : ");
		side = sc.nextInt();
		double a = (Math.pow(side/2, 2))+Math.pow(side, 2);
		height = Math.sqrt(a);
		double area = (side*height)/2;
		System.out.println("Area of the Traingle is : "+area);
	}
	public void findPerimeter()
	{
		double perimeter = side*3;
		System.out.println("Perimeter of the Traingle is : "+perimeter);
	}
}

public class AbstractClass 
{
	public static void main(String[] args) 
	{		
		Circle obj = new Circle();
		obj.findArea();
		obj.findPerimeter();
		
		Rectangle obj1 = new Rectangle();
		obj1.findArea();
		obj1.findPerimeter();
		
		Triangle obj2 = new Triangle();
		obj2.findArea();
		obj2.findPerimeter();

	}

}