/*
QUESTION 1 - EXERCICE 9.1 PAGE 360
(The Rectangle class) Following the example of the Account class studied in the class, design a class named 
Rectangle to represent a rectangle. The class contains: 
* Two double data fields named width and height that specify the width and height of the rectangle. The default 
values are 1 for both width and height. 
* A no-arg constructor that creates a default rectangle. 
* A constructor that creates a rectangle with the specified width and height. 
* A method named getArea() that returns the area of this rectangle. 
* A method named getPerimeter() that returns the perimeter. 
Draw the UML diagram for the class and then implement the class. Write a test program that creates two Rectangle 
objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9. Display the width, height, 
area, and perimeter of each rectangle in this order
*/
public class Rectangle
{
	double width;
	double height;
	public Rectangle()
	{
		width = 1;
		height = 1;
	}
	public Rectangle(double w, double h)
	{
		width = w;
		height = h;
	}
	public double getArea()
	{
		return width * height;
	}
	public double getPerimeter()
	{
		return 2*(width + height);
	}
	//the main function
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		System.out.println("First rectangle:" + "\nWidth = " + r1.width + "\nHeight = " + r1.height
		+ "\nArea = " + r1.getArea() + "\nPerimeter = " + r1.getPerimeter()
		+ "\n\nSecond rectangle:" + "\nWidth = " + r2.width + "\nHeight = " + r2.height);
		System.out.printf("Area = %.2f" , r2.getArea());
		System.out.println("\nPerimeter = " + r2.getPerimeter());
	}
}
