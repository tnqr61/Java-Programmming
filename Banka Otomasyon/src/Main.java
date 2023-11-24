import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice = 1  ;
		int choice2 ;
		int counterofCustomers=0;
		while(choice!=0) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome to the Bank");
			System.out.println("Please Enter a number which you want to do");
			System.out.println("1- Register to Bank 2-Sign in to Bank 3 0- Exit to Bank");
			choice = scanner.nextInt();
		
		switch (choice) {
		case 1:;
		System.out.println("1- Register as Costumer 2- Register as Manager 3-Back to previous menu");
		choice2=scanner.nextInt();
		while(choice2!=3) {
		if(choice2==1) {
			Costumer [] costumers = new Costumer[100];
			counterofCustomers++;
			System.out.println("Enter a name");
			customers[0] = new Customer(arif);
			
			
			
			
			
		}
		}
		case 2:;
	
		default:
			System.out.println("İt s wrong value, please enter a number again");
			
		}
		
		}
	}

}
