enum CompanyName{
	Apple,
	Google,
	Microsoft,
	TBM,
	Akinsoft,
}
public class Company {
	private CompanyName companyName;
	private Employee[] employees;
	private int CompanyID;
	
	public Company(CompanyName companyName,Employee[] employees,int CompanyID){
		this.companyName = companyName;
		this.employees = employees;
		this.CompanyID = CompanyID;
		
		
	}
	public CompanyName getCompanyName() {
		return companyName;
	}
	public Employee[] getEmployees() {
		return employees;
		
	}
	public int getCompanyID() {
		return CompanyID;
	}
	
	

}
