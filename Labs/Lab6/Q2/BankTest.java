/*
 (Subclasses of Account) In Programming Exercise 9.7, the Account class was defined to model a bank account. An 
account has the properties account number, balance, annual interest rate, and date created, and methods to deposit 
and with- draw funds. Create two subclasses for checking and saving accounts. A checking account has an 
overdraft limit, but a savings account cannot be overdrawn. 
Draw the UML diagram for the classes and then implement them.
Write a test program that creates objects of Account, SavingsAccount, and CheckingAccount and invokes their toString() methods. 
 */
public class BankTest
{
	public static void main(String[] args)
	{
		Account a = new Account(123, 5000);
		System.out.println(a.toString() + "\n");
		
		CheckingAccount c = new CheckingAccount(123, 2000, 1000);
		System.out.println(c.toString() + "\n");
		
		SavingsAccount s = new SavingsAccount(789, 1000);
		System.out.println(s.toString());
	}
}
