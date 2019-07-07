package day18_class_university;

public class Student {
	
	//학생 정보를 저장하는 클래스
	//학생 정보 - 학번, 이름, 학교명, 전공, 학점
	private String id;
	private String name;
	private String sName;
	private String major;
	private double average;
	
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getsName() {
		return sName;
	}
	public String getMajor() {
		return major;
	}
	public double getAverage() {
		return average;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setAverage(double average) {
		if(average > 4.5 || average < 0){
			return ;
		}	
		this.average = average;
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
	
	@Override
	public String toString() {
		return "학생   /  학번 = " + id + ", 이름 = " + name + ", 학교명 = " + sName + ", 전공 = " + major + ", 학점 = " + average;
	}
	
	public Student(){
		
	}
	
	public Student(Student s){
		this(s.id, s.name, s.sName, s.major, s.average);
	}

	public Student(String id, String name, String sName, String major, double average){
		this.id = id;
		this.name = name;
		this.sName = sName;
		this.major = major;
		this.average = average;
	}
}
