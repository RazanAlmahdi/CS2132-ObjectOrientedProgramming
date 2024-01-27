/*
QUESTION 3 – EXERCISE 10.23 PAGE 407
(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new class MyString1): 
public MyString1(char[] chars);
public char charAt(int index);
public int length();
public MyString1 substring(int begin, int end); 
public MyString1 toLowerCase(); 
public boolean equals(MyString1 s); 
public static MyString1 valueOf(int i);
*/
public class MyString1
{
	// data members
	private char[] chars;
	
	// methods
	
	public MyString1(char[] chars) //constructor
	{
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++)
			this.chars[i] = chars[i];
	}
	public char charAt(int index)
	{
		return chars[index];
	}
	public int length()
	{
		return chars.length;
	}
	public MyString1 substring(int begin, int end)
	{
		char[] c = new char[end - begin];
		int i = begin;
		
		for (int j = 0; i < end; i++, j++)
		{
		 	c[j] = chars[i];
		}
		return new MyString1(c); 
	}
	public MyString1 toLowerCase()
	{
		char[] c = new char[chars.length];
		for (int i = 0; i < chars.length; i++)
		{
			if (chars[i] >= 'A' && chars[i] <= 'Z')
				c[i] = (char)(chars[i] + 32);
			else
				c[i] = chars[i];
		}
		return new MyString1(c);
	}
	public boolean equals(MyString1 s)
	{
		if (chars.length != s.length())
			return false;
		for (int i = 0; i < chars.length; i++)
		{
			if(chars[i] != s.charAt(i))
				return false;
		}
		return true;
	}
	public static MyString1 valueOf(int i)
	{
		int length = 0; 
		int n = i;
		while (n >= 1)
		{
			n /= 10;
			length++;
		}
		char[] ch = new char[length];
		
		for (int j = 0, k = (int)Math.pow(10, length - 1); j < length; j++, k /= 10)
		{
			ch[j] = Character.forDigit((i / k), 10);
			i %= k; 
		}

		return new MyString1(ch);
	}
}
