package day9;

public class class_Point {

	public static void main(String[] args) {
		
		//2차원 좌표의 점을 의미하는 Point 클래스
		Point p = new Point(1,1);
		p.print();
		Point p1 = new Point();
		p1.print();
		Point p2 = new Point(p);
		p2.print();
		p2.move(3, 4);
		p2.print();
		System.out.println(p2.distance(0, 0)); // (3,4)와 (0,0)의 거리 차이는 (5,0)이다
	}

}
