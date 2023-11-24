import java.util.Set;

public class main {

	public static void main(String[] args) {
		NFT nft = new NFT(-100,"Arif");
	
		
		try {
			nft.setBalance(-100);
			
			
			
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}


	}

}
