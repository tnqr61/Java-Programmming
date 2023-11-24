import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice;
		int result;
		StudentInfo s1 = new StudentInfo();
		Scanner input= new Scanner(System.in);
		System.out.println("ogrenci gecme durumu sorgulatmak icin 1'e cıkıs yapmak icin 0'ye basin:");
		choice =input.nextInt();
		input.nextLine();
		while(choice==1) {
		
			System.out.print("ogrenci ismi:");
			s1.name =input.nextLine();
			System.out.println("ogrenci yası:");
			s1.age =input.nextInt();
			System.out.println("ogrenci vize sonucu:");
			s1.midScore =input.nextDouble();
			System.out.println("ogrenci final sonucu:");
			s1.FinScore =input.nextDouble();
			result=s1.result(s1.midScore, s1.FinScore);
			if(result==1) {
				System.out.println("ogrenci dersten gecmistir");
				
			}
			else if(result==2) {
				System.out.println("ogrenci finalden 35 alti aldıgı icin dersten kalmıstır");
				
			}
			else {
				System.out.println("ogrenci dersten kalmıstır");
			}
			System.out.println("tekrar sorgulatmak icin 1 cikis icin herhangi bir tusa basin:");
			choice=input.nextInt();
			
			
		}
		

	}


}
