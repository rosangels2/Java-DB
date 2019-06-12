package day11_exception;

public class class_interface {

	public static void main(String[] args) {

		Shape s = new Shape(); //기본생성자 호출
		s.print();
		Circle.printCount();
		
		Circle c = new Circle(3,4,5);
		c.print();
		c.move(6, 7);
		c.print();
		c.resize(10);
		c.print();
		Circle.printCount();
		Shape s2 = c;				//자식클래스를 부모클래스로 변환할 때에는 자동 형변환이 가능하다
	//	Circle c2 = (Circle)s;		//부모클래스를 자식클래스로 변환할 때에는 명시적형변환을 해야 한다
	//	c2.print();					//조건부로 가능 - 조건을 만족하지 않으면  ClassCastException 에러 발생
									//클래스형변환 에러 - 변환은 했지만 사용할 수 없는 정보(getArea, getRadius)가 있어서 사용하지 못하는 경우
		
		Circle.printCount(); //s와 c2를 연결한 것뿐이기 때문에 생성된 개수는 그대로 
		
		Shape s3 = new Circle(); 	//부모클래스를 자식클래스를 통해 생성한 뒤 다시 자식클래스로 형변환이 가능하다(명시적 형변환)
		Circle.printCount();
		Circle c3 = (Circle)s3;		//부모클래스를 자식클래스로 생성할 시 자식클래스의 부분을 사용하지 못할 뿐 그대로 남아있어 다시 자식클래스로 형변환이 가능하다
		c3.print();					

		Circle.printCount();
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);

		Shape ss = new Shape();
		System.out.println(ss);
		
	}

	
}

/*class A extends String{  	//String은 Final 클래스이기 때문에 부모클래스가 될 수 없다
	
}*/
