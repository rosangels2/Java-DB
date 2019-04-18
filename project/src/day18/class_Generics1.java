package day18;

public class class_Generics1 {

	public static void main(String[] args) {
		
		FruitBox<Fruit> fBox = new FruitBox<>();		//Fruit가 인터페이스 Eat을 구현하지 않기 때문에 에러가 발생 -> Fruit클래스에 Eat 인터페이스를 구현
		//FruitBox<String> fBox2 = new FruitBox<>();	//과일 클래스가 아닌 문자열 클래스를 대입하려 하기 때문에 에러가 발생
		
	}

}

					
class Fruit implements Eat{				//FruitBox에 &로 Eat을 구현한 뒤 Fruit에 Eat인터페이스를 구현하지 않으면 위에서 Fruit을 생성할 때 에러가 난다
	
}
class Apple extends Fruit{				//과일 클래스를 상속받은 사과 클래스
	
}
class FruitBox<T extends Fruit & Eat>{	//과일 클래스를 상속받은 클래스들만 대입할 수 있게 extends를 사용해 제한한 지네릭 클래스
										//위에서 과일 클래스와 interfave Eat을 함께 구현해야 한다면 class FruitBox<T extends Fruit & Eat>처럼 &를 사용해 연결한다
}

interface Eat{							
	
}