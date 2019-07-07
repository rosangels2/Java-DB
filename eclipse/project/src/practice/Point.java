package practice;

public class Point {
	
/*	4. Point 클래스 생성
	point 클래스는 2차원 좌표 평면의 점을 나타내는클래스
	1. 멤버 변수는 x, y가 있고 외부에서는 접근이 불가능하다
	2. 생성자 - 기본 생성자, 복사 생성자, 생성자 오버로딩 등 ...
	3. getter와 setter 생성
	4. 좌표 출력하는 메서드
	5. 좌표 이동하는 메서드	
*/	
	
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
	public void setY(int y) {
		this.y = y;
	}
	
	
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	
	public Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	public void print(){
		System.out.println("("+x+","+y+")");
	}
	
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	
	
}
