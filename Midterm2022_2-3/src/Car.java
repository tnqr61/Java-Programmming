
public class Car {
	private String brand;
	private int maxSpeed;
	private int year;
	Car(int year) {
		this("BMW",250,2021 );
	}
	Car(String brand,int maxSpeed) {
		this(brand, maxSpeed, 2014);
	}
	public Car(String brand,int maxSpeed,int year) {
		setBrand(brand);
		setMaxSpeed(maxSpeed);
		setYear(year);
		
		
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setYear(int year) {
		if(year>2022) {
			throw new IllegalArgumentException("Year değeri 2022 den büyük olamaz");
		}
		else {
		this.year=year;
			
		}
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed=maxSpeed;
	}
	public String getBrand() {
		return this.brand;
	}
	public int getYear() {
		return this.year;
	}
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	public String getCarInfo() {
		return "Brand:"+brand+" MaxSpeed:"+maxSpeed+" Üretim Yılı:"+year+" Araç Yaşı"+(2023-year);
	}

}
