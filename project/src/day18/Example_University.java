package day18;

public class Example_University {

	public static void main(String[] args) {
		
		UniversityStudent std = new UniversityStudent(Gender.MALE, Grade.FRESHMAN, Major.NONE, "최진영", 2019150103);
		System.out.println(std);
		std.setUniversityName("그린");
		std.setGrade(Grade.FOUR);
		std.setMajor(Major.BIOLOGY);
		std.setAverage(0.5);
		System.out.println(std);
	}

}
