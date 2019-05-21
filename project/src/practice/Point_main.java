package practice;

public class Point_main {

	public static void main(String[] args) {
		
		Point p = new Point();
		p.print();
		p.move(2, 4);
		p.print();
		p.move(17, 66);
		p.print();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - " );
		Point3D p1 = new Point3D(4,5,11);
		p1.print();
		p1.move(6, 8, 1);
		p1.print();
		p.move(4, 7);
		p.print();
		Point3D p2 = new Point3D(p1);
		p2.print();
		p2.move(4, 3, 111);
		Point p3 = new Point3D(p2);
		p3.print();
		p1.print();
		p1.move(4, 2);
		p1.print();
	}

}
