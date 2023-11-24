
public class Worker {
	String name;
	int socialSecurityNumber;
	float wage;
	int workingHours;
	void displayInfo(){
		System.out.println(name);
		System.out.println(socialSecurityNumber);
		
	}
	void displaySalary() {
		System.out.println("Worker name :"" "+ name +"Worker Social Security number:"+ socialSecurityNumber);
		System.out.println("Worker salary:" + wage*workingHours);
		
		
		
	}

}
