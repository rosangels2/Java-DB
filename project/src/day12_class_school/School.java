package day12_class_school;

import java.util.Scanner;

public class School {
	
	public static int MAX_STUDENT_COUNT = 300;
		
	public static void main(String[] args) {
		
/*		StudentManager stdMng = new StudentManager(MAX_STUDENT_COUNT);
		stdMng.insert(new Student("유재석",1,1,1,100,90,80));	//객체를 생성했는데 이름이 없다 = 익명 객체
		stdMng.insert(new Student("정준하",1,1,2,100,90,80));
		stdMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		stdMng.modify(new Student("박명수",1,1,1,100,100,100));
		stdMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		stdMng.delete(new Student("",1,1,1,0,0,0));
		stdMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		stdMng.insert(new Student("노홍철",2,1,1,100,100,100));
		stdMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		stdMng.insert(new Student("하하",2,3,7,10,10,5));
		stdMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		stdMng.delete(new Student("",2,3,7,0,0,0));
		stdMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		stdMng.insert(new Student("정형돈",2,1,1,100,100,90));
		stdMng.insert(new Student("길",3,3,17,2,4,6));
		stdMng.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
*/		
		
/*		do{	stdMng.printMenu();
		menu = scan.nextInt();
		}while(menu != 5); 밑의 for문의 조건식과 같다
*/
		StudentManager stdMng = new StudentManager();
		int menu = 0;
		Student s = new Student();
		Scanner scan = new Scanner(System.in);
		for( ; menu != 5; ){
			stdMng.printMenu();
			menu = scan.nextInt();
			switch(menu){
				case 1 : System.out.println(" - - - - - - - 추가할 정보를 입력하세요. - - - - - - - "); 
						 s = stdMng.inputStudent(scan);
						 stdMng.insert(s);
						 System.out.println("입력이 완료되었습니다.");
						 break;				
						 
						 /*
						 Student s = new Student();
						 System.out.println(" - - - - - - - 추가할 정보를 입력하세요. - - - - - - - "); 
				 		 System.out.print("학년 : ");
						 s.setGrade(scan.nextInt());
						 System.out.print("반 : ");
						 s.setClassNum(scan.nextInt());
						 System.out.print("번호 : ");
						 s.setNum(scan.nextInt());
						 System.out.print("이름 : ");
						 s.setName(scan.next());						 
						 System.out.print("국어점수 : ");
						 s.setKor(scan.nextDouble());
						 System.out.print("영어점수 : ");
						 s.setEng(scan.nextDouble());
						 System.out.print("수학점수 : ");
						 s.setMath(scan.nextDouble());
						 stdMng.insert(s));
						 stdMng.print(); 
						 break;
						 */

						 
				case 2 : System.out.println(" - - - - - - - 수정할 학생정보를 입력하세요. - - - - - - - "); 
						 s = stdMng.inputStudent(scan);
						 stdMng.modify(s);
						 System.out.println("수정이 완료되었습니다.");
						 break;
						 
				case 3 : System.out.println(" - - - - - - - 삭제할 학생정보를 입력하세요. - - - - - - - ");
						 s = stdMng.inputSearchStudent(scan);
						 stdMng.delete(s);
						 System.out.println("삭제가 완료되었습니다.");
						 break;
						 
				case 4 : stdMng.print();
						 break;				
						 
				case 5 : System.out.println("메뉴를 종료합니다."); break;
				
				default : System.out.println("잘못된 입력입니다."); break;
				
				
			}
		}
		scan.close();
				


	}
	
	
	
}

	
	
	





