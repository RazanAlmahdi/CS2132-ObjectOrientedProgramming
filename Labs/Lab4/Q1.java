/*
QUESTION 1 - EXERCICE 9.4 PAGE 360
(Use the Random class) Write a program that creates a Random object with seed 1000 and displays the first 50 
random integers between 0 and 100 using the nextInt(100) method. 
*/
import java.util.Random;
public class Q1
{
    public static void main(String[] args)
    {
        Random r = new Random(1000);
        for (int i = 0; i < 50; i++)
        {
            System.out.print(r.nextInt(100) + " ");
        }
    }
}
