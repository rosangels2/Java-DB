package practice1;

public class exam_interface {

	public static void main(String[] args) {
		
		

	}

interface Draw{	//인터페이스는 메서드의 조건부만을 명시해 놓은 기능 명세서
				//장점 - 기능을 일목요연하게 볼 수 있고 기능의 통일성을 갖출 수 있다
	public void resize(int width, int height);
	public void move(int x, int y);
}
class Rect implements Draw{

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}


}
