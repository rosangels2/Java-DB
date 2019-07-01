package practice1;

import java.util.*;

public class point_exam {

	public static void main(String[] args) {
		
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

		System.out.println(list);
		
	}

}
