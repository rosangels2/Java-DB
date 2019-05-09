package day19;

import java.util.*;

public class StudentMnanager_Comment {

/*		매니저는 학생 정보들을 관리하기 위한 저장 공간이 필요
		쉽게 정보들을 관리하기 위해 컬렉션 프레임워크 사용
		학생정보들은 중복되면 안되기 때문에 Set을 이용한다(List를 이용할 경우 중복처리를 별개로 해줘야 한다)
*/	
	
	
	
/*		기능 : 학생 정보가 주어졌을 떄 list와 중복되지 않으면 추가하고 list와 중복되면 추가하지 않고 결과를 알려주는 기능
		매개변수 : 학생 정보 -> Student s
		리턴타입 : 결과 -> true, false -> boolean
		메서드명 : insert
*/	
										 
	
	
	
/*		기능 : 학생 정보가 주어졌을 때 list와 중복이되면 해당 학생 정보를 반환하는 기능
		매개변수 : 학생 정보 -> Student s
		리턴타입 : 학생 정보 -> Student s
		메서드명 : search
*/		

		//Iterator 객체 it에 list를 Iterator로 변환하여 저장한다
		//list에서 꺼낼 값이 있는지 확인한다
		//list에서 꺼낼 값이 있다면 꺼내서 tmp에 저장한다
		//list에서 꺼낸 tmp와 s를 equals로 비교한 후 같다면 tmp를 반환한다
							
		//반복문이 종료할 때까지 return이 안된 것은 해당 정보와 중복되는 객체가 list에 없는 경우이기 때문에 null값을 사용
	
	
	
	
/*		기능 : 학생 정보가 주어졌을 때 list와 중복이되면 list에서 정보를 수정하고 list와 중복이 되지 않으면 실패를 알려주는 기능
		매개변수 : 학생 정보 -> Student s
		리턴타입 : 결과 -> true, false -> boolean
		메서드명 : update
*/	
		//Set에서 수정을 하려면 기존에 있는 객체를 삭제한 후 수정된 객체 정보를 추가해야 한다
		//delete(s)에 실패하면 false를 반환한다
		
		
		//delete(s)에 성공하면 list에 객체 s를 저장한다
	
			
	
	

/*		기능 : 학생 정보가 주어졌을 때 list와 중복이되면 list에서 정보를 삭제하고 list와 중복이 되지 않으면 실패를 알려주는 기능
		매개변수 : 학생 정보 -> Student s
		리턴타입 : 결과 -> true, false -> boolean
		메서드명 : delete
*/	
		//search의 return값인 객체 또는 null값을 tmp에 저장한다
		//tmp가 null이면 찾는 학생 정보가 존재하지 않는 것이기 때문에 실패를 반환한다
		//remove()는 삭제에 성공하면 true, 일치하는 정보가 업으면 false값을 반환한다
	
	
	
	
	
/*		기능 : 전체 학생 정보들을 출력하는 기능
		매개변수 : 전체를 출력하기 때문에 매개변수는 필요없다
		리턴타입 : void
		메서드명 : print
*/	
								
	
	
		//기능 - 메뉴를 출력

	
/*		기능 : Scanner를 통해 학생 학번을 입력받아 학생 객체로 돌려주는 기능
		매개변수 : Scanner scan
		리턴타입 : Student
		메서드명 : inputId
*/	
	
	
		//String 객체 id를 스캔으로 공백을 제거하며 입력받는다
		//Student의 기본생성자를 통해 초기화하면서 생성한 뒤 Student의 객체 tmp에 저장한다
	
	
	
/*		기능 : 과목 정보를 입력받아
		매개정보 : Scanner scan
		리턴타입 : 과목 객체 -> Grade
		메서드명 : inputSubject
*/	
		//스캐너를 통해 매개변수를 입력받아 기능을 실행하고 결과로 Grade의 객체를 반환하기 때문에 리턴타입이 Grade클래스
	
}
