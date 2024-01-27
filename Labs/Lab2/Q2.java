/*
QUESTION 2 – EXERCISE 1.11 PAGE  31
(Population projection) The U.S. Census Bureau projects population based on the following assumptions:
* One birth every 7 seconds
* One death every 13 seconds
* One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days.
Hint: In Java, if two integers perform division, the result is an integer. The fractional part is truncated.
For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with the fractional part,
one of the values involved in the division must be a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
*/
public class Q2
{
	public static void main (String [] args)
	{
		//Store current population
		double intPop = 312032486;
		// Store 365 days in seconds
		double SecondsInYear = 31536000;
		//Number of births per year
		double birthsPerYear = SecondsInYear / 7;
		//Number of deaths per year
		double deathsPerYear = SecondsInYear / 13;
		//Immigration per year
		double immigrantsPerYear = SecondsInYear / 45;
		//Rate of population change per year
		double changePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;
		System.out.println("Population after one year : " + (double)(intPop + (1 * changePerYear)));
		System.out.println("Population after two years: " + (double)(intPop + (2 * changePerYear)));
		System.out.println("Population after three years: " + (double)(intPop + (3 * changePerYear)));
		System.out.println("Population after four years: " + (double)(intPop + (4 * changePerYear)));
		System.out.println("Population after five years: " + (double)(intPop + (5 * changePerYear)));
	}
}
