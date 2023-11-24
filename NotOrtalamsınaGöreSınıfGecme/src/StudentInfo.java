//ogrenci bilgilerini alır not ortalamsını ve gecip kalma durumunu hesaplar.
public class StudentInfo {
	public String name;
	public int age;
	public double midScore;
	public double FinScore;
	
	public static int result(double midscr, double finscr) {
		if(finscr<35) {
			return 2;
		}
		
	else if((midscr*0.4+ finscr*0.60)>=50) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	

}
