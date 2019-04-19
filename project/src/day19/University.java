package day19;

import java.util.*;

public class University {

	public static void main(String[] args) {
		
		StudentManager sMng = new StudentManager();
		int menu = 0;							//선택할 메뉴의 객체
		Scanner scan = new Scanner(System.in);
		do{
			sMng.printMenu();					//메뉴 출력
			menu = scan.nextInt();				//메뉴 선택
			switch(menu){
			case 1 : 
				Student s = sMng.inputStudent(scan);
				if(sMng.insert(s))
					System.out.println("해당 학생 정보를 추가했습니다.");
				else
					System.out.println("이미 등록된 학번입니다.");
				break;
			case 2 : 
				Student s1 = sMng.inputStudent(scan);
				if(sMng.update(s1))
					System.out.println("해당 학생 정보를 수정했습니다.");
				else
					System.out.println("없는 학번입니다.");
				break;				
			case 3 : 
				Student s2 = sMng.inputId(scan);
				if(sMng.delete(s2))
					System.out.println("해당 학생 정보를 삭제했습니다.");
				else
					System.out.println("없는 학번입니다.");
				break;			
			case 4 : 
				sMng.print();				
				break;			
			case 5 : 
				break;		
			default : 
				System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
				System.out.println("                           잘못된 메뉴를 선택했습니다.                           ");
				System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
			}		
		}while(menu != 5);
		System.out.println("메뉴를 종료합니다.");
		scan.close();
		
		
		
		
	}

}
