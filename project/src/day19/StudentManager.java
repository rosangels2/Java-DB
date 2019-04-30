package day19;

import java.util.*;	//* = all(모든 java.utll을 참조하겠다는 표시)

public class StudentManager {

/*	매니저는 학생 정보들을 관리하기 위한 저장 공간이 필요
	쉽게 정보들을 관리하기 위해 컬렉션 프레임워크 사용
	학생정보들은 중복되면 안되기 때문에 Set을 이용한다(List를 이용할 경우 중복처리를 별개로 해줘야 한다)
*/	
	private HashSet<Student> list = new HashSet<Student>();	//public일 경우 원본을 외부에서 직접 수정하게 되기 떄문에 원본을 유지한 채 간접적으로 수정하기 위해 private을 사용
	
	
	
/*	기능 : 학생 정보가 주어졌을 떄 list와 중복되지 않으면 추가하고 list와 중복되면 추가하지 않고 결과를 알려주는 기능
	매개변수 : 학생 정보 -> Student s
	리턴타입 : 결과 -> true, false -> boolean
	메서드명 : insert
*/	
	public boolean insert(Student s){	//매개변수 s를 그대로 넣으면 list와 외부에서 s의 주소를 공유하기 때문에 외부에서 수정할 시 s도 바뀔 수 있으므로
		Student tmp = new Student(s);	//tmp를 새로 만들어서 s를 복사해 넣은 뒤 tmp를 list에 추가한다
		return list.add(tmp);			//add라는 메서드는 Set list와 tmp가 중복되지 않으면 해당 객체를 추가하며 true를, 중복되면 추가하지 않고 false를 return한다(Set의 특징)
	}									 
	
	
	
/*	기능 : 학생 정보가 주어졌을 때 list와 중복이되면 해당 학생 정보를 반환하는 기능
	매개변수 : 학생 정보 -> Student s
	리턴타입 : 학생 정보 -> Student s
	메서드명 : search
*/		

	public Student search(Student s){
		Iterator<Student> it = list.iterator();	//Iterator 객체 it에 list를 Iterator로 변환하여 저장한다
		while(it.hasNext()){					//list에서 꺼낼 값이 있는지 확인한다
			Student tmp = (Student)it.next();	//list에서 꺼낼 값이 있다면 꺼내서 tmp에 저장한다
			if(tmp.equals(s)){					//list에서 꺼낸 tmp와 s를 equals로 비교한 후 같다면 tmp를 반환한다
				return tmp;
			}
		}										
		return null;							//반복문이 종료할 때까지 return이 안된 것은 해당 정보와 중복되는 객체가 list에 없는 경우이기 때문에 null값을 사용
	}
	
	
	
/*	기능 : 학생 정보가 주어졌을 때 list와 중복이되면 list에서 정보를 수정하고 list와 중복이 되지 않으면 실패를 알려주는 기능
	매개변수 : 학생 정보 -> Student s
	리턴타입 : 결과 -> true, false -> boolean
	메서드명 : update
*/	
	public boolean update(Student s){		//Set에서 수정을 하려면 기존에 있는 객체를 삭제한 후 수정된 객체 정보를 추가해야 한다
		if(!delete(s)){						//delete(s)에 실패하면 false를 반환한다
		return false;
		}
		return insert(s);					//delete(s)에 성공하면 list에 객체 s를 저장한다
	}
			
	
	

/*	기능 : 학생 정보가 주어졌을 때 list와 중복이되면 list에서 정보를 삭제하고 list와 중복이 되지 않으면 실패를 알려주는 기능
	매개변수 : 학생 정보 -> Student s
	리턴타입 : 결과 -> true, false -> boolean
	메서드명 : delete
*/	
	public boolean delete(Student s){
		Student tmp = search(s);				//search의 return값인 객체 또는 null값을 tmp에 저장한다
		if(tmp == null){						//tmp가 null이면 찾는 학생 정보가 존재하지 않는 것이기 때문에 실패를 반환한다
			return false;
		}
		return list.remove(tmp);						//remove()는 삭제에 성공하면 true, 일치하는 정보가 업으면 false값을 반환한다
	}
	
	
	
	
/*	기능 : 전체 학생 정보들을 출력하는 기능
	매개변수 : 전체를 출력하기 때문에 매개변수는 필요없다
	리턴타입 : void
	메서드명 : print
*/	
	public void print(){							//★Iterator 선언부터 while문의 실행문까진 외워서 사용할 것(중요)★
		Iterator<Student> it = list.iterator();		//Iterator를 호출하는 코드 -> ex)Scanner scan = new Scanner(System.in);
		while(it.hasNext()){						//list에서 꺼낼 값이 있는지 확인한다
			Student tmp = (Student)it.next();		//list에서 꺼낼 값이 있다면 꺼내서 tmp에 저장한다
			System.out.println(tmp);				//list에서 꺼낸 tmp의 값을 출력한다
		}
	}												
	
	
	//기능 - 메뉴를 출력
	public void printMenu(){
		System.out.println(" - - - - - 메뉴 - - - - -");
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 학생 정보 수정");
		System.out.println("3. 학생 정보 삭제");
		System.out.println("4. 학생 정보 출력");
		System.out.println("5. 종료");
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("메뉴를 입력해주세요 : ");
	}
	
/*	기능 : Scanner를 통해 학생 학번을 입력받아 학생 객체로 돌려주는 기능
	매개변수 : Scanner scan
	리턴타입 : Student
	메서드명 : inputId
*/	
	public Student inputId(Scanner scan){
		System.out.println(" - - - - - 정보를 입력하세요 - - - - - ");
		System.out.println("학번 : ");
		String id = scan.next().trim();								//String 객체 id를 스캔으로 공백을 제거하며 입력받는다
		Student tmp = new Student();								//Student의 기본생성자를 통해 초기화하면서 생성한 뒤 Student의 객체 tmp에 저장한다
		tmp.setId(id);
		return tmp;
	}
	
	public Student inputStudent(Scanner scan){
		Student tmp = inputId(scan);
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("학교명 : ");
		String sName = scan.next();
		System.out.print("전공 : ");
		String major = scan.next();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		tmp.setName(name);
		tmp.setSname(sName);
		tmp.setMajor(major);
		return tmp;
	}
	
/*	기능 : 과목 정보를 입력받아
	매개정보 : Scanner scan
	리턴타입 : 과목 객체 -> Grade
	메서드명 : inputSubject
*/	
	public Grade inputSubject(Scanner scan){		//스캐너를 통해 매개변수를 입력받아 기능을 실행하고 결과로 Grade의 객체를 반환하기 때문에 리턴타입이 Grade클래스
		System.out.print("등급을 입력하세요 : ");
		String step = scan.next().trim();
		System.out.print("담당 교수명을 입력하세요 : ");
		String professor = scan.next().trim();
		System.out.print("과목명을 입력하세요 : ");
		String title = scan.next().trim();
		System.out.print("학점을 입력하세요 : ");					
		int unit = scan.nextInt();
		Grade grd = new Grade(step, professor, title, unit);
		return grd;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}