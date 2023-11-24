
public class main {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Arif",61);
		Employee emp2 = new Employee("Ahmet", 20);
		Employee emp3 = new Employee("Onur",17);
		Employee emp4 = new Employee("Yusuf",64);
		Employee emp5 = new Employee("İbrahim",34);
		Employee emp6 = new Employee("Emre",12);
		Employee[] empsApple = {emp1,emp2,emp3};
		Employee[] empsMicrosoft = {emp4,emp5,emp6};
		
		for(Employee e:empsApple) {
			System.out.print(e.getName());
			System.out.println(" "+e.getId());
		
		}
		Company comp1 = new Company(CompanyName.Apple,empsApple,15);
		Company comp2 = new Company(CompanyName.Microsoft,empsMicrosoft,13);
		Company[] companies = {comp1,comp2};
		int i=0;
		int k=0;
		for(i=0; i<2; i++) {
			System.out.println(companies[i].getCompanyName());
			for(k=0; k<3; k++) {
				System.out.println(companies[i].getEmployees());
			}
		}
			
			
		
	
		

	}

}
