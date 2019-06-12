package day15_class_shape;

public class example {

	public static void main(String[] args) {
		
		Rect1 r = new Rect1();
		r.width = 10;
		r.height = 7;
		r.centerX = 0;
		r.centerY = 0;
		r.print();
		System.out.println();
		r.resize(5, 3);
		r.print();
		System.out.println();
		r.move(3, 8);
		r.print();
		
	}

}

class Rect1{
	public int width;
	public int height;
	public int centerX;
	public int centerY;
	
	public void print(){
		System.out.println("중심점 : ("+centerX+","+centerY+")");
		System.out.println("가로 : "+width);
		System.out.println("세로 : "+height);
		System.out.println("넓이 : "+width*height);
	}
	
	public void move(int x, int y){
		this.centerX = x;
		this.centerY = y;
	}
	
	public void resize(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	
	
	
	
	
	
	
}