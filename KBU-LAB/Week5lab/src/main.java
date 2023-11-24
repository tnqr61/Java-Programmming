import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class main {

	public static void main(String[] args) {
		//Exercise 1
		System.out.println("Static Keyword Test");
		Circle circle1 = new Circle(5);
		System.out.println(circle1.computeArea());
		Circle circle2 = new Circle(10);
		System.out.println(circle2.computeArea());
		Circle circle3 = new Circle(15);
		System.out.println(circle3.computeArea());
		
		//Exercise 2
		System.out.println("TEACHERS");
		Teacher teacher1 = new Teacher(0, null);
		Teacher teacher2 = new Teacher(0, null);
		Teacher teacher3 = new Teacher(0, null);
		Teacher teacher4 = new Teacher(0, null);
		
		Scanner scanner = new Scanner(System.in);
		int choose = 0;
		
		Teacher[] teachers = {teacher1,teacher2,teacher3,teacher4};
		for(Teacher teacher: teachers) {
			System.out.println("Enter a Teacher id");
			teacher.id = scanner.nextInt();
			System.out.println("Choose Teacher branch:");
			System.out.println("1:Math 2:Physiscs 3:Computer Science 4:Englisch");
			switch (choose) {
			case 1:teacher.branch = Branch.Math;break;
			case 2:teacher.branch = Branch.Physiscs;break;
			case 3:teacher.branch = Branch.Cs;break;
			case 4:teacher.branch = Branch.Eng;break;
			}
			for(Teacher teacher_:teachers) {
				System.out.println(teacher_.id + ":"+teacher_.branch.getDescripton());
				
			}
			
			
			
			
		}
		

	}

}
