package day19;

public class Student {			//String의 객체 멤버는 기본값이 null이기 때문에 "";값으로 초기화해서 빈 문자열로 명시적 초기화를 해 toString에 null대신 공백을 입력한다
								//초기화 순서 - 기본값 > 명시적 초기화 > 초기화 블록 > 생성자							
	private String name="";		//이름
	private String sName="";	//학교 이름
	private String id="";		//학번
	private String major="";	//전공
	private double average;		//평점
	
	
	public String getName() {
		return name;
	}
	public String getSname() {
		return sName;
	}
	public String getId() {
		return id;
	}
	public String getMajor() {
		return major;
	}
	public double getAverage() {
		return average;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSname(String sname) {
		sName = sname;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setAverage(double average) {
		if(average > 4.5 || average < 0){		//범위를 벗어난 점수가 입력됐을 때 저장하지 않는다
			return;
		}
		this.average = average;
	}
	
	
	@Override
	public String toString() {		//학생 정보를 객체를 이용하여 출력할 때 출력될 형태를 수정하기 위해 오버라이딩을 한다
		return "학생    /   이름 = " + name + ", 학교명 = " + sName + ", 학번 = " + id + ", 전공 = " + major + ", 학점 = " + average;
	}
	
	
	@Override
	public int hashCode() {		//빠른 검색을 위해 그룹을 분류한다 -> id가 같으면 같은 그룹에 있게하기 위해서
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());	//id가 null이면 0을 더해서 result가 같기 때문에 같은 그룹으로 분류한다
		return result;													//id가 null이 아니면 해당 id의 hashCode를 더한 뒤 result에 저장해 구분한다
																		
	}										//equals와 hashCode는 함께 작동하고 hashCode에서 같은 그룹으로 분류한 뒤 equals를 통해 그룹별로 두 객체가 같은지를 비교한다
	@Override
	public boolean equals(Object obj) {		//equals는 다른 그룹이면 다른 객체로 판별하기 때문에 항상 hashCode를 통해 비교할 대상을 같은 그룹으로 분류해야한다
		if (this == obj)					//object의 객체 obj와 주소가 같다면
			return true;					//true를 반환한다
		if (obj == null)					//obj가 null이면
			return false;					//false를 반환한다
		if (getClass() != obj.getClass())	//getClass()의 값과 obj.getClass의 값이 다르면
			return false;					//false를 반환한다
		Student other = (Student) obj;		//Student의 other 객체를 선언해서 Student로 형변환한 obj를 저장한다
		if (id == null) {					//id가 널일 때  
			if (other.id != null)			//다른 id가 null이 아니면
				return false;				//false를 반환한다
		} else if (!id.equals(other.id))	//id와 다른 id를 equals로 비교해서 같지 않으면
			return false;					//false를 반환한다
		return true;						//위의 조건문에 해당하지 않으면 true를 반환한다
	}

						//생성자 - 클래스명과 이름이 같고, 리턴타입이 없다 (이름이 같아도 리턴타입이 있으면 생성자가 아니라 메서드이다), new를 통해 객체를 생성될 때만 호출이 가능하다
	
	public Student(){			//다른 생성자가 있으면 자동으로 생성되지 않기 때문에 변수 선언 때 명시적 초기화를 통해 초기화를 해서 기본 생성자를 사용하지 않게 돼도 만들어주는 게 좋다
		
	}							//오버로딩 - 한 클래스 내에서 동일한 이름을 가지는 메서드나 생성자가 여러개 존재하는 경우(매개변수의 개수가 다르거나 개수가 같아도 자료형이 다른 경우)
	
	public Student(Student s){	//복사생성자 - 매개변수가 같은 크래스의 객체인 경우 
		this(s.name, s.sName, s.id, s.major, s.average);	//this() - 내 생성자를 호출
	}														//생성자 오버로딩을 통해 아래의 생성자를 호출하여 코드의 중복을 제거한다
	
	public Student(String name, String sName, String id, String major, double average){		//생성자 오버로딩
		this.name = name;
		this.sName = sName;
		this.id = id;
		this.major = major;
		this.average = average;
	}

}
