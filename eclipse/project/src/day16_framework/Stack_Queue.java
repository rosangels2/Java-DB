package day16_framework;

import java.util.*;

public class Stack_Queue {

	public static void main(String[] args) {

		Stack st = new Stack();		
		Queue q = new LinkedList();	//Queue인터페이스의 구현체인 LinkedList를 사용(인터페이스는 생성자를 만들 수 없다)
		
		st.push("0");				//Stack에 객체를 저장한다
		st.push("1");
		st.push("2");
		
		q.offer("0");				//Queue에 객체를 저장하고 성공하면 true, 실패하면 false를 반환
		q.offer("1");
		q.offer("2");
		
		System.out.println(" - Stack - ");
		while(!st.empty()){					//boolean empty() -> Stack이 비어있는지 알려준다
			System.out.println(st.pop());	//Object pop() -> Stack의 맨 위에 저장된 객체를 꺼내서 반환한다
		}
		
		System.out.println(" - Queue -");
		while(!q.isEmpty()){				//list는 isEmpty를 사용
			System.out.println(q.poll());	//Object poll -> Queue에서 객체를 꺼내서 반환, 비어있으면 null을 반환
		}
	
	}	

}
