package day9;

public class Tv {//같은 패키지 안에서는 같은 이름의 클래스를 생성할 수 없다

	//일반 멤버변수, 객체 멤버변수
	private int channel;
	private int volume;
	private final int MAX_CHANNEL = 500;
	private final int MAX_VOLUME = 100;
	
	
	//static이 들어가면 클래스 멤버 변수
	public static final String BRAND = "삼성";
	//public static String BRAND; //값을 선언한 뒤 객체들과 값을 공유
	
	//일반 멤버 메서드, 객체 멤버 메서드
	public void channelUp(){
		if (channel < MAX_CHANNEL)
			channel++;
	}
	public void channelDown(){
		if(channel > 1)
			channel--;
	}
	public void setChannel(int ch){
		if(ch == 0)
			channel = 1;
		else if(ch > MAX_CHANNEL)
			channel = MAX_CHANNEL;
		else channel = ch;
	}
	public void volumeUp(){
		if(volume < MAX_VOLUME)
			volume++;
		
	}
	public void volumeDown(){
		if(volume > 0)
			volume--;
	}
	public void printVolume(){
		System.out.println("현재 소리 크기 : "+volume);
	}
	public void printChannel(){
		System.out.println("현재 채널 : "+channel);
	}
	public static void printBrand(){ //static이 붙으면 클래스 멤버메서드(객체 생성 없이 클래스 멤버변수를 선언해서 사용 가능)
		System.out.println("Tv 브랜드 : "+BRAND);
	}
	//클래스 멤버메서드에는 클래스 멤버변수는 사용 가능하지만 객체 멤버변수는 사용할 수 없다(System.out.println(channel);

	
/*	멤버 메서드는 원하는 시점에서 호출이 가능하지만
	생성자는 객체를 생성할 때에만 호출하여 객체 멤버 변수를 초기화
	생성자가 없을 때 기본생성자가 컴파일러에의해 자동으로 추가된다
	기본 생성자 없이 다른 생성자를 만들고 기본 생성자를 호출하면 에러가 난다
*/	
	public Tv(){
		channel = 1;
		volume = 10;
		
	}
	

	public Tv(int channel, int volume){ 
		setChannel(channel);
		if(volume > MAX_VOLUME){
			this.volume = MAX_VOLUME; // this.를 입력하면 이 클래스의 멤버변수란 의미로 변경된다
		}else{
				this.volume = volume;
		}
		
	}
	
/*	public Tv(Tv t){  //복사생성자
		setChannel(t.channel);
		if(t.volume > MAX_VOLUME){
			volume = MAX_VOLUME;
		}else{
				volume = t.volume;
		}
	}
*/	

	public Tv(Tv stv){ 
		this(stv.channel, stv.volume); //다른 생성자 호출은 첫 줄에만 쓸 수 있다
	}
/*	channel = stv.channel
	volume = stv.volume;	*/
		
}
