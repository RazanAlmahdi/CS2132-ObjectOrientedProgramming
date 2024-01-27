/*
Find the value of pi using the BigDecimal class
*/
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Pi
{
	public static void main(String[] args)
	{
		BigDecimal pi = new BigDecimal("0");
		BigDecimal n = new BigDecimal("1");
		// values will be used
		BigDecimal two = new BigDecimal("2");
		BigDecimal four = new BigDecimal("4");
		
	    for (int i = 0; i < 700; i++)
	    {
	        if (i%2 == 0)
	            pi = pi.add((BigDecimal.ONE).divide(n, 20, RoundingMode.CEILING)); // pi = pi + 1/n
	        else
	            pi = pi.subtract((BigDecimal.ONE).divide(n, 20, RoundingMode.CEILING)); // pi = pi - 1/n
	        n = n.add(two); // n += 2
	    }
	    pi = pi.multiply(four); // pi = pi * 4
	    System.out.println(pi);
	}
}
