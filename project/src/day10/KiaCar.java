package day10;

import day9.Car;

public class KiaCar extends Car {

	public final static String brand = "KIA";
	public KiaCar(){
		//speed = 1; // 부모 클래스에서 접근 제한자가 private이므로 사용 불가
		
		setSpeed(0);
		
		
		
		
	}
	
	
}
