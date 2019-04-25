package day19;

import java.util.*;

public class University {

	public static void main(String[] args) {
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
		
		StudentManager sMng = new StudentManager();
		int menu = 0;							//선택할 메뉴의 객체
		Scanner scan = new Scanner(System.in);
		do{
			sMng.printMenu();					//메뉴 출력
			menu = scan.nextInt();				//메뉴 선택
			Student std, result;
			int subMenu;
			switch(menu){
			case 1 : 
				std = sMng.inputStudent(scan);	//Student클래스의 객체 std에 inputStudent를 통해 콘솔에서 입력받은 정보를 저장한다
				if(sMng.insert(std))			//객체 std의 정보를 StudentManager의 객체 sMng에 추가하는데 성공했으면 실행문을 실행한다
					System.out.println("해당 학생 정보를 추가했습니다.");	//intsert안의 set메서드 add는 중복되지 않아 추가에 성공하면 true, 실패하면 false의 값을 반환한다
				else							//객체 std의 정보를 StudentManager의 객체 sMng에 추가하는데 실패했으면 실행문을 실행한다
					System.out.println("이미 등록된 학번입니다.");
				break;
			case 2 : 
/*				기존 : 학생 정보를 입력받고 학생정보를 추가
				변경 : 2번 선택시 학생정보 수정 또는 과목 등록을 할 수 있게 한다
*/				
				//메뉴 출력
				System.out.println("2-1. 학생 정보 수정");
				System.out.println("2-2. 학생 수강 과목 등록");
				System.out.println("서브 메뉴를 선택하세요. (1 ~ 2) : ");
				//메뉴 선택
				subMenu = scan.nextInt();
				//선택된 메뉴의 기능 실행
				if(subMenu == 1){
					std = sMng.inputStudent(scan);		//Student클래스의 객체 std에 inputStudent를 통해 콘솔에서 입력받은 정보를 저장한다
					if(sMng.update(std)){				//객체 std의 정보를 StudentManager의 객체 sMng에 추가하는데 성공했으면 
						System.out.println("해당 학생 정보를 수정했습니다.");	//실행문을 실행한다
					}else{								//객체 std의 정보를 StudentManager의 객체 sMng에 추가하는데 실패했으면 
						System.out.println("존재하지 않는 학번입니다.");		//실행문을 실행한다
					}
				}else if(subMenu == 2){
					//과목을 추가하는 기능
					//검색할 학생 정보 입력 후 해당 학생 정보로 검색하여 없으면 결과를 알려주며 종료하고, 있다면 과목을 추가한다
					std = sMng.inputId(scan);		//sMng의 inputId를 스캐너를 통해 입력받아 객체 std에 복사한 뒤
					result = sMng.search(std);		//sMng에서 std를 찾아 result에 저장한다
					if(result == null){				//result가 null이면 실패했음을 알려준다
						System.out.println("존재하지 않는 학번입니다.");
						break;
					}
				Grade grd = sMng.inputSubject(scan);
				result.insertSubject(grd);
				sMng.update(result);					
				}
				break;
					
			case 3 : 
				std = sMng.inputId(scan);
				if(sMng.delete(std))
					System.out.println("해당 학생 정보를 삭제했습니다.");
				else
					System.out.println("존재하지 않는 학번입니다.");
				break;			
			case 4 : 
				//메뉴 출력
				System.out.println("4-1. 개인 학생 정보 출력");
				System.out.println("4-2. 학생 수강 과목 전체 출력");
				System.out.println("4-3. 학생 정보 전체 출력");
				System.out.println("서브 메뉴를 선택하세요. (1 ~ 3) : ");
				//메뉴 선택
				subMenu = scan.nextInt();
				//1.1검색해서 학번이 있다면 해당 학생을 출력
				std = sMng.inputId(scan);
				result = sMng.search(std);
				if(subMenu == 1){
					System.out.println(result);
				}else if(subMenu == 2){
					if(result == null){								//result가 null일 때 result.printSubject를 실행하면 nullPointException 예외가 발생
						System.out.println("존재하지 않는 학번입니다.");	//result가 null이 아닐 때에만 printSubject가 실행되도록 else if를 사용
					}else if(!result.printSubject()){				//result의 printSubject 메서드 실행 결과가 거짓이면
						System.out.println("수강한 강의가 없습니다.");		
					}
				}else if(subMenu == 3){								//subMenu가 3이면
						sMng.print();								//sMng객체를 전부 출력한다
				}else{
					System.out.println("잘못 선택하셨습니다. 출력 메뉴를 종료합니다.");
				}
				//1.2해당하는 학번의 학생 정보가 없다면 "없는 학번입니다." 출력
				// 
				//3. 전체 학생 정보 출력			
				break;			
			case 5 : 
				break;		
			default : 
				System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.out.println("잘못된 메뉴를 선택했습니다. 메뉴를 다시 선택해주세요.");
				System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
			}		
		}while(menu != 5);
		System.out.println("메뉴를 종료합니다.");
		scan.close();
	
		
		
		
	}

}