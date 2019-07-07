package practice;

import java.util.*;

public class practice2 {

	public static void main(String[] args) {
		
		//예제)Scanner와 컬렉션 프레임워크를 이용하여 중복되지 않는 6개의 정수를 입력받는 코드를 작성하세요
		Scanner scan = new Scanner(System.in);
		
		//중복되지 않는 Set의 객체를 생성
		HashSet<Integer> set = new HashSet<Integer>(); 
		
		//스캐너를 통해 6개의 정수를 입력
		//int num = scan.nextInt();
		
		//입력받은 값을 6개까지 Set에 저장
		while(set.size()<6){
			int num = scan.nextInt();
			set.add(num);
		}
		System.out.println(set);	//set에 저장된 값을 출력
		scan.close();
	}

}
