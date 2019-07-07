package day10_class;

//2차원에서 한 점을 나타내는 클래스
public class Point {

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public Point(){ //생성자
		move(0,0);
	}

	public Point(int x, int y){ //생성자 오버로딩
		move(x,y);
	}
	
	public Point(Point p){ //생성자 오버로딩
		move(p);
	}
	
	public void print(){
		System.out.println("("+x+" , "+y+")");
	}
	
	public void move(int x, int y){ 
		this.x = x; 
		this.y = y;
	}
	
	public void move(Point p){ //p라는 객체 선언
		move(p.x,p.y);
	}

	
	
	
	
	
}