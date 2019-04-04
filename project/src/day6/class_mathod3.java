package day6;

public class class_mathod3 {

	public static void main(String[] args) {

		int num1 = 3, num2 = 7;
		if(isCoPrime(num1,num2)){
			System.out.println("두 수는 서로소");
		}else{
			System.out.println("두 수는 서로소가 아님");
		}
		
	}
	
	//최대공약수를 구하는 메서드
	public static int gcd(int num1, int num2){
		int gcdNum = 1;
		for(int i=1; i<=num1; i++){
			if(num1%i==0 && num2%i==0){
				gcdNum = i;
			}
		}
		return gcdNum;
	}
	
/*	기능 : 두 정수가 주어지면 두 수가 서로소일 때 참으로, 서로소가 아닐 때 거짓으로 출력하는 메서드
 	매개변수 : 두 정수 => 정수 => int
 	리턴타입 : 참 또는 거짓 => boolean
 	메서드명 : coPrime
  
 */
	
	//방법1) 최대공약수를 구하는 gcd 메서드가 없을 때
/*	public static boolean isCoPrime(int num1, int num2){
		int gcdNum = 1;
		for(int i=1; i<=num1; i++){
			if(num1%i==0 && num2%i==0){
				gcdNum = i;
			}
		}	if(gcdNum == 1){
				return true;
			}else{
				return false;
			}
				
	}
*/	
	//방법2)최대공약수를 구하는 gcd 메서드가 있을 때
	public static boolean isCoPrime(int num1, int num2){
		if(gcd(num1, num2) == 1){
			return true;
		}else{
			return false;
		}
	}
		
}
