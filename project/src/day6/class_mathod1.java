package day6;

public class class_mathod1 {

	public static void main(String[] args) {
		
/*		메서드의 구현 위치는 클래스 안쪽
		다른 메서드 안에서 구현딜 수 없다
		메서드는 다른 메서드 안에서 호출되어야 한다
		메서드를 테스트하기 위해서는 main메서드에서 호출해야 한다
		
		기능 : 두 정수가 지어지면 두 정수의 최대 공약수를 알려주는 메서드
		리턴타입(출력); //최대공약수 => 정수 => int
		매개변수(입력); //두 정수 => int num1, int num2
		메서드명 : gcd
		
		최소공배수를 구하는 코드 
		num1*num2/gcdNum
*/
		
		int num1 = 7, num2 = 8;
		int gcdNum = 1;
		gcdNum = gcd(num1, num2);
		System.out.println(num1+"과 "+num2+"의 최대 공약수 : "+gcdNum);	
		System.out.println(num1+"과 "+num2+"의 최소 공배수 : "+lcm(num1,num2));
		//최대 공약수와 최소 공배수를 계산하는 메서드 구현
		
	}
	//두 수의 최대 공약수를 구하는 메서드
	public static int gcd(int num1, int num2){
		int gcdNum = 1;
		for(int i=1; i<=num1; i++){
			if(num1%i==0 && num2%i==0){
				gcdNum = i;
			}
		}
		return gcdNum;
	}
	
/*	기능 : 두 수의 최소 공배수를 구하는 메소드
		 최소 공배수는 두 수의 곱을 최대 공약수로 나눈 값이다
	매개변수 : 두 정수 => int num1, int num2
	리턴타입 : 최소 공배수 => 정수 => int
	메서드명 : lcm
*/	
	//최소 공배수를 구하는 메서드
	public static int lcm(int num1, int num2){
		return num1*num2/gcd(num1,num2);
	}	//다른 메서드의 변수명과 겹쳐도 상관없음
	
	
}
