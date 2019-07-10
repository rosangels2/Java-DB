package day19_class_university;

import java.util.*;

public class Student {			//String의 객체 멤버는 기본값이 null이기 때문에 "";값으로 초기화해서 빈 문자열로 명시적 초기화를 해 toString에 null대신 공백을 입력한다
								//초기화 순서 - 기본값 > 명시적 초기화 > 초기화 블록 > 생성자							
	private String name="";		//이름
	private String sName="";	//학교 이름
	private String id="";		//학번
	private String major="";	//전공
	private double average;		//평점
	private ArrayList<Grade> subjectList = new ArrayList<>();
	
	
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
	
	public Student(Student s){	//복사생성자 - 매개변수가 같은 클래스의 객체인 경우 
		this(s.name, s.sName, s.id, s.major, s.average, s.subjectList);	//this() - 내 생성자를 호출
	}																	//생성자 오버로딩을 통해 아래의 생성자를 호출하여 코드의 중복을 제거한다
	
	public Student(String name, String sName, String id, String major, double average, ArrayList<Grade> subjectList){		//생성자 오버로딩
		this.name = name;
		this.sName = sName;
		this.id = id;
		this.major = major;
		this.average = average;
		this.subjectList = subjectList;
	}
	
/*	기능 : 학생의 수강과목을 입력하면 subjectList에 추가
	매개변수 : 학생의 수강과목 -> Grade grade
	리턴타입 : 없다 -> void
	메서드명 : insertSubject
*/	
	public void insertSubject(Grade grade){		//학점을 입력하는 메서드
		subjectList.add(grade);					//List는 중복을 허용하기 때문에 Set과 달리 add의 값이 항상 참이다
		calculateAverage();						//점수가 주어지면 평점을 다시 계산한다
	}
	
/*	기능 : 과목 리스트에 있는 과목들의 평점을 계산
	매개변수 : 없다 -> 과목 리스트에 있는 과목들의 정보는 멤버변수 subjectList에 있기 때문에
	리턴타입 : 없다 -> 평점을 멤버변수 average에 저장하기 때문에 따로 알려줄 필요가 없고 평점에 대한 정보가 필요하면 getAverage()를 호출하면 된다
	메서드명 : calculateAverage
*/	
	public void calculateAverage(){
/*		리스트에 있는 과목들을 하나씩 꺼내서 등급에 대한 점수들을 더한다
		과목들의 합을 학점으로 나눈다
		계산한 결과값을 멤버변수 average에 저장한다
		1.  List에 있는 과목들을 반복문을 통해 꺼낸다
		2.  해당 과목에서 받은 성적을 이용하여 계산
		2.1 Pass인 경우 해당 학점을 계산에 추가하지 않는다
		2.2 그 외의 성적은 해당 과목의 평점과 학점을 곱한 값과 학점을 각각 누적시킨다
		3.  반복문이 종료되면 평점과 학점을 곱해서 누적시킨 값을 누적시킨 학점으로 나눈 뒤 멤버변수 Average에 저장한다
*/
		Iterator<Grade> it = subjectList.iterator();	//Set로 바뀌어도 수정하지 않아도 되도록 Iterator를 사용
		int sumUnit = 0;
		double sumPoint = 0.0;
		while(it.hasNext()){							
			Grade tmp = it.next();	
			if(tmp.getStep().equals("P"))				//점수가 P이면
				continue;								//아무것도 실행하지 않고 조건식으로 넘어간다
			sumPoint += tmp.getPoint()*tmp.getUnit();	//평점과 학점을 곱한 값을 누적
			sumUnit += tmp.getUnit();					//학점을 누적
		}
		average = sumPoint/sumUnit;						//멤버변수 average에 계산한 결과를 저장한다
	}
	
/*	기능 : 
	매개변수 : 
	리턴타입 : boolean	(void와 boolean은 서로 변환 가능 -> 무조건 true나 false)
	메서드명 : printSubject
*/
	public boolean printSubject(){		//과목 정보를 출력하는 기능
		if(subjectList.size() == 0)		//subjectList의 크기가 0이면(입력된 과목 정보가 없으면)
			return false;				//false를 반환한다
		Iterator<Grade> it = subjectList.iterator();	//조건식이 참이면 false를 반환하고 조건문을 종료하기 때문에 else를 쓰지 않아도 된다
		while(it.hasNext()){
			Grade tmp = it.next();
			System.out.println(tmp);
		}
		return true;
	}
	
}