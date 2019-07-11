package day08_method;

public class Method_example {

	public static void main(String[] args) {

	System.out.println(factorial(5));

	}
	
	//잘못된 재귀 메소드 예제
	public static void print(){ //스택에 print();가 쌓여 최대치를 넘김으로써 스택 오버플로우가 발생
		System.out.println("Hello");
		print();
	}	//메인 실행 코드		print();

	
/*	기능 : 정수 num이 주어지면 주어진 정수 num!을 알려주는 메서드
	매개변수 : int num
	리턴 타입 : num! => int
	메서드명 : factorial
*/
	public static int factorial(int num){
		if(num == 1 || num == 0)
			return 1;
		if(num < 0)
			return -1;		
		return factorial(num-1)*num;
	}
	//메인 실행 코드	 System.out.println(factorial(5));
}
