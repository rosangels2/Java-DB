package day8_method;

import java.util.Scanner;

public class class_method1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		printDanStartEnd(3,7);

	}

/*	기능 : 단(구구단)을 출력하는 기능
	매개변수 : 입력된 단 => 정수 => int num
	리턴타입 : 없다 => void
	메서드명 : printDan
*/	
		
	public static void printDan(int num){
		for(int i=1; i<=9; i++){
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}
/*		메인 실행 코드
		printDan(175);		*/
	
	
	
/*	기능 : start단에서 end단을 출력하는 기능
	매개변수 : 두 단 => 두 정수 => int start, int end
	리턴타입 : 없다 => void
	메서드명 : printDanStartEnd
*/	
	
	public static void printDanStartEnd(int start, int end){
			for(int i=start; i<=end; i++){
				printDan(i);				
			}
	}
	//메인 실행 코드 	printDanStartEnd(3,7);
	
	
	
/*	메소드에서 리턴값이 있을 때 구현 시 유의사항
	조건문을 통해 return하는 경우
	반복문을 통해 리턴할 경우 리턴되지 않을 경우를 항상 생각해야 한다
	조건문을 통해 return할 경우 조건문이 거짓인 경우를 고려해야 한다
	반복문 안에서 return할 경우 반복문 조건이 거짓이 되어 반복문이 실행되지 않을 경우를 고려해야 한다
*/	
	
	public static int test1(){
		int r = 0;
		for(int i=1; i<=9; i++){
			r += i;
			return r;
		}
		return r; //반복문이 무조건 실행돼서 return이 되는 경우라도 자바 컴파일러는 만약 반복문이 종료됐을 경우의 return값도 요구한다
	}
	
	public static int test2(int num){
		if(num>=0) return 1;
		else return -1;
		//else if(num<0) return -1; else if를 쓰면 자바 컴파일러는 만약 else일 경우의 값도 요구하기 때문에 else를 필수 사용
		
	}
	
	
}	