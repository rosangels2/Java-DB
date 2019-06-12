package day8;

public class class_mathod {

	public static void main(String[] args) {
		
	
		
		System.out.println(calc(1,5,'+'));
		System.out.println(calc(1,5,'-'));
		System.out.println(calc(1,5,'*'));
		System.out.println(calc(1,5,'/'));
		System.out.println(calc(1,5,'%'));
		
		
	}

	
/*	기능 : 두 정수의 합을 알려주는 메서드
	매개변수 : 두 정수 => int
	리턴타입 : 정수 => int
	메서드명 : add
*/	
	//방법1)
	public static int add(int num1, int num2){
		System.out.println(num1+num2);
		return num1+num2;
	}	
	
/*	메인 실행 코드 
	add(num1,num2)	
*/	
	
/*	방법2)
	public static int add(int num1, int num2){
		return num1+num2;
		
	메인 실행 코드
	int res = add(num1,num2)
	System.out.println(res);
	}
*/	
	
/*	기능 : 두 정수의 산술 연산 결과를 알려주는 메서드
	매개변수 : 두 정수, 산술 연산자 => int num1, int num2, char op
	리턴타입 : 연산 결과 => 실수(나누기의 결과값) => double
	메서드명 : calc
*/	
	public static double calc(int num1, int num2, char op){
		double res = 0.0;
		switch(op){
		case '+':
			res = num1+num2;
			break;
		case '*':
			res = num1*num2;
			break;
		case '/':
			res = num1/(double)num2;
			break;
		case '%':
			res = num1%num2;
			break;
		case '-':
			res = num1-num2;
			break;
		}
		return res;
	}
	
/*		메인 실행 코드
		System.out.println(calc(1,5,'+'));
		System.out.println(calc(1,5,'-'));
		System.out.println(calc(1,5,'*'));
		System.out.println(calc(1,5,'/'));
		System.out.println(calc(1,5,'%'));
*/	
	
	
	
	
}
