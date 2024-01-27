public class Q2
{
public static void main(String[] args)
{
Account a = new Account("Reem", 123, 5000);
a.withdraw(1000);
a.deposit(100);
a.deposit(400);
System.out.println(a.toString());
System.out.println("\nTransactions:");
for (int i = 0; i < a.getTransactions().size(); i++) {
System.out.println();
System.out.println("\nType: " + (a.getTransactions()).get(i).getType()
+ "\nAmount: " + (a.getTransactions()).get(i).getAmount()
+ "\nBalance: " + (a.getTransactions()).get(i).getBalance()
+ "\nDate: " + (a.getTransactions()).get(i).getDate()
+ "\nDescription: " + (a.getTransactions()).get(i).getDescription());
}
}
}
