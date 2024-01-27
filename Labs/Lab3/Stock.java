/*
QUESTION 2 – EXERCISE 9.2 PAGE 31
(The Stock class) Following the example of the Account class studied in the class, design a class named Stock that 
contains: 
* A string data field named symbol for the stock’s symbol. 
* A string data field named name for the stock’s name. 
* A double data field named previousClosingPrice that stores the stock price for the previous day. 
* A double data field named currentPrice that stores the stock price for the current time. 
* A constructor that creates a stock with the specified symbol and name. 
* A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice. 
Draw the UML diagram for the class and then implement the class. Write a test program that creates a Stock object 
with the stock symbol ORCL, the name Oracle Corporation, and the previous closing price of 34.5. Set a new
current price to 34.35 and display the price-change percentage.
*/
public class Stock
{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	public Stock(String s, String n)
	{
		symbol = s;
		name = n;
	}
	public double getChangePercent()
	{
		// rate of change = (x2-x1)/x1
		return ((currentPrice - previousClosingPrice)/previousClosingPrice)*100;
	}
	public static void main(String args[])
	{
		Stock s = new Stock("ORCL", "Oracle Corporation");
		s.previousClosingPrice = 34.5;
		s.currentPrice = 34.35;
		System.out.printf("%.2f",s.getChangePercent());
	}
}
