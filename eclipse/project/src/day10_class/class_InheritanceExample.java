package day10_class;

public class class_InheritanceExample {

	public static void main(String[] args) {
		
/*		KiaCar kc = new KiaCar();
		kc.printCar();*/
		
/*	Circle c = new Circle(3,4,6);
		c.print();
		System.out.println();
		Rect r = new Rect(5,4,3,8);
		r.print();
		System.out.println();
		r.resize(4, 7);
		r.print();
		System.out.println(); 
*/
		
		Shape s1 = new Rect(); //다형성 - 한 타입의 참조변수로 여러 객체를 참조할 수 있다(특정 조건을 만족할 때)
		Shape s2 = new Circle(); //Rect r = new Shape(); - 큰 것에서 작은 것으로 대입은 가능하지만 작은 것에서 큰 것으로는 대입 불가능
		Shape s3 = new Shape();
		if(s1 instanceof Rect){
			Rect r1 = (Rect)s1; // s1을 Rect로 형변환해서 Rect의 객체 r1을 생성
			r1.print();
			//System.out.println("객체 s1은 Rect로 형변환이 가능");
		}
		if(s2 instanceof Rect){ // 왼쪽>=오른쪽인 경우에만 형변환이 가능하여 실행문이 실행됨
			System.out.println("객체 s2은 Rect로 형변환이 가능");
		}
		if(s3 instanceof Rect){
			System.out.println("객체 s3은 Rect로 형변환이 가능"); //불가능하기 떄문에 실행문이 실행되지 않는다
		}
		
		
	}
	

}
