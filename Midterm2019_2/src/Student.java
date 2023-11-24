import javax.sql.rowset.JoinRowSet;

public class Student {
	private int midterm;
	private int finalExam;
	public Student(int midterm, int finalExam) {
		setMidterm(midterm);
		setfinalExam(finalExam);
	}
	public void setMidterm(int midterm){
		if(midterm<0 || midterm>100) {
			throw new IllegalArgumentException();
		}
		else {
			this.midterm=midterm;
		}
		
	}
	public void setfinalExam(int finalExam) {
		if(finalExam<0 || finalExam>100) {
			throw new IllegalArgumentException();
		}
		else {
			this.finalExam=finalExam;
		}
		
	}

	



	public float getAvarage() {
		return (midterm*0.4f)+(finalExam*0.6f);
	}

}
