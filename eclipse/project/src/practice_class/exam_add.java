package practice_class;

public class exam_add {

	public static void main(String[] args) {
		
/*		예제) 1부터 10까지 합을 구하는 A메서드를 생성하여 테스트
		1. 기능이 제대로 수행되는가?
		2. 재사용이 용이한가? ex)예를 들면 10부터 100까지 합을 구하는 데 A메서드를 그대로 이용할 수 있는가
		3. 매개변수의 이름이 구분 되는가
		4. A메서드를 이용하여 1부터 10까지 합에 *2를 한 결과를 A메서드 수정 없이 구할 수 있는가(메서드의 결과를 추가 계산할 수 있는가)
*/				
		int res	= add(10,1)*2;
		System.out.println(res);
		res = add(10,1)*2;
		System.out.println(res);
		System.out.println(add(100,10)*2);
		
		//static - 클래스와 객체 모두 이용 가능
		//static 메서드는 지역변수나 static 멤버 변수만 사용할 수 있다(일반 멤버 변수는 사용할 수 없다)
		// 이유 : static 메서드는 객체 생성 없이 사용 가능한데 일반 멤버 변수는 객체를 생성해야 할당되기 때문
		
	}

	public static int add(int start, int end){
		int res = 0;
		if(start>end){
			int tmp = start;
			start = end;
			end = tmp;
		}
		for(int i=start ; i<=end ; i++){
			res += i;
		}
		return res;
	}
	
	
	
}
