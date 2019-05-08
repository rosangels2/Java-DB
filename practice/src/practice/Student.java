package practice;

public class Student {

/*	
 	String의 객체 멤버는 기본값이 null이기 때문에 "";값으로 초기화해서 빈 문자열로 명시적 초기화를 해 toString에 null대신 공백을 입력한다
	초기화 순서 - 기본값 > 명시적 초기화 > 초기화 블록 > 생성자							
	이름
	학교 이름
	학번
	전공
	평점
*/
	private String name = "";
	private String Sname = "";
	private String id = "";
	private String major = "";
	private double average = 0;
	
	
	
	public String getName() {
		return name;
	}
	public String getSname() {
		return Sname;
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
		Sname = sname;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	
	//학생 정보를 객체를 이용하여 출력할 때 출력될 형태를 수정하기 위해 toString 오버라이딩을 한다
	@Override
	public String toString() {
		return "학생    /  이름 = " + name + ", 학교명 = " + Sname + ", 학번 = " + id + ", 전공 = " + major + ", 학점 = " + average;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

	//생성자 - 클래스명과 이름이 같고, 리턴타입이 없다 (이름이 같아도 리턴타입이 있으면 생성자가 아니라 메서드이다), new를 통해 객체를 생성될 때만 호출이 가능하다
	
	public Student(){
		
	}
	
	public Student(Student s){
		this.name = s.name;
		this.Sname = s.Sname;
		this.id = s.id;
		this.major = s.major;
		this.average = s.average;
	}
	
	public Student(String name, String Sname, String id, String major, double average){
		this.name = name;
		this.Sname = Sname;
		this.id = id;
		this.major = major;
		this.average = average;
	}
	
	//다른 생성자가 있으면 자동으로 생성되지 않기 때문에 변수 선언 때 명시적 초기화를 통해 초기화를 해서 기본 생성자를 사용하지 않게 돼도 만들어주는 게 좋다

	//오버로딩 - 한 클래스 내에서 동일한 이름을 가지는 메서드나 생성자가 여러개 존재하는 경우(매개변수의 개수가 다르거나 개수가 같아도 자료형이 다른 경우)

	//복사생성자 - 매개변수가 같은 클래스의 객체인 경우 
	//this() - 내 생성자를 호출
	//생성자 오버로딩을 통해 아래의 생성자를 호출하여 코드의 중복을 제거한다

	//생성자 오버로딩


/*		기능 : 학생의 수강과목을 입력하면 subjectList에 추가
		매개변수 : 학생의 수강과목 -> Grade grade
		리턴타입 : 없다 -> void
		메서드명 : insertSubject
*/	
	
	
		//학점을 입력하는 메서드
		//List는 중복을 허용하기 때문에 Set과 달리 add의 값이 항상 참이다
		//점수가 주어지면 평점을 다시 계산한다


/*		기능 : 과목 리스트에 있는 과목들의 평점을 계산
		매개변수 : 없다 -> 과목 리스트에 있는 과목들의 정보는 멤버변수 subjectList에 있기 때문에
		리턴타입 : 없다 -> 평점을 멤버변수 average에 저장하기 때문에 따로 알려줄 필요가 없고 평점에 대한 정보가 필요하면 getAverage()를 호출하면 된다
		메서드명 : calculateAverage
*/	


/*		리스트에 있는 과목들을 하나씩 꺼내서 등급에 대한 점수들을 더한다
		과목들의 합을 학점으로 나눈다
		계산한 결과값을 멤버변수 average에 저장한다
		1.  List에 있는 과목들을 반복문을 통해 꺼낸다
		2.  해당 과목에서 받은 성적을 이용하여 계산
		2.1 Pass인 경우 해당 학점을 계산에 추가하지 않는다
		2.2 그 외의 성적은 해당 과목의 평점과 학점을 곱한 값과 학점을 각각 누적시킨다
		3.  반복문이 종료되면 평점과 학점을 곱해서 누적시킨 값을 누적시킨 학점으로 나눈 뒤 멤버변수 Average에 저장한다
*/
		//Set로 바뀌어도 수정하지 않아도 되도록 Iterator를 사용

		//점수가 P이면
		//아무것도 실행하지 않고 조건식으로 넘어간다
		//평점과 학점을 곱한 값을 누적
		//학점을 누적
	
		//멤버변수 average에 계산한 결과를 저장한다


/*		기능 : 
		매개변수 : 
		리턴타입 : boolean	(void와 boolean은 서로 변환 가능 -> 무조건 true나 false)
		메서드명 : printSubject
*/
		//과목 정보를 출력하는 기능
		//subjectList의 크기가 0이면(입력된 과목 정보가 없으면)
		//false를 반환한다
		//조건식이 참이면 false를 반환하고 조건문을 종료하기 때문에 else를 쓰지 않아도 된다


	
	
}
