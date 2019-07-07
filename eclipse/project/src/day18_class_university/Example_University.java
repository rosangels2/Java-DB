package day18_class_university;

public class Example_University {

	public static void main(String[] args) {
		
		Example_UniversityStudent std = new Example_UniversityStudent(Gender.MALE, Grade.FRESHMAN, Major.NONE, "최진영", 2019150103);
		System.out.println(std);
		std.setUniversityName("그린");
		std.setGrade(Grade.FOUR);
		std.setMajor(Major.BIOLOGY);
		std.setAverage(0.5);
		System.out.println(std);
	}

}
