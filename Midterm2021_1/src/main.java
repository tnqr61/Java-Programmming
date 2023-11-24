import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		int n=9;
		Car car1 = new Car(1,2000);
		car1.setPower(350);
		Car car2 =new Car(2,1998);
		car2.setPower(190);
		Car car3 = new Car(3,2015);
		Car car4 = new Car(4,2018);
		Car[] cars = {car1,car2,car3,car4};
		Garage garage1 = new Garage(cars);
		garage1.printCarsOlderThan(n);
		
		

		
		
		

	}

}
