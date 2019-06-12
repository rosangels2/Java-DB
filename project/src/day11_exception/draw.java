package day11;

public interface draw {

	void print(); //도형 그리기 기능 대신 콘솔에 정보를 출력하는 기능으로 대체
	
	void resize(double width, double height); //도형의 크기를 재설정하는 기능
	
	void move(int x, int y); //도형을 이동시키는 기능
	
}
