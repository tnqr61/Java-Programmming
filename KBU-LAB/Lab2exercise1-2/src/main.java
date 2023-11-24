import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int tries=0;
		int passw=6161;
		int pass;
		double amount_;
		
		Account user1 = new Account("arif", 7000);
		Scanner input = new Scanner(System.in);
		if(tries==0) {

		System.out.println("Please enter the 4-digit password");
		pass= input.nextInt();
		tries++;
			if (pass==passw) {
				System.out.println("please enter the amount you want to withdraw");
				amount_= input.nextDouble();
				user1.withdraw(amount_);
				System.out.println("transaction successful");
				System.out.println("remaining money:"+ user1.balance);
			}
			else 
				System.out.println("Please try again");
				pass = input.nextInt();
				tries++;
				if(pass==passw) {
					System.out.println("please enter the amount you want to withdraw");
					amount_= input.nextDouble();
					user1.withdraw(amount_);
					System.out.println("transaction successful");
					
				}
				else {
					System.out.println("Your account has been blocked, please try again later");
				}
				
			
			}
		
		
		
		
		}

	}


