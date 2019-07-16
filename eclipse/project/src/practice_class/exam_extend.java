package practice_class;

public class exam_extend {

	public static void main(String[] args) {

		Point3D p = new Point3D();
		p.print();
		p.move(1,1,1);
		p.print();
		
		
		
	}

}

class Point3D extends Point{
	//x, y는 Point 클래스에서 상속받아 안보이지만 존재하나 private이어서 직접 접근할 수 없다(getter/setter 사용)
	private int z;

	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	//매개변수가 다르기 때문에 메서드 오버로딩
	public void move(int x, int y, int z){
		super.move(x, y);
		this.z = z;
	}
	//매개변수와 이름이 같기 때문에 메서드 오버라이딩
	public void print(){
		System.out.println("("+getX()+","+getY()+","+z+")");	//x, y는 private이기 때문에 getter를 통해 접근
	}

	@Override
	public String toString() {
		return "("+getX()+","+getY()+","+z+")";
	}
	
	public Point3D(){
		//super();를 자동 호출한다(기본 생성자가 있을 경우)
		//z는 자료형의 기본값인 0으로 초기화되어 호출된다
	}
	public Point3D(int x, int y, int z){
		move(x,y,z);
	}
	public Point3D(Point3D p){
		move(p.getX(),p.getY(),p.z);
	}
	
}