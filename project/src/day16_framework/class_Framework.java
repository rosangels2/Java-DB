package day16_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class class_Framework {

	public static void main(String[] args) {
		
/*		ArrayList<Integer> list = new ArrayList<Integer>();		//사용할 자료형의 객체를 입력해 주어야 한다(일반 자료형은 사용할 수 없다)
		list.add(10);											//wrapper클래스 사용(null값이 올 수 있다)
		list.add(5);											//list.add(new Integer(5)); 	익명 객체를 사용한 같은 기능의 코드
		list.add(1);	
		for(int i=0; i<list.size(); i++){						//size라는 메서드를 통해 길이를 계산
			System.out.println(list.get(i));					//입력된 순서대로 저장된 값을 출력
		}
*/
		
		
/*		ArrayList<Point> pList = new ArrayList<Point>();
		Point pt = new Point (5,5);
		pList.add(new Point(pt));		//익명 객체를 생성하고 pt를 복사해서 새 주소에 넣기 때문에 덮어쓰기가 되지 않는다
		pt.move(10, 10);				//익명 객체가 아니라 객체인 pt를 입력시 주소가 저장되는 것이기 때문에 값이 바뀌면 저장된 주소의 값도 같이 바뀐다
		pList.add(new Point(pt));
		for(int i=0; i<pList.size(); i++){						
			System.out.println(pList.get(i));					
		}
*/																	
															//n이 입력될 때까지 좌표를 이동 가능하고 이동한 좌표들을 출력하는 실행문
		ArrayList<Point> pList = new ArrayList<Point>();	//List 인터페이스를 구현한 ArrayList를 통해 객체 pList를 생성한다
		Point pt = new Point();								//객체 pt를 기본생성자를 통해 new로 생성한다
		char mode = 'y';									//멤버변수 문자 'y'를 문자형 객체 mode에 선언한다
		Scanner scan = new Scanner(System.in);
		do{																//조건식이 참일 때까지 실행문을 실행한다
			System.out.println("이동할 좌표(x,y)를 입력하세요. (예시 : 1 2)");	//선택 예시를 출력한다
			int x = scan.nextInt();										//x를 콘솔에서 입력받는다
			int y = scan.nextInt();										//y를 콘솔에서 입력받는다
			pt.move(x, y);												//객체 pt에 매개변수 x,y를 사용해서 move 메서드를 호출해 실행한다
			System.out.println("이동한 현재 좌표 : " + pt);					//move메서드를 실행한 후의 객체 pt의 값을 출력한다
			pList.add(new Point(pt));									//pList에 익명객체 pt를 생성해서 값을 저장한다
			System.out.println("더 하시겠습니까? (y or n)");					//안내문을 출력한다
			mode = scan.next().charAt(0);								//mode를 콘솔에서 입력받는다
		}while(mode != 'n');											//mode가 n이 아니면 실행문을 실행한다
		
			for(int i=0; i<pList.size(); i++){							//size라는 메서드를 통해 길이를 계산
				System.out.println(pList.get(i));						//입력된 순서대로 저장된 값을 출력
			}
		
		}

}

class Point{
	
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
		
	}
	
	public Point(Point p){
		this(p.x,p.y);
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	@Override
	public int hashCode() {		//두 객체를 같은 객체로 판별할 것인지를 결정한는 메서드
		final int prime = 31;	//해시코드라는 메서드를 통해서 그룹을 나눠서 비교
		int result = 1;
		result = prime * result + x;	// prime과 result 값을 고정하고 x, y 그룹의 값을 비교한다(x, y값이 같다면 같은 그룹으로 정의한다)
		result = prime * result + y;	//Point 클래스에서는 x, y의 값이 같다면 다른 객체이더라도 같은 그룹에 속하기 때문에 빠른 검색이 가능
		return result;					
	}
	
	@Override
	public boolean equals(Object obj) {	//list는 중복을 허용하기 때문에 equals는 중복을 허용하지 않는 set이나 map에서 사용하는 게 좋다
		if (this == obj)
			return true;
		if (obj == null)	//this가 null이면 nullPointException이 발생하기 때문에 실행됐다는 건 this는 null이 아니므로 false
			return false;
		if (getClass() != obj.getClass())	//클래스 이름이 같은지 확인
			return false;
											//기본 이퀄스 메서드
		
		Point other = (Point) obj;	//형변환이 불가능한 요소들은 위에서 걸러짐
		if (x != other.x)			//Point 클래스에서 같은 객체는 x와 y가 같은 경우이다로 설정됨
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}