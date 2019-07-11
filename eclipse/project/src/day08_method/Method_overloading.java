package day08_method;

public class Method_overloading {

	public static void main(String[] args) {
		

		
	}

/*	메서드 오버로딩의 조건
	1. 매개변수의 개수가 다르다
	2. 매개변수의 개수가 같지만 자료형이 다르다
*/	
	
/*	기능 : 두 정수의 합을 알려주는 기능
	매개변수 : 두 정수 => int num1, int num2 
	리턴타입 : int
	메서드명 : sum
*/	
	public static int sum(int num1, int num2){
		return num1+num2;
	} //메인 실행 코드 System.out.println(sum(1,1));
	
/*	기능 : 두 실수의 합을 알려주는 기능
	매개변수 : 두 실수 => double num1, double num2
	리턴타입 : double
	메서드명 : sum
*/	
	public static double sum(double num1, double num2){
		return num1+num2;
	}	//메인 실행 코드 System.out.println(sum(1.2,1.2));
		

/*	기능 : 세 정수의 합을 알려주는 기능
	매개변수 : int num1, int num2, int num3
	리턴타입 : int
	메서드명 sum
*/
	
	public static double sum(int num1, int num2, int num3){
		return num1+num2+num3;
	} //메인 실행 코드 System.out.println(sum(1,2,3));
	
	
	public static void multi(){
		int num1, num2;
		for(num1=2; num1<=9; num1++)//
			for(num2=1; num2<=9; num2++){
				System.out.println(num1+" x "+num2+ " = "+num1*num2);
			}
		}
	
	
	public static void printMultiTable(int num){
		for(int i=1; i<=9; i++){
			System.out.println(num + " x " + i + " = " + num*i);
		}
	} // 메인 실행 코드 printMultiTable(5);
	
	
	public static void printMultiTables(int start, int end){
		for(int i=start; i<=end; i++){
			printMultiTable(i);				
		}
	} //메인 실행 코드 printMultiTables(5, 8);
	
	
/*	기능 : 구구단 전체(2단~9단)이 출력되는 기능
	매개변수 : 
	리턴타입 : 없다 => void
	메서드명 : printMultiTables
*/	
	public static void printMultTables(){
		printMultiTables(2,9);		
	} //메인 실행 코드 	printMultTables();
	
	
	
	
	
}
