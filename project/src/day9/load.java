package day9;

import day6.lotto; // 해당 패키지의 메서드를 불러오기 위해 자신의 패키지명 밑에 import 패키지명.클래스명; 을 입력해 준다

public class load {

	public static void main(String[] args) {

		String []s = new String[3]; // 빈 배열을 만들어서 다른 메인의 실행문을 그대로 호출해서 출력 (클래스명.메인)
		lotto.main(s);


	}

}
