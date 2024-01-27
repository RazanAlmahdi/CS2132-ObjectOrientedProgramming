/*
 (Subclasses of Account) In Programming Exercise 9.7, the Account class was defined to model a bank account. An 
account has the properties account number, balance, annual interest rate, and date created, and methods to deposit 
and with- draw funds. Create two subclasses for checking and saving accounts. A checking account has an 
overdraft limit, but a savings account cannot be overdrawn. 
Draw the UML diagram for the classes and then implement them. Write a test program that creates objects of 
Account, SavingsAccount, and CheckingAccount and invokes their toString() methods. 
 */
public class SavingsAccount extends Account
{
	public SavingsAccount()
	{
		super();
	}
	public SavingsAccount(int id, double balance)
	{
		super(id, balance);
	}
	@Override
	public double withdraw(double amount)
	{
		if (balance < amount)
			return 0;
		else
			return amount; //balance-=amount; how would it change the balance?
	}
	@Override
	public String toString()
	{
		return this.getClass() + "\nID: " + id + "\nBalance: " + balance + "\nDate Created: " + dateCreated;
	}
}
