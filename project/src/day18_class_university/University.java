package day18_class_university;

import java.util.*;

public class University {

	public static void main(String[] args) {
		
		StudentManager smg = new StudentManager();
		
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		do{
			smg.printMenu();
			menu = scan.nextInt();
			switch(menu){
			case 1 : 
				Student s = smg.inputStudent(scan);
				if(smg.insert(s)){
					System.out.println("해당 정보를 추가했습니다.");
				}else{
					System.out.println("이미 등록된 학번입니다.");
				}
				break;
			case 2 : 
				Student s1 = smg.inputStudent(scan);
				if(smg.update(s1)){
					System.out.println("해당 정보를 수정했습니다.");
				}else{
					System.out.println("없는 학번입니다.");
				}
				break;
			case 3 : 
				Student s2 = smg.inputId(scan);
				if(smg.delete(s2)){
					System.out.println("해당 정보를 삭제했습니다.");
				}else{
					System.out.println("없는 학번입니다.");
				}
				break;
			case 4 : 
				smg.print();
				break;
			case 5 :
				System.out.println("메뉴를 종료합니다.");
				break;
			default : 
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		}while(menu != 5);
		
		
	}

}
