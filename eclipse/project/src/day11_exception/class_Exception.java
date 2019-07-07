package day11_exception;

public class class_Exception {

	public static void main(String[] args) {
		
		int num1=1, num2=0;
		int res;
		int arr[] = new int[10];
		try{
			res = num1/num2;
			arr[10] = 0;					//예외상황이 발생할 수 있는 코드
			System.out.println((res));
		}catch(ArithmeticException e){		//try문에서 ArithmeticException이 발생하면 아래 catch문을 실행하고 다음 코드를 실행해라
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("연산 예외 발생 !");;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열 예외 발생 !");
		}catch(Exception e){			//모든 예외는 Exception을 상속받기 때문에 마지막에 Exception으로 예외 처리를 한다(else와 유사)
			System.out.println("예외 발생 !");
		}
		System.out.println("프로그램 종료 !");
	}
	
	
}