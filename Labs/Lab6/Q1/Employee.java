/*
(The Person, Student, Employee, Faculty, and Staff classes)
Design a class named Person and its two subclasses named Student and Employee.
Make Faculty and Staff subclasses of Employee.
A person has a name, address, phone number, and email address.
A student has a class status (freshman, sophomore, junior, or senior).
Define the status as a constant.
An employee has an office, salary, and date hired.
Use the Date class to create an object for date hired.
A faculty member has office hours and a rank.
A staff member has a title.
Override the toString method in each class to display the class name and the person’s name. 
Draw the UML diagram for the classes and implement them.
Write a test pro- gram that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods. 
 */
import java.time.LocalDate;
public class Employee extends Person
{
	protected String office;
	protected double salary;
	protected LocalDate dateHired;
	public Employee()
	{
		dateHired = LocalDate.now();
	}
	public Employee(String n, Address a, String p, String e, String o, double s)
	{
		super(n, a, p, e);
		office = o;
		salary = s;
		dateHired = LocalDate.now();
	}
	public String getOffice()
	{
		return office;
	}
	public double getSalary()
	{
		return salary;
	}
	public LocalDate getDateHired()
	{
		return dateHired;
	}
	public void setOffice(String office)
	{
		this.office = office;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	@Override
	public String toString()
	{
		return this.getClass() + "\nname: " + name;
	}
}
