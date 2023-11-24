import java.security.PublicKey;

public class Car {
	private String brand;
	private int maxSpeed;
	private int year;
	
	Car(int year,int maxSpeed,String brand) {
		this.year=year;
		this.maxSpeed=maxSpeed;
		this.brand=brand;
	}
	Car(int year,String brand) {
		this.year=year;
		this.brand=brand;
	}
	Car(int year) {
		this.year=year;
		
		
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setYear(int year) {
		if(year>2023) {
			try {
				throw new IllegalArgumentException();
				
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
			
		}
		else {
			this.year = year;
		}
	}
	public String getBrand() {
		return brand;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getYear() {
		return year;
	}
	public String getCarInfo() {
		return "Brand:" +brand+"maxSpeed:"+maxSpeed+"Year:"+year;
		
	}


}
