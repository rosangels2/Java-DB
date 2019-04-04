
package day7;

public class class_mathod1 {

	public static void main(String[] args) {
	
	//	printMulti(2,6);
		
	//	printDan(5);

	//	printAll(2,5);
		
	//	rePlay('ㅋ', 200);
		


	}

	//구구단 전체를 메서드를 이용하여 출력하도록 작성하시오
/*	기능 : 구구단 전체를 출력하는 메서드
	매개변수 : 두 정수 => int num1, int num2
	리턴타입 : 정수 => void
	메서드명 : multi
*/	
	public static void multi(){
		int num1, num2;
		for(num1=2; num1<=9; num1++)//
			for(num2=1; num2<=9; num2++){
				System.out.println(num1+" x "+num2+ " = "+num1*num2);
			}
	}	


	
/*	기능 : 두 정수가 주어지면 두 정수의 곱을 출력하고 그 결과를 알려주는 메서드
	매개변수 : 두 정수 => int num1, int num2
	리턴타입 : 곱한 결과 int
	메서드명 : printMulti
*/		
	
	
	public static int printMulti(int num1, int num2){
		System.out.println(num1+" x "+num2+ " = "+num1*num2);
		return num1*num2;
	}
	
	
	
	
/*	기능 : 단이 주어지면 해당하는 단을 출력하는 메서드
	매개변수 : 단 => int num1, int num2
	리턴타입 : 없다 => void (콘솔에 출력하는 메서드이기 때문에 값을 확인할 필요가 없어서 return이 불필요)
	메서드명 : printDan
*/	
		
	public static void printDan(int num){
		for(int i = 1; i<=9; i++){
			printMulti(num,i);
		}
	}
	
/*	기능 : start단에서 end단까지 출력하는 메서드
 	매개변수 : int start, int end
 	리턴타입 : 없다 => void
 	메서드명 : printAll 
 */
	public static void printAll(int start, int end){
		if(start < 0) return;	 // return 타입이 void일 때 return;을 쓰면 해당 조건일 떄 강제 종료		
		for(int i=start; i<=end; i++){
			printDan(i);
		}
	}
	
	
	
	
/*	메서드를 만들 때 
	메서드 안에서 변수를 초기화하는 경우 지역변수로 선언하고
	누군가 알려준 정보를 그대로 활용하면 매개변수로 선언한다
*/	
	
	
	
/*	문제) ********** 가 출력되도록 메서드를 만드시오
	기능 : 입력한 문자가 입력한 횟수만큼 출력되는 메서드
	매개변수 : 문자, 횟수 => char op, int num 
	리턴타입 : 없다 => void
	메서드명 : rePlay
*/	
	//매개변수를 사용함으롰써 값이 정해지지 않아 재사용성이 높아짐
	public static void rePlay(char op, int num){
		for(int i=1; i<=num; i++){
			System.out.print(op);
		}
	}
	
	
	
	/*	기능 : 배열이 주어지면 배열의 모든 원소값을 콘솔에 출력하는 메서드
	매개변수 : 배열 => int []arr
	리턴타입 : 필요없음 => void
	메서드명 : printArr
*/	
	public static void printArr(int []arr){
		System.out.print("[ ");
		for(int tmp:arr){
			System.out.print(tmp + " ");
		}
		System.out.print(" ]\n"); //\n = 엔터와 같은 역할
	}
	
	
	
	
	
	
	
	
}
