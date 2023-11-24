enum AnimalTypes{MAMAL,BIRD,REPTILE,FISH;}
public class Animal {
	
	private String name;
	private AnimalTypes type;
	public Animal(String name,AnimalTypes type) {
		this.name=name;
		this.type=type;
		
	}
	@Override
	public String toString() {
		
		return "ANİMAL NAME: "+name+" ANİMAL TYPE: "+type;
		
	}
	

}
