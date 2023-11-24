import java.lang.foreign.AddressLayout;

public class Account {
	public String ownerName;
	public double balance;
	
	
	public Account(String ownerName, double balance) {
		this.ownerName = ownerName;
		this.balance= balance;
		
	}
	public void add(double amount) {
		 
		
	}
	public void withdraw(double amount) {
		this.balance=balance  - amount;
		
		
	}
	public double getBalance() {
		return balance;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	
	

}
