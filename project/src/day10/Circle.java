package day10;

public class Circle extends Shape {
	
	//멤버변수 - 원의 구성 : 반지름, 중심점
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override //@Override를 선언하면 무조건 부모클래스를 오버라이딩하는 메서드가 입력돼야 한다
	public void print(){
		System.out.print("중심점 : ");
		center.print();
		System.out.println("반지름 : "+radius);
	}	
	
	public Circle(){ // 자식클래스의 기본 생성자를만들면 //super();가 생략되어 들어간다 (부모클래스의 기본생성자)
		
	}
	
	public Circle(int x, int y, int r){
		super(x,y,r,r); //생성자 호출은 무조건 첫줄에 입력
		radius = r;
	}
	
	

}
