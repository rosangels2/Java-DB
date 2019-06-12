package day16_framework;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.swing.border.MatteBorder;

public class HashSet_Example1 {

	public static void main(String[] args) {
		
		Set set = new HashSet();					//Set 인터페이스를 구현한 HashSet 클래스를 통해 객체 set를 생성
		
		while(set.size() < 6){			
			int num = (int)(Math.random()*45)+1;	
			set.add(new Integer(num));
		}
		List list = new LinkedList(set);			//LinkedList(Collection c)
		Collections.sort(list);						//Collections.sort(List list) -> list를 정렬한다
		System.out.println(list);
	}

}
