package day16;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Example {

	public static void main(String[] args) {
		//ArrayList<Object> list1 = new ArrayList(10); ->사용할 클래스를 입력하는 게 더 정확한 코드
		ArrayList list1 = new ArrayList(10);	//크기가 10인 ArrayList list1를 생성
		list1.add(new Integer(5));				//0번지에  익명 객체를 생성해서 정수 5를 저장
		list1.add(new Integer(4));				//1번지에  익명 객체를 생성해서 정수 4를 저장
		list1.add(new Integer(2));				//2번지에  익명 객체를 생성해서 정수 2를 저장
		list1.add(new Integer(0));				//3번지에  익명 객체를 생성해서 정수 0를 저장
		list1.add(new Integer(1));				//4번지에  익명 객체를 생성해서 정수 1를 저장
		list1.add(new Integer(3));				//5번지에  익명 객체를 생성해서 정수 3를 저장

																//생성자 오버로딩을 사용(매개변수가 list1의 1번지~(4-1)번지까지인 list를 생성해서 ArrayList로 형변환)
		ArrayList list2 = new ArrayList(list1.subList(1, 4));	//크기가 list1의 1번지부터 4번지까지인 Arraylist list2를 생성한다
		print(list1, list2);									//매개변수 list1, list2를 사용하는 print 메서드를 호출
		
		Collections.sort(list1);	//list1과 list2를 정렬한다
		Collections.sort(list2);	
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));	//list1에 문자열 list2가 모두 포함됐는지 검사한다 
																						//list2(0, 2, 4)가 모두 포함돼 있으니 true
		list2.add("B");		//list2에 "B"를 저장한다
		list2.add("C");		//list2에 "C"를 저장한다
		list2.add(3, "A");	//insert : list2의 3번지의 값을 뒤로 밀고 나서 3번지에 "A"를 저장한다 (기존 값을 유지)
		print(list1, list2);
		
		list2.set(3, "AA");	//update : list2의 3번지에 "AA"를 덮어쓴다 (기존 값을 삭제)
		print(list1, list2);
		
		
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));	//list1에서 list2와 겹치는 부분이 있으면 남기고 나머지는 삭제한다
		print(list1, list2);														//겹치지 않는 내용이 있어서 삭제가 되면 true, 삭제가 안되면 false
		
		
		for(int i=list2.size()-1; i>=0; i--){	//list2에서 list1에 포함된 객체들을 삭제한다
			if(list1.contains(list2.get(i))){	//조건식 : list1에 lest2.get(i)번지의 값이 있다면
				list2.remove(i);				//지정된 위치에 있는 객체를 삭제하고 삭제된 객체를 반환한다
			}									//원소를 제거를 하기 위해선 큰 번지에서 작은 번지로 순서대로 제거한다
		}										// ->0번지부터 검색해 삭제한다면 0번지를 삭제 후 증감연산으로 i가 1로 증가했을 때 삭제 후 0번지가 검색되지 않고 1번지부터 검색이 진행된다
		print(list1, list2);		
		
		
	}

	private static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
