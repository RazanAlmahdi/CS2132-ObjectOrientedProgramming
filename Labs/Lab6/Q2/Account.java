/*
 (Subclasses of Account) In Programming Exercise 9.7, the Account class was defined to model a bank account. An 
account has the properties account number, balance, annual interest rate, and date created, and methods to deposit 
and with- draw funds. Create two subclasses for checking and saving accounts. A checking account has an 
overdraft limit, but a savings account cannot be overdrawn. 
Draw the UML diagram for the classes and then implement them. Write a test program that creates objects of 
Account, SavingsAccount, and CheckingAccount and invokes their toString() methods. 
 */
import java.time.LocalDate;
public class Account
{
	protected int id;
	protected double balance;
	protected static double annualInterestRate;
	protected LocalDate dateCreated;
	public Account()
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = LocalDate.now();
	}
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
		dateCreated = LocalDate.now();
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	public int getId()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public LocalDate getDateCreated()
	{
		return dateCreated;
	}
	public double getMonthlyInterestRate()
	{
		return (annualInterestRate/12)/100;
	}
	public double getMonthlyInterest()
	{
		return balance*getMonthlyInterestRate();
	}
	public double withdraw(double amount)
	{
		balance-=amount;
		return amount;
	}
	public void deposit(double amount)
	{
		balance += amount;
	}
	@Override
	public String toString()
	{
		return this.getClass() + "\nID: " + id + "\nBalance: " + balance + "\nDate Created: " + dateCreated;
	}
}
