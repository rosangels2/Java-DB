package practice;

import java.util.*;

public class practice1 {

	public static void main(String[] args){
		
		//산술 연산자를 이용해 계산하는 예제를 메서드를 이용하여 작성
		//1. 메서드를 이용하지 않고 산술 연산자를 입력받아 계산하는 예제 작성

	/*	double x = 5, y = 3;
		double res = 0;
		char op = '/';
		switch(op){
		case '+' :	res = x+y;					break;
		case '-' :	res = x-y;					break;
		case '*' :	res = x*y;					break;
		case '/' :	res = x/(double)y;			break;
		case '%' :	res = x%(double)y;			break;
		default :								break;
		}
		System.out.println(res);
	*/	
		
		
		
		double num1 = 5, num2 = 3;
		char op = '/';
		double res = 0;
		
		try{
			res = calc(num1,num2,op);
			System.out.println(res);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
	
	
	//2. 메서드를 이용
	//3. 예외처리
/*	기능 : 두 수와 산술연산자를 입력받아 계산하는 기능
  	매개변수 : 두 수 -> int, 산술연산자 -> char op
  	리턴타입 : double
  	메서드명 : calc  
*/
	public static double calc(double x, double y, char op) 
		throws Exception, ArithmeticException{
			if((op == '/' || op == '%') && y == 0){
			throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
		double res = 0.0;
		switch(op){
		case '+' :	res = x+y;		break;
		case '-' :	res = x-y;		break;
		case '*' :	res = x*y;		break;
		case '/' :	res = x/y;		break;
		case '%' :	res = x%y;		break;
		default  :	
			throw new Exception("잘못된 연산자입니다.");
		}
		return res;
	}
		
}

