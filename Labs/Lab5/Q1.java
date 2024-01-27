/*
QUESTION 1 - EXERCICE 10.17 PAGE 406
(Square numbers) Find the first ten square numbers that are greater than Long.MAX_VALUE.
A square number is a number in the form of n2
For example, 4, 9, and 16 are square numbers. Find an efficient approach to run your program fast. 
*/
import java.math.BigDecimal;
public class Q1
{
	public static void main(String[] args)
	{
        BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE); // find Long.MAX_VALUE 
        long firstValue = (long) Math.sqrt(Long.MAX_VALUE); // find the square root of Long.MAX_VALUE 
        BigDecimal n = new BigDecimal(firstValue); // change the type to compare
        int i = 0;
        while (i < 10)
        {
        	BigDecimal squareNum = n.multiply(n);
        	if (squareNum.compareTo(longMaxValue) > 0) // comparing the values
        	{
        		i++;
                System.out.println(squareNum);
        	}
        	n = n.add(BigDecimal.ONE); // next n
        }
    }
}
