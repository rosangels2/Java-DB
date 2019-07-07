package day10_class;

public class class_Triangle {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle(3,4,5,6);
		t1.print();
		System.out.println();
		Triangle t2 = new Triangle(); //값을 입력하지 않아 초기화돼 0으로 출력됨
		t2.print();
/*		Triangle t3 = null; 
		t3.print();		*/
		
/*		에러명 : java.lang.NullPointerException
 		참조변수가 null값을 가지는데 해당 변수를 사용했을 경우에 생기는 에러
		일반적으로 클래스의 객체를 선언하지 않고 new를 통해 생성하지 않은 상태에서 해당 객체의 메서드를 호출하는 경우 발생
		해결 방법 : 객체를 생성하고 호출하면 된다
*/
		
	}				
	
	
}
