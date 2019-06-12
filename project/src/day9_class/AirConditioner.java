package day9_class;

public class AirConditioner {

	private int temperature;
	private int time;
	private final int MAX_TEMPERATURE = 30;
	private final int MAX_TIME = 24;
	
	public void temperatureUp(){
		if(temperature < MAX_TEMPERATURE){
			temperature++;
		}
	}
	public void temperatureDown(){
		if(temperature > 0){
			temperature--;
		}
	}
	public void timeUp(){
		if(time < MAX_TIME){
			time++;
		}
	}
	public void timeDown(){
		if(time > 0){
			time--;
		}
	}
	public void printTemperature(){
		System.out.println("현재 온도 : "+temperature);
	}
	public void printTime(){
		System.out.println("꺼짐 예약 : "+time+"시간 후 꺼짐");
	}
	public void setAirConditioner(int ch){
		if(ch == 0)
			temperature = 0;
		else if(ch > MAX_TEMPERATURE)
			temperature = MAX_TEMPERATURE;
		else temperature = ch;
	}
	public void setAirConditioner(int temperature, int time){ 
		setAirConditioner(temperature);
		
	}
	public AirConditioner(int temperature, int time){ 
		setAirConditioner(temperature);
		if(temperature > MAX_TEMPERATURE){
			this.temperature = MAX_TEMPERATURE; // this.를 입력하면 이 클래스의 멤버변수란 의미로 변경된다
		}else{
				this.time = time;
		}
	}
	
}
