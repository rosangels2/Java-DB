package practice1;

import java.util.*;

public class exam1 {

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
		for(int i=1; i<=num1; i++){
			if(num1 % i == 0){
				cnt++;
			}
		}
		if(cnt == 2){
			System.out.println("문제3) "+num1+"은 소수입니다.");
		}else{
			System.out.println("문제3) "+num1+"은 소수가 아닙니다.");
		}
		System.out.println();
		
	//4. 산술 연산 메서드를 생성하여 테스트하는 코드
		Scanner scan = new Scanner(System.in);
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int res = 0;
		char op = scan.next().charAt(0);
		System.out.print("문제4) ");
		switch(op){
		case '+' :	res = num2 + num3;
					System.out.println(num2+" + "+num3+" = "+res);
					return;
		case '-' :	res = num2 - num3; 
					System.out.println(num2+" - "+num3+" = "+res);
					return;
		case '/' :	res = num2 / num3;
					System.out.println(num2+" / "+num3+" = "+res);
					return;
		case '*' :	res = num2 * num3; 
					System.out.println(num2+" * "+num3+" = "+res);
					return;
		case '%' :	res = num2 % num3;
					System.out.println(num2+" % "+num3+" = "+res);
					return;
		default : System.out.println("잘못된 연산자입니다.");
		}
		
	}
}
