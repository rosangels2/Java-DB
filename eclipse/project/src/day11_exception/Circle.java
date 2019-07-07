package day11_exception;

import day10.Point;

public class Circle extends Shape {
	
	public double getRadius(){
		return getWidth()/2;
	}
	public double getArea(){
		return getRadius()*getRadius()*Math.PI; //Math.Pi = 원의 넓이를 구하는 메서드
	}
	@Override
	public void print(){
		System.out.println("- - - - - - - - - - - -");
		System.out.print("중심점 : ");
		getCenter().print();
		System.out.println("반지름 : "+getRadius());
		System.out.println("넓이 : "+getArea());
		System.out.println("- - - - - - - - - - - -");
	}
	void resize(double r){
		setWidth(r*2);
		setHeight(r*2);
	}
	public Circle(){
		//부모의 생성자 호출 super가 생략돼 있다
	}
	public Circle(int x, int y, int r){
		super(x,y,r*2,r*2); 
	}
	
}
