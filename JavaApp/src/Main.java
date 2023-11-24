import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Main {

	public static void main(String[] args) {
		Worker w1 = new Worker();
		Scanner input = new Scanner(System.in);
		System.out.println("Çalışanın ismini girin:");
		w1.name= input.nextLine();
		System.out.println("Çalışanın soysal güvenlik numarasını girin:");
		w1.socialSecurityNumber = input.nextInt();
		System.out.println("Çalışanın saatlik ücretini girin:");
		w1.wage = input.nextFloat();
		System.out.println("Çalışanın saatlik ücretini girin:");
		w1.workingHours = input.nextInt();
		w1.displayInfo();
		w1.displaySalary();
	
		
		
				

	}

}
