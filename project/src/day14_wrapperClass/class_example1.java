package day14;

public class class_example1 {

	public static void main(String[] args) {
	
		Complexity c1 = new Complexity(1, 2);
		Complexity c2 = new Complexity(1, 2);
	//	Complexity c3 = c1 + c2; -> c++에서는 연산자 오버로딩으로 구현이 가능하지만 java에선 지원하지 않는 코드(두 객체의 값을 더해 객체를 생성)
		Complexity c3 = c1.add(c2);
		Complexity c4 = c1.sub(c2);
		System.out.println(c1+" + "+c2+" = "+c3);
		System.out.println(c1+" - "+c2+" = "+c4);

	}
}

class Complexity{
	private int real;
	private int img;
	
	
	public int getReal() {
		return real;
	}
	public int getImg() {
		return img;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public void setImg(int img) {
		this.img = img;
	}
	
	
	@Override
	public String toString() {
		
		String str = "";
		if(real != 0)
			str += real;
		
		if(img>1)
			str += "+"+img+"i";
		
		else if(img == 1)
			str += "+i";
		
		else if(img<0)
			str += img+"i";
		
		if(real != 0 || img != 0)
		str = "("+str+")";
		
		if(real == 0 && img == 0)
			str = "0";
		
		return str;	
	}
	
	public Complexity(int real, int img){
		this.real = real; this.img = img;
	}
	public Complexity(Complexity c){
		this(c.real, c.img);
	}
	
/*	기능 : 매개변수 복소수와 자신을 더한 결과를 복소수 객체로 전달하는 메서드 
 	매개변수 : 복소수 -> Complexity c
 	리턴타입 : 더한 결과 -> Complexity
 	메서드명 : add
 */
	public Complexity add(Complexity c){
		return new Complexity(real+c.real, img+c.img);
		
/*		Complexity res = new Complexity(0, 0);	//위의 코드의 같은 코드
		res.real = real + c.real;	
		res.img = img + c.img;
		return res;
*/
	}
	
	public Complexity sub(Complexity c){
		return new Complexity(real-c.real, img-c.img);
	
/*		Complexity res = new Complexity(0, 0);	//위의 코드의 같은 코드
		res.real = real - c.real;	
		res.img = img - c.img;
		return res;
*/
	}	
}
	
