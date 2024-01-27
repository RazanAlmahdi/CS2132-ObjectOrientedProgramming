/*
QUESTION 1 - EXERCICE 1.8 PAGE 31
(Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle that has a radius that is given by the user using the following formula:
perimeter = 2 * radius * PI
area = radius * radius * PI
*/
public class Q1
{
	public static void main(String[] args)
	{
		double radius, pi, perimeter, area;
		java.util.Scanner input = new java.util.Scanner(System.in);
		pi = 3.14;
		radius = input.nextDouble();
		perimeter = 2 * radius * pi;
		area = radius * radius * pi;
		System.out.println ("perimeter = " + perimeter + "\narea" + area);
	}
}
