import java.lang.ScopedValue.Carrier;

public class main {

	public static void main(String[] args) {
		Car car1 = new Car(2000,23,"Renault");
		Car car2 = new Car(2028,1,"Ferrari");
		Car[] cars= {car1,car2};
		Car car3 = new Car(2005,"BMW");
		Car car4 = new Car(2018);
		Car[] cars2= {car3,car4};
		Factory f1 = new Factory(cars);
		Factory f2 =new Factory(cars2);
		System.out.println("Factory 1");

		f1.printAllCarsInfo();
		
		System.out.println("Factory 2");

		f2.printAllCarsInfo();

	}

}
