package day14;

import day14.Person;

public class UniversityStudent extends Person {

	private String id;				//학번
	private String state;			//학생 상태 - 재학, 수료, 졸업, 휴학, 재적
	private double averageScore;	//학점
	private int semester;			//학기
	private String major;			//전공
	private String universityName;	//학교명
	private String advisor;			//지도 교수
	
	
	
	public String getId() {
		return id;
	}
	public String getState() {
		return state;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public int getSemester() {
		return semester;
	}
	public String getMajor() {
		return major;
	}
	public String getUniversityName() {
		return universityName;
	}
	public String getAdvisor() {
		return advisor;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setAverageScore(double averageScore) {
		if(averageScore >= 0)
		this.averageScore = averageScore;
	}
	public void setSemester(int semester) {
		if(semester > 0)
		this.semester = semester;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	
	

	public UniversityStudent(){
		//super(s);가 생략
		setSemester(1);
		setAverageScore(0.0);
		id = ""; 
		advisor = ""; 
		state = ""; 
		universityName = ""; 
		major = "";
	}
	
	public UniversityStudent(UniversityStudent s){
		super(s);	//자식클래스 객체 s를 부모클래스로 형변환
					//super((Person)s); 가 자동으로 형변환된다 ->자식 클래스가 더 크기 때문에
		setSemester(s.semester);
		setAverageScore(s.averageScore);
		id = s.id; 
		advisor = s.advisor; 
		state = s.state; 
		universityName = s.universityName; 
		major = s.major;
	}
	
	public UniversityStudent(String name, String address, String nationallity, String gender, 
			String birthDay, int age, int semester, double averageScore, 
			String id, String advisor, String state, String universityName, String major){
		super(name, address, nationallity, gender, birthDay, age);	//super();는 부모클래스의 생성자를 호출
		setSemester(semester);
		setAverageScore(averageScore);
		this.id = id;
		this.advisor = advisor;
		this.state = state;
		this.universityName = universityName;
		this.major = major;
		
		
		
		
	}
	
	
}
