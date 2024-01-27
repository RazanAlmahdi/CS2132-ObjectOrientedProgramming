public class Q3
{
	public static void main(String[] args)
	{
		char[] c1 = {'R', 'e', 'e', 'm'};
		char[] c2 = {'H', 'e', 'l', 'l', 'o'};
		char[] c3 = {'O', 'O', 'P'};
		
		MyString1 s1 = new MyString1(c1);
		MyString1 s2 = new MyString1(c2);
		MyString1 s3 = new MyString1(c3);
		MyString1 s4 = new MyString1(c3);

		
		System.out.println("Char at index 2 in s1 is: " + s1.charAt(2));
		
		System.out.println("\n-----------------------------------------\n");
		
		System.out.println("length of s2 is: " + s2.length());
		
		System.out.println("\n-----------------------------------------\n");

		System.out.println("substring 1 to 3 of s1 is: ");
		MyString1 sub = s1.substring(1,3);
		for (int i = 0; i < sub.length(); i++)
			System.out.print(sub.charAt(i));

		System.out.println("\n-----------------------------------------\n");

		System.out.println("s3 in lower case is: ");
		MyString1 lower = s3.toLowerCase();
		for (int i = 0; i < lower.length(); i++)
			System.out.print(lower.charAt(i));
		
		System.out.println("\n-----------------------------------------\n");

		System.out.println("s3 equals s4 is: " + s3.equals(s4));
		
		System.out.println("\n-----------------------------------------\n");

		System.out.println("value of 15 as a string is: ");
		MyString1 myInt = MyString1.valueOf(15);
		for (int i = 0; i < myInt.length(); i++)
			System.out.print(myInt.charAt(i));
	}
}
