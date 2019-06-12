package day6_method;

public class class_method_cnt {

	public static void main(String[] args) {

		//소수인지 아닌지 판별하는 코드
/*		int num;
		int cnt = 0;
		for(int i=1; i<=num; i++){
			if(num%i==0){
				cnt++;
			}
		}
		if(cnt==2){
			System.out.println("소수");
		}else{
			System.out.println("합성수");
		}
*/
		int num= 9;
		if(isPrime(num)){
			System.out.println("소수");
		}else{
			System.out.println("합성수");
		}
		
		
	}
	
/*	기능 : 주어진 정수가 소수이면 참을, 합성수면 거짓을 알려주는 메서드
	매개변수(입력); //입력한 정수 => int num
	리턴타입(출력); //참 또는 거짓 => boolean
	메서드명 : isPrime
*/	
	public static boolean isPrime(int num){
		int cnt = 0;
		for(int i=1; i<=num; i++){
			if(num%i==0){
				cnt++;
			}
		}
		if(cnt==2){
			return true;
		}else{
			return false;
			}
	/*	return false; // else일 경우는 절대 실행되지 않기 때문에 에러가 뜨고
					  //else if(cnt!=2)로 바꾸면 의미는 같지만 java의 문법적으로 실행될 수도 있다고 판단해 에러는 사라짐	
*/	
	}	

}
