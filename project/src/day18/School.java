package day18;

public class School {

	public static void main(String[] args) {
		
		StudentManager student = new StudentManager();
		student.insert(new Student(20191010, "최진영", Gender.MALE, Grade.FIVE, Major.DANCE, 29, 4.5));
		student.print();
		System.out.println(" -  - - - - - - -- - -");
		student.insert(new Student(20191010, "최진영", Gender.MALE, Grade.FIVE, Major.DANCE, 29, 4.5));
		student.print();
		System.out.println(" -  - - - - - - -- - -");
		student.delete(new Student(20191010, "최진영", Gender.MALE, Grade.FIVE, Major.DANCE, 29, 4.5));
		student.print();
		System.out.println(" -  - - - - - - -- - -");
		student.modify(new Student(20191010, "최진영", Gender.FEMAIL, Grade.FIVE, Major.DANCE, 29, 4.5));
		student.print();
		System.out.println(" -  - - - - - - -- - -");
		
		
		
	}

}
