package day10;

public class Rect extends Shape {

	//멤버변수 - 사각형의 구성 : 가로, 세로, 넓이
	
	private int area;
	
	public Rect(){
	}
	
	public Rect(int x, int y, int z, int r){
		super(x,y,z,r);
		area = z*r;
	}
	@Override
	public void print(){
		super.print();
		System.out.println("넓이 : "+area);
	}
	
	public void resize(int width, int height){
		this.width = width;
		this.height = height;
		area = width*height;
	}
}
