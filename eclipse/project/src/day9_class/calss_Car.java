package day9_class;

public class calss_Car {

	public static void main(String[] args) {

		Car car = new Car();
		car.printCar();
		car.turnOn();
		car.printCar();
		car.setGear('D');
		for(int i=1; i<=50; i++)
			car.accCar();
		car.printCar();
		car.turnOff();
		car.printCar();
		car.setWiperSpeed(2);
		for(int i=1; i<=400; i++)
			car.accCar();
		car.turnFrontLight();
		car.turnBackLight();
		car.printCar();
		
		
	}

}
