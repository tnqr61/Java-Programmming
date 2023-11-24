import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class Factory {
	Car[] cars;
	Factory(Car[] cars) {
		this.cars=cars;
		
	}
	void printAllCarsInfo() {
		for(Car car: cars) {
			System.out.println(car.getCarInfo());
		}
	
		
	}
	

}
