import java.security.PublicKey;

public class Person {
	public int id;
	public String firstName;
	public String lastName;
	public int age;
	public static int idcnt=0;
	
	public Person(String firstName,String lastName,int age,int id) {
		this.firstName = firstName;
		this.lastName =lastName;
		this.id=id;
		this.age=age;
	}
	public Person(String firstName,String lastName) {
		
		this(firstName, lastName,0, ++idcnt);
		
		
	}
	public Person(int id) {
		this("Default firstName","Default lastname",0, id);
		
		
	}
	public Person(){
		this("Default firstName","Default lastname",0, ++idcnt);
		
	}
	

	
	
	
	

}
