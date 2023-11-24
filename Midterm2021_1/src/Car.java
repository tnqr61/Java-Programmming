import javax.sql.rowset.JoinRowSet;

public class Car {
	private int id;
	private int productionYear;
	private int power;
	public static int counter;
	public Car(int id,int productionyear) {
		counter++;
		this.id=id;
		this.productionYear=productionyear;
		
		
	}
	public void setPower(int power) {
		this.power=power;
		
	}
	public int getProductionYear() {
		return productionYear;
	}
	public int getAge() {
		return 2023-productionYear;
		
	}
	public void startAndMove(){
		System.out.println("Araç Çalıştırıldı ve Hareketleniyor");
	}
	public void Stop() {
		System.out.println("Araç durduruldu");
	}
	@Override
	public String toString() {
		return "id:"+id+"productionYear:"+productionYear+"Power:"+power;
	}

	

}
