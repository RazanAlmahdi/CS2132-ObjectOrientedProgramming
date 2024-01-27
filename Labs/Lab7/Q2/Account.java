import java.time.LocalDate;
import java.util.ArrayList;
public class Account
{
protected int id;
protected ArrayList<Transaction> transactions;
protected double balance;
protected static double annualInterestRate;
protected LocalDate dateCreated;
protected String name;
public Account()
{
id = 0;
balance = 0;
annualInterestRate = 0;
dateCreated = LocalDate.now();
transactions = new ArrayList<Transaction>();
}
public Account(int id, double balance)
{
this.id = id;
this.balance = balance;
dateCreated = LocalDate.now();
transactions = new ArrayList<Transaction>();
}
public Account(String name, int id, double balance)
{
this.name = name;
this.id = id;
this.balance = balance;
dateCreated = LocalDate.now();
transactions = new ArrayList<Transaction>();
}
public void setId(int id)
{
this.id = id;
}
public void setName(String name)
{
this.name = name;
}
public void setBalance(double balance)
{
this.balance = balance;
}
public void setAnnualInterestRate(double annualInterestRate)
{
this.annualInterestRate = annualInterestRate;
}
public String getName()
{
return name;
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
balance -= amount;
transactions.add(new Transaction(’W’, amount, balance, "withdraw"));
return amount;
}
public void deposit(double amount)
{
balance += amount;
transactions.add(new Transaction(’D’, amount, balance, "deposit"));
}
public ArrayList<Transaction> getTransactions()
{
return transactions;
}
@Override
public String toString()
{
return this.getClass() + "\nID: " + id + "\nBalance: " + balance + "\nDate Created: " +
dateCreated;
}
}
