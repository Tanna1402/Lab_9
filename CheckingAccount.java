
public class CheckingAccount extends BankAccount {
	private static double FEE =0.15;
	
	//Constructor
	public CheckingAccount(String name, double amount ) {
		super(name, amount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	//the pveride method
	public boolean withdraw(double amount) {
		amount += FEE;
		return super.withdraw(amount);
	}
}
