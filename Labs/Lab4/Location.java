/*
QUESTION 3 – EXERCISE 9.13 PAGE 364
12. (The Location class) Design a class named Location for locating a maximal value and its location in a twodimensional array. The class contains public data fields row, column, and maxValue that store the maximal value 
and its indices in a two-dimensional array with row and column as int types and maxValue as a double type. 
Write the following method that returns the location of the largest element in a two-dimensional array:
public static Location locateLargest(double[][] a) 
The return value is an instance of Location. Write a test program that prompts the user to enter a two-dimensional 
array and displays the location of the largest element in the array.
*/
import java.util.Scanner;
public class Location
{
	public int row;
	public int column;
	public double maxValue;
	
	public Location(int r, int c, double m)
	{
		row = r;
		column = c;
		maxValue = m;
	}
	public static Location locateLargest(double[][] a)
	{
		int r = 0;
		int c = 0;
		double m = a[r][c]; //set the maximal value to the first element in the array
		
		for (int i = 0; i < a.length; i++) //number of rows of the passed array
		{
			for (int j = 0; j < a[i].length; j++) //number of columns of the passed array
			{
				if (a[i][j] > m )
				{
					m = a[i][j];
					r = i;
					c = j;
				}
			}
		}
		return new Location(r, c, m);
	}
	
	public static void main(String[] args)
	{

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] arr = new double[row][column];
        for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				arr[i][j] = input.nextDouble();
			}
		}
        Location l = Location.locateLargest(arr);
        System.out.println("The location of the largest element is "
                			+ l.maxValue + " at (" + l.row + ", " + l.column + ")");
	}
}
