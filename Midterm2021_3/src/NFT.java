
public class NFT {
	private double balance;
	private String owner;
	public NFT(double balance, String owner) {
		this.balance=getBalance();
		this.owner=getOwner();
		
	}
	public double getBalance() {
		return balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setBalance(double balance) {
		if(balance>10000 || balance<0) {
			throw new IllegalArgumentException("balance must be greater than 0 and smaller than 10000");
		}
		else {
			this.balance=balance;
		}
	}
	public void setOwner(String owner) {
		this.owner=owner;
	}
	
	
	

}
