/*
QUESTION 2 – PI DAY CELEBERATION
(Use the BigDecimal class) to find the accurate value of PI up to 200 digits. The program should print this value
*/
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Q2
{
	public static void main(String[] args)
	{
		BigDecimal twentyTwo = new BigDecimal("22");
		BigDecimal seven = new BigDecimal("7");
	    System.out.println(twentyTwo.divide(seven, 200, RoundingMode.CEILING));
	}
}
