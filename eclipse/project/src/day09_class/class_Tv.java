package day09_class;

import java.util.Scanner; // java.util이라는 패키지의 Scanner라는 클래스를 import한다
						  // 다른 패키지의 public 클래스를 사용하려면 import 패키지.클래스명; 을 선언해야 한다

public class class_Tv {

	public static void main(String[] args) {

		//nextint()는 Scanner클래스의 멤버메서드
		//int num = scan.nextInt();
		//next()는 Scanner클래스의 멤버 메서드
		//char ch = scan.next().charAt(0);
		//charAt()는 string클래스의 멤버메서드
		
/*		Scanner scan = new Scanner(System.in);
		Tv tv = new Tv();
		tv.printChannel();
		Tv tv2 = new Tv();
		tv2.printChannel();
		Tv tv3 = tv;
		tv3.printChannel();
		System.out.println(Tv.BRAND);
		scan.close();
*/		

		//기본 생성자를 통해 객체 생성 후 초기화
		Tv t1 = new Tv();
		t1.printChannel();
		t1.printVolume();
		//생성자 오버로딩을 이용한 객체 생성 후 초기화
		Tv t2 = new Tv(100, 15);
		t2.printChannel();
		t2.printVolume();
		System.out.println();
		//t3를 생성해서 t2의 값으로 초기화
		Tv t3 = new Tv(t2);
		t3.printChannel();
		t3.printVolume();
		t3.volumeDown();
		System.out.println("t3 소리 줄이기 실행 후 t3");
		t3.printVolume();
		System.out.println("t3 소리 줄이기 실행 후 t2");
		t2.printVolume();
		System.out.println();
		//t4를 생성하지 않고 t3를 다른 이름으로 부른다(값을 공유)
		Tv t4 = t3;
		t3.printVolume();
		t3.volumeDown();
		System.out.println("t3 소리 줄이기 실행 후 t3");
		t3.printVolume();
		System.out.println("t3 소리 줄이기 실행 후 t4");
		t4.printVolume();
		
	}
	

	
	
	
}


/*class Tv{ //같은 패키지 내에서 동일한 클래스명을 가지는 클래스를 생성할 수 없다(다른 패키지에서 호출할 때 충돌이 일어나기 때문)
	
}
*/