/*
Following the example of the Account class studied in the class, design a class of your choice. The class contains: 
* Three attributes.
* Three constructors.
* Three methods.
Draw the UML diagram for the class and then implement the class. Write a test program that creates two objects
with attributes values entered by the user (use Scanner class to read input from the user), then call the methods for 
each object. Use JOptionPane class to show output of the methods
*/
import javax.swing.JOptionPane;
public class Student
{
	// three attributes
	String name;
	String id;
	double gpa;
	// constructor 1: default
	public Student()
	{
		name = null;
		id = null;
		gpa = 0;
	}
	// constructor 2: overloaded with 3 parameters (all attributes)
	public Student(String n, String i, double g)
	{
		name = n;
		id = i;
		gpa = g;
	}
	// constructor 3: overloaded with only 2 parameters
	public Student(String n, String i)
	{
		name = n;
		id = i;
	}
	// 3 methods
	public String getAcademicStanding()
	{
		String standing = null;
		if (gpa >= 3)
		standing = "Excellent";
		else if (gpa < 3 && gpa >= 2)
		standing = "Good";
		else if (gpa < 2 && gpa >= 0.99)
		standing = "Risky";
		else if (gpa < 0.99 && gpa >= 0)
		standing = "Fail";
		return standing;
	}
	public boolean getDeansList()
	{
		boolean deansList = false;
		if (gpa >= 3)
		deansList = true;
		return deansList;
	}
	public String getNameAndId()
	{
		return name+" "+id;
	}
	
	//the main function
	public static void main(String args[])
	{
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Please enter the first student\'s name: ");
		String n1 = input.nextLine();
		System.out.println("Please enter the first student\'s id: ");
		String id1 = input.nextLine();
		System.out.println("Please enter the second student\'s name: ");
		String n2 = input.nextLine();
		System.out.println("Please enter the second student\'s id: ");
		String id2 = input.nextLine();
		System.out.println("Please enter the second student\'s GPA: ");
		double gpa2 = input.nextDouble();
		Student s1 = new Student(n1, id1);
		Student s2 = new Student(n2, id2, gpa2);
		String msg1 = s1.getNameAndId();
		String msg2 = s2.getNameAndId() + ", Academic Standing: " + s2.getAcademicStanding() + ",Dean\'s List: " + s2.getDeansList();
		JOptionPane.showMessageDialog( null, msg1, "First student\'s data", JOptionPane.INFORMATION_MESSAGE );
		JOptionPane.showMessageDialog(null, msg2 , "Second student\'s data", JOptionPane.INFORMATION_MESSAGE);
	}
}
