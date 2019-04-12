package day14;

public class Person {

	//이름, 나이, 생일, 성별, 주소, 국적
	private String name;
	private int age;
	private String birthDay;
	private String gender;
	private String address;
	private String nationallity;
	
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public String getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public String getNationallity() {
		return nationallity;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age >= 0)
		this.age = age;
	}
	public void setBirthDay(String birthDay) {	//birthDay는 객체이기 때문에 null값이 올 수 있어서 nullPointInception 예외를 방지하기 위해 조건문을 추가한다
		if(birthDay == null || birthDay.length() != 8)
			return;
		String sMonth = birthDay.substring(4,6);	//substring : 부분 문자열 추출 -> 4번지와 5번지(6-1번지)를 추출
		Integer month = Integer.parseInt(sMonth);	//Integer : 정수형 클래스 -> 클래스이기 때문에 null값을 가질 수 있다
		if(month>=1 && month <= 12)					//parseInt : 문자열을 정수로 바꿔주는 멤버메서드 -> 문자열 12를 정수 12로 변경
			this.birthDay = birthDay;				
	}
	public void setGender(String gender) {
		try {
			if(gender == null);
		} catch (Exception e) {
			System.out.println("객체가 null값입니다.");
			setGender("남자");
		}
		
		if(gender != null && (gender.equals("남자") || gender.equals("여자")))
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setNationallity(String nationallity) {
		this.nationallity = nationallity;
	}
	

	public Person(){
		//이름, 나이, 생일, 성별, 주소, 국적
		this("", "", "", "남자", "20000101", 1);
		
	}
	
	public Person(Person p){
		this(p.name, p.address, p.nationallity, p.gender, p.birthDay, p.age);
	}
	
	public Person(String name, String address, String nationallity, String gender, String birthDay, int age){
		this.name = name;
		this.address = address;
		this.nationallity = nationallity;
		this.age = age;
		setBirthDay(birthDay);
		setGender(gender);
	}
	
	
}
