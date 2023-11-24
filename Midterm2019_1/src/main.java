

public class main {

	public static void main(String[] args) {
		Animal animal1= new Animal("HUHU",AnimalTypes.REPTILE);
		Animal animal2= new Animal("MAMAS",AnimalTypes.FISH);
		Animal animal3 = new Animal("TUSU", AnimalTypes.BIRD);
		Animal animal4 = new Animal("KUSU",AnimalTypes.MAMAL);
		Animal[] animals = {animal1,animal2,animal3,animal4};
		Zoo zoo = new Zoo(animals);
		zoo.printAnimals();
		
	}

}
