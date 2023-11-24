
public class main {

	public static void main(String[] args) {
		Student student = new Student(0, 0);
		try {
			student.setfinalExam(-50);
			student.setMidterm(103);
			
		} catch (Exception e) {
			System.out.println("İLLEGAL");
		}
		student.getAvarage();
	
		
		
		
		

	}

}
