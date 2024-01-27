import java.util.ArrayList;
import java.util.Date;
public class Q1
{
  public static void main(String[] args)
  {
    ArrayList<Object> arr = new ArrayList<Object>();
    arr.add(new Account(123, 5000)); //from lab6
    arr.add(new Date());
    arr.add(new String("String class"));
    arr.add(new Circle(3.45)); //from chapter 9
    for (int i=0; i<arr.size(); i++)
      System.out.println(arr.get(i).toString() + "\n");
  }
}
