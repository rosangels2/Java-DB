package practice;

import java.util.*;

public class practice3 {

	public static void main(String[] args) {
		
		//1~6을 ArrayList에 순서대로 저장하고 해당 ArrayList를 섞는 코드를 작성
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=6; i++){
			list.add(i);
		}
		System.out.println(list);
		
		//i가 0에서 5까지 반복하면서 랜덤으로 생성된 수 r(0~5)와 i의 위치에 있는 list를 서로 교환
		for(int i=0 ; i<6 ; i++){
			int r = (int)((Math.random()*5)+1);
			int tmp = list.get(r);
			list.set(r, list.get(i));
			list.set(i, tmp);
		}
		System.out.println(list);
		
		
		list.clear();
		for(int i=1; i<=6; i++){
			list.add(i);
		}
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}
