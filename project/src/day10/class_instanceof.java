package day10;

public class class_instanceof {

	public static void main(String[] args) {
		
		Tv t = new Tv();
		t.price = 100;
		t.bonusPoint = 2;
		Computer c = new Computer();
		c.price = 50;
		c.bonusPoint = 1;
		Audio a = new Audio();
		a.price = 200;
		a.bonusPoint = 5;
		Buyer buyer = new Buyer();
		buyer.buy(c);
		System.out.println("컴퓨터 구매 후 남은 금액 : "+buyer.money);
		System.out.println("보너스 포인트 : "+buyer.bonusPoint);
		buyer.buy(a);
		System.out.println("오디오 구매 후 남은 금액 : "+buyer.money);
		System.out.println("보너스 포인트 : "+buyer.bonusPoint);
		buyer.buy(t);
		System.out.println("Tv 구매 후 남은 금액 : "+buyer.money);
		System.out.println("보너스 포인트 : "+buyer.bonusPoint);
	}

}

class Product{
	int price; //접근제한자 default가 생략돼 있으므로 같은 패키지 내에서 사용 가능
	int bonusPoint;
}
class Tv extends Product{	//자식클래스1
	
}
class Computer extends Product{		//자식클래스2
	
}
class Audio extends Product{	//자식클래스3
	
}

//구매자 클래스
class Buyer{
	int money = 1000;
	int bonusPoint = 0;
/*	원래는 매개변수로 Tv t 또는 Computer c 또는 Audio a가 와서 메서드 오버로딩으로 구현해야 하지만
	그럴 경우 Product를 상속받는 제품들이 많아져 추가해야 할 메서드가 늘어난다
	그래서 각 클래스의 객체가 아닌 해당 클래스들의 부모인 Product의 객체 p를 매개변수로 처리해서
	Product 클래스를 상속받은 클래스들에 일괄 적용한다
*/
	void buy(Product p){ //부모 클래스가 같을 경우만 부모 클래스의 객체 사용 가능
		money -= p.price; //부모 클래스의 매개변수를 사용해서 자식 클래스에도 같은 이름의 매개변수가 있을 때 일괄 사용 가능
		bonusPoint += p.bonusPoint;
	}
}