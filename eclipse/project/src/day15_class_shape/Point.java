package day15_class_shape;

public class Point {

	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public Point(){
		move(0,0);
	}
	
	public Point(int x, int y){
		move(x,y);
	}
	
	public Point(Point s){
		move(s);
	}
	
	public void print(){
		System.out.println("("+x+","+y+")");
	}
	
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void move(Point s){
		move(s.x,s.y);
	}
	
	
}
