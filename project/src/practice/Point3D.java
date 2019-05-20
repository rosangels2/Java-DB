package practice;

public class Point3D extends Point {

	private int z;

	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public Point3D(){
		
	}
	public Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	public Point3D(Point3D p){
		move(p.getX(), p.getY(), p.z);
	}
	
	
	public void print(){
		System.out.println("("+getX()+","+getY()+","+z+")");
	}
	
	public void move(int x, int y, int z){
		move(x, y);
		this.z = z;
	}
	

	
	
}
