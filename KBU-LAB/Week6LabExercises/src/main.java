
public class main {

	public static void main(String[] args) {
		Person person1= new Person("Arif","Tunçer",61,20);
		Person person2= new Person("Ahmet","Kale");
		Person person3= new Person(128);
		Person person4= new Person();
		Person[] persons= {person1,person2,person3,person4};
		for(Person person : persons ) {
			System.out.println("name:"+person.firstName);
			System.out.println("lastname:"+person.lastName);
			System.out.println("id:"+person.id);
			System.out.println("age"+person.age);
			
			
		}
		
		
		
		
		

	}

}
