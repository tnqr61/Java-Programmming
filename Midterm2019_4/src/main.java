import javax.sql.rowset.JoinRowSet;

enum Level{
	HIGH(300,"dangerous"),
	MEDIUM(200,"Okay"),
	LOW(100,"too easy");
	int height;
	private String desc;
	private Level(int h,String desc) {
		this.height=h;
		this.desc=desc;
	}
	public String getDesc() {
		return desc;
	}
	
}
public class main {

	public static void main(String[] args) {
		Level[] levels =Level.values();
		for(Level level: levels) {
			System.out.println(level+": "+level.getDesc());
		}

	}

}
