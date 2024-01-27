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
public class Address
{
	private String country;
	private String city;
	private String street;
	public Address() {}
	public Address(String country, String city, String street)
	{
		this.country = country;
		this.city = city;
		this.street = street;
	}
	public String getCountry()
	{
		return country;
	}
	public String getCity()
	{
		return city;
	}
	public String getStreet()
	{
		return city;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setStreet(String street)
	{
		this.street = street;
	}
	public String toString()
	{
		return "\nCountry: " + country + "\nCity: " + city + "\nStreet: " + street;
	}
}
