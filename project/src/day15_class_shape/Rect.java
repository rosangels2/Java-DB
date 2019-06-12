package day15_class_shape;

import day10.Shape;

public class Rect extends Shape {

	//사각형의 구성 - 중심점, 가로, 세로, 넓이
	private int area;
	
	public Rect (int x, int y, int width, int height){
		super(x,y,width,height);
		area = width*height;
	}
	
	@Override
	public void print(){
		super.print();
		System.out.println("넓이 : "+area);
	}
	
	public void reSize(int width, int height){
		this.width = width;
		this.height = height;
		area = width*height;
	}
}


