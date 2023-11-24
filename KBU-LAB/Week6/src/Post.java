
public class Post {
	private String massage;
	private String sendAdress;
	private String receiveAdress;
	
	
	public Post(String m,String sender,String reciver) {
		this.massage=m;
		this.receiveAdress=reciver;
		this.sendAdress =sender;
		
	}
	void post(String name) {
		String sendMassageString = String.format("massage:%s sender:%s reciver:%s"
				,massage,sendAdress,receiveAdress);
		System.out.println(sendMassageString);
		
	}

}
