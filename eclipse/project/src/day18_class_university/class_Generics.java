package day18_class_university;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class class_Generics {

	public static void main(String[] args) {

		Box<Integer> box = new Box<Integer>();		//Integer 타입의 Box클래스의 객체 box가 만들어진다
		Box<String> box1 = new Box<String>();		//생성자의 타입은 생략이 가능하다
													//<타입>을 정의해둘 시 타입 체크와 형변환을 생략할 수 있다 (정의해둔 타입으로 자동 형변환이 가능)
		Box<Object> box2 = new Box();				//타입을 정의하지 않을 시 최상의 조상클래스인 Object 클래스를 입력한다
		Box box3 = new Box();						//타입을 정의하지 않을 시 자동으로 형변환이 되지 않는다
		
		Set<Integer> set = new HashSet<Integer>();	//왼쪽에 인터페이스나 부모 클래스, 오른쪽에 구현 클래스나 자식클래스가 올 경우 원시타입이 일치하지 않아도 된다
		
		Box<Integer> b = new Box<>();
		b.add(10);
		b.add(20);
		b.add(30);
		System.out.println(b);
		System.out.println(b.size());
		System.out.println(b.get(2));				//객체명.get(i)를 통해 객체의 i번지의 값을 호출한다

	}

}

class Box<T>{									//Generics 타입을 선언해 생성한 후에 원하는 클래스 이름으로 T를 변경한다
	
	ArrayList<T> list = new ArrayList<T>();		//JDK1.7부터 추정이 가능한 경우 타입을 생략할 수 있게 되었다
	
	void add(T item){							//List의 기능들을 지네릭 타입을 이용해 사용한다
		list.add(item);
	}
	
	T get(int i){
		return list.get(i);
	}
	
	ArrayList<T> getList(){
		return list;
	}
	
	int size(){
		return list.size();
	}
	
	public String toString(){
		return list.toString();
	}
	
	
}