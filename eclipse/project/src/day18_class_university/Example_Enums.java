package day18_class_university;

public class Example_Enums {

	public static void main(String[] args) {
		
		for(Kind k : Kind.values()){								//향상된 포문으로 순서값이 저장된 배열형 객체 value를 순서대로 출력한다
			System.out.println(k.name() + " = " + k.getValue());
		}
		Number num = Number.ONE;
		num = Number.FIVE;
		
		Human h = new Human();
		h.gender = Gender1.MALE;						//열거형을 사용하면 멤버변수로 추가된 제한된 값만 사용할 수 있어서 멤버변수를 제한할 때 편리하다
		
		
		
		
	}

}

enum Kind{
	CLOVER(1), HEART(2), DIAMOND(3), SPADE(4);		//상수값이 불연속적일 땐 열거형 상수에 괄호로 순서를 추가해서 저장하고 지정된 값을 저장할 수 있는 변수와 생성자를 추가한다
	private final int value;						
	Kind(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
}
enum Number{
	ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K	//값이 제한적일 땐 조건문이 아닌 열거형으로 제한하는 게 편하다
}
enum Gender1{
	MALE, FEMALE
}

class Human{
	Gender1 gender;
}
















