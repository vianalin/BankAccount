public class Tester{
	public static void main(String[] args) {
		BankAccount a = new BankAccount(100, "hi world");

		System.out.println(a.getBalance()); //bal

		System.out.println(a.getAccountID()); //id

		System.out.println(a.getPassword()); //testing getpass
		a.setPassword("hello world"); //changing pass
		System.out.println(a.getPassword()); //testing setpass

		System.out.println(a.deposit(100.0)); //depositing
		System.out.println(a.getBalance()); //testing depos
		System.out.println(a.deposit(-800)); //testing false 

	}
}