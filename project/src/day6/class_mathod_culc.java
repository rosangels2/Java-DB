package day6;

public class class_mathod_culc {

	public static void main(String[] args) {
		
/*		System.out.println(caLc(1,2,'/')); //방법1
 
		double res = caLc(1,2,'/');		   //방법2
		System.out.println(res);
*/		
		
		System.out.println(calc(1,5,'+'));
		System.out.println(calc(1,5,'-'));
		System.out.println(calc(1,5,'*'));
		System.out.println(calc(1,5,'/'));
		System.out.println(calc(1,5,'%'));
		
	}

/*	문제)두 정수와 산술연산자가 주어졌을 때 연산 결과를 알려주는 메서드를 만드시오
	 - 기능 : 두 정수와 산술연산자가 주어졌을 때 연산 결과를 알려주는 메서드
	 - 매개변수 : 두 정수와 산술연산자 => int num1, int num2, char op
	 - 리턴타입 : 계산 결과 => double (1/2=0.5)
	 - 메서드명 : calc
*/
	
	public static double calc(int num1, int num2, char op){
		double res = 0.0;
		switch(op){
		case '+':			res = num1+num2;			break;
		case '-':			res = num1-num2;			break;
		case '*':			res = num1*num2;			break;
		case '/':			res = (double)num1/num2;	break;
		case '%':			res = num1%num2;			break;
	//	default: res=0.0;  위에서 초기화를 하지 않았을 때 입력
		}
		return res;	
		
	}

	

	
	
	
	
	
}
