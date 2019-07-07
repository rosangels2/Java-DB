package day10_class;

public class Triangle extends Shape {

	double area; //가로*세로의 값이기 때문에 따로 초기화하지 않아도 0이므로 초기화하지 않는다
	double getArea(){
		return area;
	}
	
	public Triangle(){
		
	}
	
	public Triangle(int x, int y, int w, int h){
		super(x,y,w,h);
		area = w * h / 2.0;
	}
	@Override
	public void print(){
		System.out.println("삼각형");
		super.print();
		System.out.println("넓이 : "+area);
	}
	


}


