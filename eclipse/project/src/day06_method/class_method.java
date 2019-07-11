package day06_method;

import java.util.Scanner;

public class class_method {

	public static void main(String[] args) {
		System.out.println(sum(1,2));//printSum보다 sum이 재사용성이 높다(출력이 먼저 수행되지 않기 때문)
		printSum(1,2);
	}
/*	메서드 선언 방법 - 메인 메서드 밖에 생성
	출력 이름(입력){
		구현;
	}
	리턴타입 메서드명(매개변수){
		구현;
	}	
*/
	
	public static int sum(int num1, int num2){
		int res = num1+num2;
		return res;
	}
	
/*	기능 : 두 수의 합을 콘솔에 출력하는 기능
	입력 : 두 정수 => int num1, int num2
	출력 : 필요업다 => void
	이름 : 의미를 알 수 있게 작성 => printSum
*/
	public static void printSum(int num1, int num2){
		System.out.println(num1+num2);
	}
	
	
	
}








