package day16;

import java.util.*;

public class Vector_Example1 {

	public static void main(String[] args) {
		
		Vector v = new Vector(5);	//최대 저장 용량이 5인 Vector를 생성한다
		v.add("1");					//백터의 객체 v의 0번지에 문자열 1을 저장한다
		v.add("2");					//백터의 객체 v의 1번지에 문자열 2을 저장한다
		v.add("3");					//백터의 객체 v의 2번지에 문자열 3을 저장한다
		print(v);					//객체 v를 출력하는 print 메서드를 호출한다
		System.out.println();
		
		v.trimToSize();				//빈 공간을 없앤다(size에 맞게 용량을 줄인다)
		System.out.println("--- After trimToSize() ---");
		print(v);
		System.out.println();
		
		v.ensureCapacity(6);		//사용 가능한 용량을 6개로 늘린다
		System.out.println("--- After ensureCapacity(6) ---");
		print(v);
		System.out.println();
		
		v.setSize(7);				//사용 가능한 용량을 7개로 늘리고 비어있는 공간을 null값으로 초기화한다 -> setSize는 capacit를 size+5로 확장한다
		System.out.println("--- After setSize(7) ---");
		print(v);
		System.out.println();
		
		v.clear();					//저장된 객체를 모두 삭제한다 -> 용량은 그대로
		System.out.println("--- After clear() ---");
		print(v);
		System.out.println();
		
	}

	private static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacit : " + v.capacity());
	}

}
