enum Branch{
	Math("Matematik"),
	Physiscs("Fizik"),
	Cs("Bilgisayar Bilimleri"),
	Eng("İngilizce");
	
	private String description;
	
	private Branch(String description) {
		this.description =description;
	}

public String getDescripton(){
	return this.description;
}
		
}
public class Teacher {
	public int id;
	public Branch branch;
	public Teacher(int id,Branch branch) {
		this.branch = branch;
		this.id = id;
	
	}
	

}
