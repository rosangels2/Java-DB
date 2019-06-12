package day14;

import java.util.Scanner;

public class class_example {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int real1, img1;
		int real2, img2;
		
		System.out.print("복소수1의 실수부 : ");
		real1=scan.nextInt();
		System.out.print("복소수1의 허수부 : ");
		img1=scan.nextInt();
		System.out.print("복소수2의 실수부 : ");
		real2=scan.nextInt();
		System.out.print("복소수2의 허수부 : ");
		img2=scan.nextInt();
		
		int real3 = real1 + real2;
		int img3 = img1 + img2;
		int real4 = real1 - real2;
		int img4 = img1 - img2;
		
		System.out.println(complexityToString(real1, img1)
				+" + "
				+complexityToString(real2, img2)
				+" = "
				+complexityToString(real3, img3));
		
		System.out.println(complexityToString(real1, img1)
				+" - "
				+complexityToString(real2, img2)
				+" = "
				+complexityToString(real4, img4));
		
		
		
/*		문제) 1 + 2i + 3 + 4 i = 4 + 6i
  		상황 설정 : 수학과 학생이 허수를 계산하는 계산기를 만들고 싶어서 
		허수를 계산할 수 있는 프로그램을 작성해야 하는 상황
		
  		x + 2y + 3x + 4y = 4x + 6y
		허수 1의 실수부 : 1
		허수 1의 허수부 : 2
		허수 2의 실수부 : 3
		허수 2의 허수부 : 4
		(1 + 2i) + (3 + 4i) = (4 + 6i)
		(1 + 2i) - (3 + 4i) = (-2 -2i)
*/		//(num1 + num2) + ((num1+2)+(num2+2)) = ((num1+(num1+2))+(num2+(num2+2))+i)
		//(num1 + num2) - ((num1+2)+(num2+2)) = ((num1+(num1+2))-(num2+(num2+2))+i)
		//실수부 1, 3, 5 홀수 
		//허수부 2, 4, 6 짝수
		//변수 실수부, 허수부
		

		
		
		
	}
	
	
/*	기능 : 두 정수 a, b를 복소수 형태 (a+bi)의 문자열로 변환하는 기능
  	리턴타입 : 두 정수 -> int real, int img
 	매개변수 : 복소수형태의 문자열 -> String
 	메서드명 : ComplexitytoString
*/
	
	public static String complexityToString(int real, int img){
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
		
		return str;
	}
	
	
	
	
	
	
}



