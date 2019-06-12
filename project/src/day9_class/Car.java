package day9_class;

public class Car {
	//1.멤버 변수를 설정 => 필요한 부품, 요소
	
	private int speed;
	private boolean power;
	private char gear;
	private boolean frontLight;
	private boolean backLight;
	private int wiperSpeed;
	//getSpeed, setSpeed 등으로 변수명의 첫 글자가 대문자로 나오기 때문에 멤버 변수는 소문자로 지정해야 한다
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public char getGear() {
		return gear;
	}
	public void setGear(char gear) {
		this.gear = gear;
	}
	public boolean isFrontLight() {
		return frontLight;
	}
	public void setFrontLight(boolean frontLight) {
		this.frontLight = frontLight;
	}
	public boolean isBackLight() {
		return backLight;
	}
	public void setBackLight(boolean backLight) {
		this.backLight = backLight;
	}
	public int getWiperSpeed() {
		return wiperSpeed;
	}
	public void setWiperSpeed(int wiperSpeed) {
		this.wiperSpeed = wiperSpeed;
	}
	
	
/*	속도
	시동
	기어
	전방등
	후방등
	와이퍼 속도
*/

/*	2. 생성자를 생성 => 멤버 변수 초기화
	속도 = 0, 시동 = off, 기어 = 파킹, 전방등 = off, 후방등 = off
	와이퍼 속도 = 0 	
*/
	
	public Car(){
		this.power = false;
		this.speed = 0;
		this.gear = 'p';
		this.frontLight = false;
		this.backLight = false;
		this.wiperSpeed = 0;
	}
	
	
	
/*	3. 멤버 메서드를 생성 및 구현 => 필요한 기능
	시동 켜기		
*/
	public void turnOn(){
		this.power = true;
	}
	public void turnOff(){
		if(speed == 0)
		this.power = false;
	}
	public void accCar(){
		if(power && (gear == 'D'|| gear == 'd')){
			speed++;
		}
	}
	public void breakCar(){
		if(power && (gear == 'D'|| gear == 'd')){
			speed--;
		}
	}
	public void turnFrontLight(){
		frontLight = !frontLight;
	}
	public void turnBackLight(){
		backLight = !backLight;
	}
	public void printCar(){
		System.out.println(" - - - - - - - - - - - - - - - - -");
		if(power) System.out.println("시동이 켜져있습니다.");
		else	  System.out.println("시동이 꺼져있습니다.");
		System.out.println("속도 : "+speed);
		
		switch(gear){
		case 'P' :			System.out.println("기어 : P");
		case 'R' :			System.out.println("기어 : R");
		case 'N' :			System.out.println("기어 : N");
		case 'D' :			System.out.println("기어 : D");
		}
		if(frontLight)	System.out.println("전방등이 켜져있습니다.");
		else 			System.out.println("전방등이 꺼져있습니다.");
		if(backLight)	System.out.println("후방등이 켜져있습니다.");
		else 			System.out.println("후방등이 꺼져있습니다.");
		
		switch(wiperSpeed){
		case 0 : System.out.println("와이퍼 : 정지"); break;
		case 1 : System.out.println("와이퍼 : 천천히"); break;
		case 2 : System.out.println("와이퍼 : 보통"); break;
		case 3 : System.out.println("와이퍼 : 빠름"); break;
		}
		System.out.println(" - - - - - - - - - - - - - - - - -");
	}
	
	
	
	
}
