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
return this.getClass() + "\nID: " + id + "\nBalance: " + balance + "\nDate Created: " +
dateCreated;
}
}
