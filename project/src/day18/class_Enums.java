package day18;


public class class_Enums {

	public static void main(String[] args) {
		
		Card c = new Card();
		System.out.println(c.kind);			//Card클래스에서 열거형으로 
		c.kind = Card.Kind.CLOVER;			//Kind의 값을 수정하기 위해선 Card클래스를 import하거나 불러올 클래스명.을 앞에 붙인다
		//c.kind = 0;						//kind의 값은 열거형에서 정의한 상수들만 사용 가능하기 때문에 에러가 발생
		System.out.println(c.kind.ordinal());
		System.out.println(c.kind.name());
		

	}

}

class Card{												
	public enum Kind {									//열거형의 접근 제한자는 외부에서 사용할 수 있게 public으로 사용하는 게 좋다
		CLOVER, HEART, DIAMOND, SPADE					//열거형 자료형인 Kind를 생성하고 상수 CLOVER, HEART, DIAMOND, SPADE의 값만 사용할 수 있게 정의한다
	}
	Kind kind = Kind.SPADE;
}