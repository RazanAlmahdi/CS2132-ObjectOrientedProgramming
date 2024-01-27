/*
 (Subclasses of Account) In Programming Exercise 9.7, the Account class was defined to model a bank account. An 
account has the properties account number, balance, annual interest rate, and date created, and methods to deposit 
and with- draw funds. Create two subclasses for checking and saving accounts. A checking account has an 
overdraft limit, but a savings account cannot be overdrawn. 
Draw the UML diagram for the classes and then implement them. Write a test program that creates objects of 
Account, SavingsAccount, and CheckingAccount and invokes their toString() methods. 
 */
public class CheckingAccount extends Account
{
	private double overdraftLimit;
	public CheckingAccount()
	{
		super();
	}
	public CheckingAccount(int id, double balance, double overdraftLimit)
	{
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	public void setOverdraftLimit(double overdraftLimit)
	{
		this.overdraftLimit = overdraftLimit;
	}
	public double getOverdraftLimit()
	{
		return overdraftLimit;
	}
	@Override
	public double withdraw(double amount)
	{
		if (balance - amount < overdraftLimit)
			return -1;
		else
			return amount;
	}
	@Override
	public String toString()
	{
		return super.toString() + "\nOverdraft Limit: " + overdraftLimit;
	}
}
