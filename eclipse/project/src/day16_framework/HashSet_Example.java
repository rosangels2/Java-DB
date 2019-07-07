package day16_framework;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Example {

	public static void main(String[] args) {

		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		
		Set set = new HashSet();				//interface를 구현한 HashSet 클래스를 통해 객체 생성
		
		for(int i=0; i < objArr.length; i++){
			set.add(objArr[i]);					//HashSet에 objArr의 요소들을 저장한다
						
		}
		System.out.println(set);				//HashSet에 저장된 요소들을 출력한다
		
												//출력값 - [1, 1, 2, 3, 4] -> 중복된 값은 저장하지 않는다(1은 각각 문자열과 정수)
	}

}
