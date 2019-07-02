package practice1;

import java.util.*;

public class exam1_variable {

	public static void main(String[] args) {
	//1. 정수형 변수에 10을 저장한 후 콘솔에 출력하는 코드
		int num = 10;
		System.out.println("문제1) 변수 num : "+num);
		System.out.println();
		
	//2. 1부터 10까지의 합을 구하는 코드
		int sum = 0;
		for(int i=1; i<=10; i++){
			sum += i;
		}
		System.out.println("문제2) 1부터 10까지의 합 : " + sum);
		System.out.println();
		
	//3. 정수 7이 소수인지 아닌지 판별하는 코드
		int num1 = 7;
		int cnt = 0;
		int i;
		
		//방법1
		for(i=1; i<=num1; i++){
			if(num1 % i == 0){
				cnt++;
			}
		}
		if(cnt == 2){
			System.out.println("문제3) "+num1+"(는)은 소수입니다.");
		}else{
			System.out.println("문제3) "+num1+"(는)은 소수가 아닙니다.");
		}
		System.out.println();
		
		//방법2
		for(i=2; i<num; i++){
			if(num%i == 0){
				break;
			}
		}
		if(i != num){
			System.out.println("문제3) "+num+"(는)은 소수가 아님");
			
		}else{
			System.out.println("문제3) "+num+"(는)은 소수");
		}
		System.out.println();
		
		
		//4. 산술 연산 메서드를 생성하여 테스트하는 코드
		int num2 = 1, num3 = 3;
		char op = '/';
		double res = 0.0;
		try{
			res = cal(num1, num2, op);
			System.out.println("문제4) "+num1+op+num2+"="+res);	//빈 문자열("")을 num1이나 op 앞에 넣어주지 않으면 정수 num1과 문자 op의 아스키 코드값으로 인식하고 계산 
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
		//클래스 멤버 메서드 안에 있는 메서드들은 다른 클래스의 객체/클래스 메서드이거나 같은 클래스의 클래스 메서드이다
		//클래스 멤버 메서드에서는 본인 클래스의 객체를 생성할 수 있다(같은 클래스의 객체 메서드도 객체를 생성한 후에는 사용할 수 있다)
		//4. 산술 연산 메서드를 생성하여 테스트하는 코드
		public static double cal(int num1, int num2, char op)
			throws Exception{
			int res = 0;
			switch(op){
			case '+' :	res = num1 + num2;
						System.out.println(num1+" + "+num2+" = "+res);
						return res;
			case '-' :	res = num1 - num2; 
						System.out.println(num1+" - "+num2+" = "+res);
						return res;
			case '/' :	
				if(num2 ==0){
					throw new ArithmeticException("0으로 나눌 수 없습니다.");
				}
				res = num1 / num2;
				break;
			case '*' :	res = num1 * num2; 
						System.out.println(num1+" * "+num2+" = "+res);
						return res;
			case '%' :	
				if(num2 ==0){
					throw new ArithmeticException("0으로 나눌 수 없습니다.");
				}
				res = num1 % num2;
				break;
			default : 
				throw new Exception("잘못된 연산자입니다.");
			}
			return res;
		}	
		
		
}
