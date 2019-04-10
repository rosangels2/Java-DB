package day12;

public class School {
	
	public static int MAX_STUDENT_COUNT = 300;
		
	public static void main(String[] args) {
		StudentManager stdMng = new StudentManager(MAX_STUDENT_COUNT);
		stdMng.insert(new Student("홍길동",1,1,1,100,90,80));	//객체를 생성했는데 이름이 없다 = 익명 객체
		stdMng.insert(new Student("임꺽정",1,1,2,100,90,80));
		stdMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		stdMng.modify(new Student("유관순",1,1,1,100,100,100));
		stdMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		stdMng.delete(new Student("",1,1,1,0,0,0));
		stdMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		stdMng.insert(new Student("최진영",2,1,1,100,100,100));
		stdMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		stdMng.insert(new Student("이규민",2,3,7,10,10,5));
		stdMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
	}
	
	public static void printMenu(){
		System.out.println("1, 학생 정보 추가");
		System.out.println("2, 학생 정보 수정");
		System.out.println("3, 학생 정보 삭제");
		System.out.println("4, 학생 정보 출력");
		System.out.println("5, 종료");
		System.out.println("메뉴를 선택하세요 : ");
	}
	
	
	
}

	
	
	





