package day11;

public class class_Exception1 {

	public static void main(String[] args) {
		
		try {
			System.out.println(calc(1,0,'/'));
		} catch (Exception e) {
			//Exception e = new Exception("0으로 나눌 수 없습니다)이 생략되지만 throw를 통해 캐치돼 실행된다
			e.printStackTrace();
		}finally{
			System.out.println("예외처리가 끝나면 무조건 실행되는 곳");
		}

	}
	public static double calc(int num1, int num2, char op)
	throws Exception{
		double res = 0.0;
		if(op=='/' && num2 == 0){	//if문을 통해 에러가 발생하는 경우를 입력
			throw new Exception("0으로 나눌 수 없습니다."); //throw를 통해 catch문에게 예외를 건네준다
/*			Exception e = new Exception("0으로 나눌 수 없습니다."); //throw new Exception과 같은 코드
			throw e;		*/
			//메서드에선 주로 if와 함께 throw가 사용된다
		}
		switch(op){
		case '+': res = num1 + num2; break;
		case '-': res = num1 - num2; break;
		case '*': res = num1 * num2; break;
		case '/': res = (double)num1 / num2; break;
		case '%': res = num1 % num2; break;
		}
		return res;
	}

	
}


	




