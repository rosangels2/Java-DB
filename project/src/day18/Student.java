package day18;

public class Student {
	
	//학번 이름, 성별, 학년, 전공, 나이, 학점
	private int id;
	private String name;
	private Gender gender;
	private Grade grade;
	private Major major;
	private int age;
	private double average;
	
	
	public String getName() {
		return name;
	}
	public Gender getGender() {
		return gender;
	}
	public Grade getGrade() {
		return grade;
	}
	public Major getMajor() {
		return major;
	}
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public double getAverage() {
		return average;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	
	@Override
	public String toString() {
		return "학생 / 학번 = " + id + ", 이름 = " + name  +", 성별 = " + gender + ", 학년 = " + grade + ", 전공 = " + major 
				+ ", 나이 = " + age + ", 학점 = " + average;
	}
	
	
	public Student(){
		this.name = "없음";
		this.gender = Gender.MALE;
		this.grade = Grade.FRESHMAN;
		this.major = Major.NONE;
	}
	
	public Student(Student s){
		this.id = s.id;
		this.name = s.name;
		this.gender = s.gender;
		this.grade = s.grade;
		this.major = s.major;
		this.age = s.age;
		this.average = s.average;
	}
	
	public Student(int id, String name, Gender gender, Grade grade, Major major, int age, double average){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.grade = grade;
		this.major = major;
		this.age = age;
		this.average = average;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
