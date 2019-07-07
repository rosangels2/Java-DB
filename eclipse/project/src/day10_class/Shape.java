package day10_class;

public class Shape {

	//멤버변수 - 도형의 구성 : 중심점, 가로, 세로
	protected Point center;
	protected int width;
	protected int height;
	
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void print(){
		System.out.print("중심점 : ");
		center.print();
		System.out.println("가로 : "+width);
		System.out.println("세로 : "+height);
	}
	//생성자 생성 - 생성자에는 return타입이 붙지 않는다
	public Shape(){
		center = new Point(); //center = 참조변수
	}
	public Shape(int x, int y, int width, int height){
		center = new Point(x,y);
		this.width = width; this.height = height;
	}
	
	
}