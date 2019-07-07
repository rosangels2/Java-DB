package day10;

public class class_abstract {

	public static void main(String[] args) {
		
		

	}

}
abstract class Shape2{ // 같은 패키지 내에 동일한 클래스명이 있을 시 에러 발생
	int x, y;
	int w, h;
	abstract void print();
/*	추상 메서드는 주로 자식 클래스에서 오버라이딩이 빈번하게 발생하는 경우에 추상메서드로 선언 후에 자식 클래스에서 구현한다
	추상 메서드를 사용하려면 추상 클래스를 상속받는 자식 클래스를 만들고 만들어진 자식 클래스에서 메서드 오버라이딩을 통해 구현한 후 사용한다
	추상클래스를 상속 받으면 추상 메서드를 반드시 오버라이딩을 통해 구현해야 한다
*/
	
}
class Rect2 extends Shape2{ 

	@Override	//추상 클래스를 상속으면 반드시 오버라이딩을 해야 한다
	void print() {
		// TODO Auto-generated method stub
		
	}
	
}