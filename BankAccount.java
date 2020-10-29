public class BankAccount {
	private double balance;
	private int accountID;
	private String password;

	public BankAccount(int accountID, String password) {
		balance = 0;
		this.accountID = accountID;
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setPassword(String newPass) {
		this.password = newPass;
	}
	public String getPassword() {
		return password;
	}


	public boolean deposit(double amount) {
		if(amount < 0) return false;
		balance += amount;
		return true;
	}

	public boolean withdraw(double amount) {
		if(amount > balance || amount < 0) return false;
		balance -= amount;
		return true;
	}

	public String toString() {
		return "" + accountID + "\t$" + balance;
	}


}
	