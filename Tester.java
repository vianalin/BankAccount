public class Tester{
	public static void main(String[] args) {
		BankAccount a = new BankAccount(100, "hi world");
		System.out.println(a.getBalance());
		System.out.println(a.getAccountID());
	}
}