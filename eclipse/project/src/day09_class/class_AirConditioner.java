package day09_class;

public class class_AirConditioner {

	public static void main(String[] args) {
		
		AirConditioner t = new AirConditioner(1, 5);
		t.printTemperature();
		t.printTime();
		t.setAirConditioner(24);
		t.printTemperature();
		t.timeUp();
		t.printTime();
		t.timeDown();
		t.timeDown();
		t.printTime();
		
		

	}

}
