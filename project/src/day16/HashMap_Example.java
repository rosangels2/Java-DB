package day16;

import java.util.*;

public class HashMap_Example {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();			//인터페이스 map의 구현 클래스인 HashMap을 통해 객체를 생성
		map.put("myId", "1234");				//객체 map에 key - myId, value - 1234를 연결(mapping)하여 저장한다  -> 메서드 put
		map.put("asdf", "1111");				//객체 map에 key - asdf, value - 1111를 연결(mapping)하여 저장한다 
		map.put("asdf", "1234");				//객체 map에 key - asdf, value - 1234를 연결(mapping)하여 저장한다 -> key가 중복되면 value를 덮어쓴다
		
		Scanner s = new Scanner(System.in);		//화면으로부터 라인 단위로 입력을 받아 객체 s에 저장한다.
		
		while(true){											//key와 value가 일치할 때까지 계속 실행문을 실행한다
			System.out.println("Id와 password를 입력해주세요.");		
			System.out.println("Id : ");
			String id = s.nextLine().trim();					//Id를 라인 단위로 console에서 입력받는다
																//trim - 문자열의 모든 공백을 없앤다
			System.out.println("password : ");					
			String password = s.nextLine().trim();				//password를 라인 단위로 console에서 입력받는다
			System.out.println();
			
			if(!map.containsKey(id)){							//객체 map의 key의 값과 입력된 Id가 같은지 검색해서 비교하고 다르다면 실행문을 실행시킨다
				System.out.println("입력하신 Id는 존재하지 않습니다.");
				System.out.println("다시 입력해주세요.");
				continue;										//아래 실행문을 실행하지 않고 조건식을 다시 실행한다 -> 현재 코드에선 생략 가능(어차피 아래 조건식이 실행되지 않는다)
			}else{												//key의 값과 Id가 일치할 경우
				if(!map.get(id).equals(password)){				//입력받은 객체 map의 key값 id의 value와 password가 다를 경우 실행문을 실행한다
					System.out.println("비밀번호가 일치하지 않습니다.");
					System.out.println("다시 입력해주세요.");
				}else{											//객체 map의 key와 id의 값이 같고 value와 password가 같으면 실행문을 실행한다
						System.out.println("Id와 비밀번호가 일치합니다.");
						break;									//해당 조건문이 포함된 반복문을 빠져나간다
				}
			}
		}
	}

}


