
public class Main {
	public static void main(String[] args) {
		Car car1 = new Car(2021);
		Car car2 = new Car("Mercedes",300);
		Car car3 = new Car("Audi",350,2022);
		Car[] cars = {car1,car2,car3};
		Factory factory1 = new Factory(cars);
		factory1.printAllCarsInfo();
		
		
	}

}
