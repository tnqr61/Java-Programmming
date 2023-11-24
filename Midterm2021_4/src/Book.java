import java.security.PublicKey;

enum Type{
	ADVENTURE(1,"has an epic journey"),
	HISTORY(2,"Facts about history"),
	SCIENCE(3,"Nonfiction");
	private final int id;
	private final String desc;
	private Type(int id,String desc) {
		this.id=id;
		this.desc=desc;
		
	}
	public String getDesc() {
		return this.desc;
	}
	
	
}
public class Book {
	String name;
	Type type;
	String isbn;
	int year;
	static int counter;
	public Book(String bName,Type type) {
		this(bName, type, 2021,++counter);
	}
	public Book(String bName,Type type,int y) {
		this(bName,type,y,++counter);
		
	}
	private Book(String bname,Type type,int y,int count) {
		this.name=bname;
		this.year=y;
		this.isbn=y+"-"+count;
		this.type=type;
		
	}
	public String toString() {
		return "ISBN:" +isbn+":"+name+":"+type;
	}

}
