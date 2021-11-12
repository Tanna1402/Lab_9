
public class SavingsAccount extends BankAccount {
	
	//Declare variables
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	//constructor
	public SavingsAccount(String name, double amount) {
		super(name,amount);
		this.accountNumber = super.getAccountNumber()+ "-"+savingsNumber;
	}
	
	//copy constructor
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount,amount);
	}
	
	public void postInterest() {
		deposit((getBalance() * (rate/1200)));
		savingsNumber +=1; 
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public String getAccountNumber() {
		savingsNumber += 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		return accountNumber;
	}
}
