package practice_class;

import java.util.*;

public class exam_point {

	public static void main(String[] args) {
		
		//6. 5에서 생성한 Point클래스를 이용하여 점의 이동 경로를 저장하는 코드 작성
		
				ArrayList<Point> list = new ArrayList<Point>();
				Point p = new Point();
				list.add(new Point(p));
				p.print();
				System.out.println();
			
				p.move(1, 3);
				list.add(new Point(p));
				
				p.move(4, 2);
				list.add(new Point(p));
				p.move(5, 2);
				list.add(new Point(p));
				p.move(4, 1);
				list.add(new Point(p));
				p.move(10, 22);
				list.add(new Point(p));
				p.move(12, 1);
				list.add(new Point(p));
				p.move(100, 11);
				list.add(new Point(p));
				p.move(1, 2);
				list.add(new Point(p));
				p.move(1, 0);
				list.add(new Point(p));
				p.move(0, 7);
				list.add(new Point(p));
				p.print();System.out.println();

				System.out.println("println 사용");
				System.out.println(list);
				System.out.println();
				
				System.out.println("iterator 사용");
				Iterator it = list.iterator();
				while(it.hasNext()){
					System.out.println(it.next());
				}

	}

}

class Point {	//접근 제한자를 입력하지 않을 경우 default로 적용 : 같은 패키지 안에서 사용 가능
	
/*	5. 2차원 좌표의 점을 저장하는 Point 클래스 및 메서드 생성
	-멤버변수 : x, y
	-멤버 함수
	-생성자
	-getter, setter
	-좌표 이동
	-좌표 출력
*/
	
	  
	private int x;
	private int y;
	
	public int getX() {	//getter는 매개변수가 없다
		return x;
	}
	public int getY() {
		return y;
	}
	void setX(int x) {	//setter는 리턴타입이 없다(void)
		this.x = x;
	}
	void setY(int y) {	//클래스에 접근 제한자가 없을 경우 접근 제한자를 적지 않아도 된다(default로 적용 : 같은 패키지 안에서 사용 가능)
		this.y = y;
	}
	
	//멤버변수 초기화 순서 각 자료형에 대한 기본값 -> 명시적 초기화 -> 초기화 블럭 -> 생성자
	
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
	

	void move(int x, int y){	//클래스에 접근 제한자가 없을 경우 접근 제한자를 적지 않아도 된다(default로 적용 : 같은 패키지 안에서 사용 가능)
		this.x = x;
		this.y = y;
	}
	void print(){
		System.out.println("현재 위치  - ("+x+","+y+")");
	}
	
	
	@Override
	public String toString() {
		return "현재 위치  - ("+x+","+y+")";
	}
	
}
