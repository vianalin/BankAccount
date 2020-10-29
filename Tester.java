public class Tester{
	public static void main(String[] args) {
		BankAccount a = new BankAccount(100, "hi world");
		BankAccount b = new BankAccount(200, "hi");

		System.out.println(a.getBalance()); //bal

		System.out.println(a.getAccountID()); //id

		System.out.println(a.getPassword()); //testing getpass
		a.setPassword("hello world"); //changing pass
		System.out.println(a.getPassword()); //testing setpass

		System.out.println(a.deposit(100.0)); //depositing
		System.out.println(a.getBalance()); //testing depos
		System.out.println(a.deposit(-800)); //testing false 

		System.out.println(a.withdraw(80)); //withdrawing
		System.out.println(a.getBalance()); //testing if it worked
		System.out.println(a.withdraw(-1.0)); //testing false
		System.out.println(a.withdraw(400000)); //testing false

		System.out.println(a.toString()); //testing tostring

		System.out.println(a.transferTo(b, 15, "hello world")); //authen and trans to
		System.out.println(a.getBalance()); //testing if it worked
		System.out.println(b.getBalance()); //testing if it worked
	}
}