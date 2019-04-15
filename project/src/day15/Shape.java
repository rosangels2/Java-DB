package day15;

public class Shape extends Point {

	//도형의 구성 - 중심점, 가로, 세로
	
	private Point center;
	private int width;
	private int height;
	
	
	
	public Point getCenter() {
		return center;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public Shape(){
		center = new Point();
		width = 0;
		height = 0;
	}
	
	public Shape(int x, int y, int width, int height){
		center = new Point(x,y);
		this.width = width;
		this.height = height;
		
	}
	
	public Shape(Shape s){
		center = new Point(s.center);
		this.width = s.width;
		this.height = s.height;
	}
	
	public void print(){
		System.out.print("중심점 : ");
		System.out.println(center);
		System.out.println("가로 : "+width);
		System.out.println("세로 : "+height);
	}
	
	
	
	
}
