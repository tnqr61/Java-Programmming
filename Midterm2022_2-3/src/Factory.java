
public class Factory {
	Car [] cars;
	Factory(Car[] cars) {
		this.cars=cars;
		
	}
	void printAllCarsInfo() {
		for (Car car : cars) {
			car.getCarInfo();
		}
	}

}
