package practice1;

public class Point {
	/*	5. 2차원 좌표의 점을 저장하는 Point 클래스 및 메서드 생성
	 -멤버변수 : x, y
	 -멤버 함수
	 -생성자
	 -getter, setter
	 -좌표 이동
	 -좌표 출력 
	6. 5에서 생성한 Point클래스를 이용하여 점의 이동 경로를 저장하는 코드 작성
	  
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
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	
	
	
	
	@Override
	public String toString() {
		return "현재 위치 (x = " + x + ", y = " + y + ")";
	}
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void print(){
		System.out.println("현재 위치  - ("+x+","+y+")");
	}
	
	
	
}
