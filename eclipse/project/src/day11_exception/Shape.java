package day11_exception;

import day10_class.Point;

public class Shape implements draw {

	private Point center;
	private double width;	//멤버변수 = 파란색 정자, 클래스 멤버변수 = 파랑색 기울어진 글자체
	private double height;
	
	public static int count = 0;	//Shape 클래스를 통해(상속 포함) 만들어진 객체의 개수를 저장하는 변수
									//클래스 멤버변수는 자식클래스인 Circle에서도 적용 가능
	
	public static void printCount(){	//클래스 멤버변수 count의 값을 출력하는 클래스 멤버메서드
		System.out.println("만들어진 도형의 총 개수 : "+count);		
	}
	
	
	public Point getCenter() { //private를 상속받았기 때문에 값을 변경하기 위해 getter, setter를 생성한다
		return center;
	}

	public void setCenter(Point center) {	
		this.center.setX(center.getX());	//객체는 참조변수(주소를 저장)이기 때문에 객체에 =를 조심히 써야 한다 - 원본이 바뀔 수 있기 때문에
		this.center.setY(center.getY());
	}
	
	public void setCenter(int x, int y) {
		this.center.setX(x);
		this.center.setY(y);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
								//생성자의 특징 : 리턴타입이 없고 클래스명과 메서드명이 같다
	public Shape(){				//에러 : java.lang.NullPointerException 객체를 생성하지 않고 호출을 해서 null값이
		center = new Point();	//기본생성자 생성
		count++;
	}
	
	public Shape(Shape s){	//복사생성자
		this.width = s.width;
		this.height = s.height;
		this.center = new Point(s.center);
		count++;
	}
	
	public Shape(int x, int y, int width, int height){
		this.center = new Point(x,y);
		resize(width, height);
		count++;
	}
	
	@Override 
	public boolean equals(Object obj){
		if(obj instanceof Shape){
			Shape s = (Shape)obj;
			if(s.width != this.width)	return false;
			if(s.height != this.height)	return false;
			if(s.getCenter().getX() != this.getCenter().getY()) return false;
			return true;
		}
		return false;
	}
	

	@Override
	public String toString() { //객체에 대한 정보를 문자열(String)로 제공하는 코드
		return "Shape [center=" + center + ", width=" + width + ", height=" + height + "]";
	}


	@Override
	public void print() {
		System.out.println("- - - - - - - - - - - -");
		System.out.print("중심점 : ");
		center.print();
		System.out.println("가로 : "+width);
		System.out.println("세로 : "+height);
		System.out.println("- - - - - - - - - - - -");
	}

	@Override
	public void resize(double width, double height) {
		this.width = width;
		this.height = height;

	}

	@Override
	public void move(int x, int y) {
		this.setCenter(x, y);

		
		
	}

}
