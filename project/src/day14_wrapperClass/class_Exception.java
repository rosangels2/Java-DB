package day14_wrapperClass;

public class class_Exception {

	public static void main(String[] args) {
		
		System.out.println(1.0 / 0.0);
		
		try {
			System.out.println(calc(1.0,0.0,'?'));
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		
		//계속 실행시 순서가 바뀐다 -> 이유 : Thread(p.722)
		
		//try catch는 메서드 내에서 예외가 발생했을 때 메서드 내에서 예외를 처리할 때 사용
		//throw는 메서드 내에서 예외가 발생했을 때 메서드 밖으로 보내서 처리할 때 사용
		
		int num = 0;
		try{			
			num = 1/0;			
		}catch(ArithmeticException e){
			System.out.println("계산 관련 예외가 발생했습니다.");
			e.printStackTrace();
		}
		catch(Exception e){ //object 클래스인 Exception 클래스의 객체 e를 만들어서 실행문을 실행하고 나서 프로그램의 실행을 중단하지 않고 진행한다 
			System.out.println("예외가 발생했습니다.");	//Exception은 호출하지 않아도 되지만 호출할 거라면 가장 마지막에 넣는다 -> 먼저 실행되면 다음 실행문에 도달하지 못한다
			e.printStackTrace();	
		}
		System.out.println("계산 결과 : " + num);
	}

	public static double calc(double num1, double num2, char op) 
			throws Exception, ArithmeticException {
		double res = 0.0;
		if((op == '/' || op == '%') && num2 == 0.0) 
			throw new ArithmeticException("0으로 나눌 수 없습니다."); //throw를 하면 return값을 저장하지 않고 예외처리를 하는 catch로 순서가 넘어간다
		switch(op){												//-> throw 다음의 실행문은 실행되지 않는다
		case '+' : res = num1 + num2; break;
		case '-' : res = num1 - num2; break;
		case '*' : res = num1 * num2; break;
		case '/' : res = num1 / num2; break;
		case '%' : res = num1 % num2; break;
		default : 
			throw new Exception("잘못된 연산자입니다."); //그 외의 연산자들이 입력됐을 때의 예외 처리
		}
		return res;
	}
	
	
	
}
