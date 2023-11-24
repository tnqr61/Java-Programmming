package ogrencinothesaplama;

public class Main {

	public static void main(String[] args) {
		double score;
		
		Students student1 = new Students();
		student1.ad ="Arif";
		student1.num = 61;
		student1.midScore =70;
		student1.FinScore =80;
		
		score= ( student1.ad, student1.num, student1.midScore, student1.FinScore);
		
		

	}
	public static double calculte(String name,int number,float vizeScore, float finScore){
		
		return vizeScore*0.40 + finScore*0.60;
	}

}


