package day12;

public class StudentManager {
	
	private Student std[];	//학생 정보를 관리하기 위해 학생 정보를 저장할 주소를 가지는 배열을 선언
	private int count;		//현재 저장된 학생 수
	private final int MIN_STUDENT_COUNT = 300;
	
	public StudentManager(){
		std = new Student[MIN_STUDENT_COUNT];	//std는 참조변수이기 때문에 생성자가 꼭 호출돼야 한다
	}
	
	public StudentManager(int studentCnt){
		if(studentCnt >= MIN_STUDENT_COUNT)
			std = new Student[studentCnt];
		else
			std = new Student[MIN_STUDENT_COUNT];
	}

/*	기능 : 학생정보를 배열에 추가
	매개변수 : 학생정보 -> Student s
				   -> String name, int grade, ... (메서드 오버로딩으로 두가지 다 사용 가능)
	리턴타입 : void
	메서드명 : insert	
*/	
	
	public void insert(Student s){
		std[count++] = new Student(s);	//std[??] : Student 클래스의 객체가 선언만 돼있고
	//	count++; = std[count++]			//insert 기능에서 객체 정보를 추가하려면 객체를 생성한 후(new) 매개변수의 값을 복사해야 한다(Student(s))
		
	//	std[count] = s ; 문법적으론 이상이 없지만 객체 s와 count번지의 주소가 공유되기 때문에 외부에서 s의 값이 변하면 count번지의 값도 같이 변할 수 있다
		
	}
		
/*	 기능 : 학생정보 전체 출력
	 매개변수 : 없다 (매개변수는 외부에서 입력되는 값이기 떄문에 이미 count에 저장하고 있는 학생정보는 가져올 필요가 없다)
	 리턴타입 : 없다 -> void
	 메서드명 : print
*/	
	public void print(){
		for(int i=0; i<count; i++){
			System.out.println(std[i]);
		}
	}
	
/*	 학생 정보를 수정 또는 삭제하기 위해서 학생정보가 있는지를 알아야 하기 때문에 검색하는 기능을 추가 구현
  	 기능 : 학생정보를 검색해서 없으면 -1을, 있으면 배열에 위치한 번지를 알려주는 기능
  	 매개변수 : 학년, 반, 번호 -> int grade, int classNum, int num
	 리턴타입 : -1 또는 번지의 주소 -> int
	 메서드명 : search	
*/	
	private int search(int grade, int classNum, int num){
		for(int i=0; i<count; i++){
			if(std[i].getGrade() == grade && 
					std[i].getClassNum() == classNum &&
					std[i].getNum() == num){
				return i;
			}
		}
		return -1;
	}
	
/*	기능 : 학생정보를 배열에서 수정
	매개변수 : 학생정보 -> Student s
	리턴타입 : 없다 -> void
	메서드명 : modify
*/	
	public void modify(Student s){											//메서드 search의 자료형이 int이기 때문에 int를 사용 가능
		int searchIndex = search(s.getGrade(),s.getClassNum(),s.getNum());	//검색했을 때 해당 정보가 있는 번지
		if(searchIndex != -1){				
			std[searchIndex] = new Student(s);
		}
			
		
	}
	
/*	기능 : 배열에서 학생정보 삭제
	매개변수 : 학생정보 -> Student s
	리턴타입 : 없다 -> void
	메서드명 : delete
*/
	public void delete(Student s){
		int searchIndex = search(s.getGrade(),s.getClassNum(),s.getNum());	//검색했을 때 해당 정보가 있는 번지
		if(searchIndex != -1){				
			std[searchIndex] = new Student(s);
			for(int i=searchIndex; i<count-1; i++){	//i<count-1이어야 count-1번지가 count-2번지에 저장되고 반복문이 종료된다
				std[i] = std[i+1];					//이유 : 번지수를 하나 줄여야 하기 때문에
			}
			std[count-1] = null;	//중복된 마지막 번지를 null; 값으로 초기화한다
			count--;				//필요없어진 마지막 번지를 하나 감소시킨다
		}
		
	}
	
	
	
	



}