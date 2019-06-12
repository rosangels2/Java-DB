package day19_class_university;

import java.util.*;

public class University_Comment {

	public static void main(String[] args) {
		
/*		학생 정보를 입력해서 메서드의 기능이 잘 작동되는지 확인
		StudentManager sMng = new StudentManager();
		sMng.insert(new Student("201910101", "임꺽정", "강화대교", "사과", 3.0));
		sMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		sMng.insert(new Student("201910102", "유관순", "한강대교", "무화과", 4.0));
		sMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		sMng.delete(new Student("201910101", "임꺽정", "강화대교", "사과", 3.0));
		sMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		sMng.update(new Student("201910102", "임꺽정", "강화대교", "사과", 3.0));
		sMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
*/		
		
		
		
/*		//학생 한명 정보를 만들고 정보에 과목을 추가한 뒤 평점을 확인
		Student std = new Student("최진영", "강화대교", "2019101000", "무화과", 0.0);
		System.out.println(std);
		std.insertSbuject(new Grade("A+", "홍길동", "풋사과", 3));
		System.out.println(std);
		std.insertSbuject(new Grade("B+", "임꺽정", "한과", 2));
		System.out.println(std);
		std.insertSbuject(new Grade("A",  "유관순", "청사과", 3));
		System.out.println(std);		
*/			
		
		
		//선택할 메뉴의 객체
		//메뉴 출력
		//메뉴 선택
		//Student클래스의 객체 std에 inputStudent를 통해 콘솔에서 입력받은 정보를 저장한다
		//객체 std의 정보를 StudentManager의 객체 sMng에 추가하는데 성공했으면 실행문을 실행한다
		//intsert안의 set메서드 add는 중복되지 않아 추가에 성공하면 true, 실패하면 false의 값을 반환한다
		//객체 std의 정보를 StudentManager의 객체 sMng에 추가하는데 실패했으면 실행문을 실행한다

		
/*		기존 : 학생 정보를 입력받고 학생정보를 추가
		변경 : 2번 선택시 학생정보 수정 또는 과목 등록을 할 수 있게 한다
*/				
		//메뉴 출력

		//메뉴 선택
		
		//선택된 메뉴의 기능 실행
		
		//Student클래스의 객체 std에 inputStudent를 통해 콘솔에서 입력받은 정보를 저장한다
		//객체 std의 정보를 StudentManager의 객체 sMng에 추가하는데 성공했으면 
		//실행문을 실행한다
		//객체 std의 정보를 StudentManager의 객체 sMng에 추가하는데 실패했으면 
		//실행문을 실행한다

		//과목을 추가하는 기능
					//검색할 학생 정보 입력 후 해당 학생 정보로 검색하여 없으면 결과를 알려주며 종료하고, 있다면 과목을 추가한다
		//sMng의 inputId를 스캐너를 통해 입력받아 객체 std에 복사한 뒤
		//sMng에서 std를 찾아 result에 저장한다
		//result가 null이면 실패했음을 알려준다
		
		//메뉴 출력

		//메뉴 선택
		
		//1.1검색해서 학번이 있다면 해당 학생을 출력
		//result가 null일 때 result.printSubject를 실행하면 nullPointException 예외가 발생
		//result가 null이 아닐 때에만 printSubject가 실행되도록 else if를 사용
		//result의 printSubject 메서드 실행 결과가 거짓이면
		//subMenu가 3이면
		//sMng객체를 전부 출력한다
		//1.2해당하는 학번의 학생 정보가 없다면 "없는 학번입니다." 출력
		//3. 전체 학생 정보 출력			
		
	}
}
