package practice1;

public class variable {
	
	//멤버변수는 클래스가 가지고 있는 변수로 static 여부에 따라 일반 멤버변수(객체)와 클래스 멤버변수로 구분
	int num1;	//객체 멤버변수로서 객체가 생성되어야 변수로 사용할 수 있다(객체가 유효한 범위 내에서 사용 가능)
	static int num2;	//클래스 멤버변수로 클래스를 통해 사용할 수 없다(객체 생성 후 사용도 가능)

	public static void main(String[] args) {
		
		//num1 = 10;	//에러 발생
		variable var = new variable(); //해당 클래스의 객체를 생성한 뒤 해당 객체를 통해서만 사용할 수 있다(객체의 유효범위 안에서)
		var.num1 = 10;	//같은 클래스 내에서는 클래스 멤버 메서드를 제외한 모든 메서드에서 사용 가능
		
		num2 = 10;
		
		
		//지역 변수 : 메서드 안에 선언되어 해당 메서드 안에서만 동작하는 변수로서 위치에 따라 사용 범위가 다르다
		//선언 위치부터 사용할 수 있으며 해당 위치가 포함된 {} 안에서만 사용 가능
		int num1; //변수 num1은 main 메서드 끝까지 사용 가능
		for(int i=0; i<1; i++){	//변수 i는 반복문 시작 시 변수 선언이 되어 반복문 안에서만 사용 가능
			int tmp;	//변수 tmp는 실행문 시작 시 변수 선언이 되어 실행문 종료 후 사용할 수 없다(실행문이 실행될 때마다 재생성)
			int num3 = 10;
			test(num3);	//매개변수로 num3을 넘겨받아 
			System.out.println(num3);
			
			Point p = new Point(); //참조변수(객체) : 일반 자료형으로 생성된 변수가 아닌 클래스를 이용하여 생성된 변수(주소를 저장)
			System.out.println(p);
			test1(p);	//매개변수 객체 p의 주소를 가져와 변경
			System.out.println(p);	//원본인 p의 값도 변경
			
			Point p1 = new Point();
			test2(p1);	//주소가 다른 익명 객체를 생성해서 값을 복사한 뒤 변경하기 때문에 원본은 바뀌지 않는다
			System.out.println(p1);
		}

	}

	public static void test(int num){
		num++;
	}
	public static void test1(Point p){
		p.move(1, 1);
	}
	public static void test2(Point p){
		p = new Point();
		p.move(1, 1);
	}
	
}
