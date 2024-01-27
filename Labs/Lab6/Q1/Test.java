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
public class Test
{
	public static void main(String[] args)
	{
		Person p = new Person("Reem", new Address("SA", "Jeddah", "Street"), "0506321951", "Reem@gmail.com");
		System.out.println(p.toString());
		
		Student s = new Student("Leen", new Address("SA", "Jeddah", "Faisalia"), "0512345678", "Leen@effat.edu.sa", Student.getSTATUS1());
		System.out.println("\n" + s.toString());
		
		Employee e = new Employee("Akila", new Address("SA", "Jeddah", "Khuzam"), "0501223461", "Akila@effatuniversity.edu.sa", "CoE145", 10000000);
		System.out.println("\n" + e.toString());
		
		Faculty f = new Faculty("Moh", new Address("SA", "Jeddah", "Obhur"), "0598776310", "Moh@effatuniversity.edu.sa", "A&R313", 100000, "12:30 - 2:20", "prof");
		System.out.println("\n" + f.toString());
		
		Staff staff = new Staff("Dana", new Address("SA", "Jeddah", "Rawda"), "0587927105", "Dana@effatuniversity.edu.sa", "A&R304", 5000, "instructor");
		System.out.println("\n" + staff.toString());
		
	}
}
