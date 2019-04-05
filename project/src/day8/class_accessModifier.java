package day8;
	
/*	접근 제한자
 	public- 클래스에 public을 붙일 수 있는 경우는 하나뿐(클래스명과 파일명이 일치하는 경우에만 public을 붙일 수 있다

 	default - default는 default라는 키워드를 쓴 것이 아니라 클래스나 메서드에 접근제한자를 명시하지 않은 경우를 말한다
 			- default는 같은 패키지 안에서만 접근 가능하다
	
	private - 일반적으로 멤버 메서드나 멤버 변수에 붙이고, 자신(해당 멤버 메서드를 포함하는 클래스)를 제외한 다른 클래스에서 사용할 수 없다

*/

public class class_accessModifier {

	public static void main(String[] args) {
/*		Tv t = new Tv();
		t.channel = 1;
		System.out.println("현재 tv의 채널은 "+ t.channel + "입니다.");
		//멤버변수가 default면 같은 패키지 내이기 때문에 사용할 수 있지만 private으로 변환하면 다른 클래스이기 때문에 사용 불가
*/
		// t - 참조변수 (주소를 저장하는 변수) 
		
		Tv t = null; //참조변수 t(객체)를 선언하고 초기화
		t = new Tv(); // Tv(); 라는 생성자를 호출해서 객체를 생성 		
/*		t.printVolume();
		t.volumeUp();
		t.printVolume();	*/

		
		
/*		t = new Tv(); //같은 멤버 변수를 새로 만들면 기존 값은 사라지고 새 멤버변수가 0으로 초기화돼서 생성된다
		t.printVolume();
*/
		t.printChannel();
		t.channelUp();
		t.printChannel();
		t.channelUp();
		t.channelNum(77);
		t.printChannel();
		t.channelDown();
		t.channelDown();
		t.channelDown();
		t.channelDown();
		t.printChannel();
		
	}
	
}

class Tv{ //클래스명과 파일명이 같을 경우에만 클래스에 public을 사용 가능
	//일반적으로 멤버 변수는 접근제한자를 private로 설정하여 멤버 변수를 직접 수정할 수 없게 하고, 멤버 메서드를 통해서만 수정하도록 한다
	
	
	//멤버 변수 : 부품, 요소
	//멤버 변수는 설정하지 않으면 자동으로 0으로 초기화된다
	
	private int channel;
	private int volume;
	private final int MAX_CHANNEL = 100;
	private final int MAX_VOLUME = 100;
	
	
/*	멤버 메소드 : 기능
	일반적으로 멤버 메서드는 접근 제한자를 public으로 지정한다
	볼륨업
	볼륨다운
	채널업
	채널다운
	채널변경
*/	
	
/*	기능 : 멤버변수 volume의 크기를 하나 증가하는 메서드
	매개변수 : 없다 => void(생략 가능)
	리턴타입 : 없다 => void
	메서드명 : volumeUp
*/	
	public void volumeUp(){		
		if(MAX_VOLUME > volume)
			volume++;	
	}
	public void volumeDown(){	
		if(volume > 0)
			volume--;	
	}
	public void printVolume(){	System.out.println(volume);	}
	
	public void channelUp(){
		if(MAX_CHANNEL > channel)
			channel++;
	}
	public void channelDown(){
		if(channel > 0)
			channel--;
	}	
	public void channelNum(int num){
		if(num>0 && num<=MAX_CHANNEL)
			channel=num;
	}
	public void printChannel(){		System.out.println(channel);	}
	
	
}