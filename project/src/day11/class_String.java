package day11;

import java.util.Scanner;

public class class_String {

	public static void main(String[] args) {
		
		String str1 = "Hello", str2 = "Hello";
		boolean cmp = str1 == str2;
		System.out.println(cmp);
		cmp = str1 != (str2="Hello ");
		System.out.println(cmp);
		cmp = str1 != (str2 = "Hello 1");
		System.out.println(cmp);
		System.out.println(str1.equals(str2));
		str1 = "Hello";
		str1 += " world";	//+를 통해 문자열을 덧붙인다 = concat
		System.out.println(str1);
		str1 = ""+10;	//valueOf와 같다

		
/*		 예제) 문자열을 입력하세요 - Hello world
		 찾을 문자열을 입력하세요 - He
		 Hello world에는 He가 있습니다
*/			 
		
/*		Scanner scan = new Scanner(System.in);
		String str = "";
		System.out.print("문자열을 입력하세요. ");
		str = scan.nextLine();
		System.out.print("찾을 문자열을 입력하세요. ");
		String search = scan.nextLine();
		//방법1)
		if(str.contains(search)){
			System.out.println(str+"에는 "+search+"가 있습니다.");
		}else{
			System.out.println(str+"에는 "+search+"가 없습니다.");
		}
		//방법2)
		if(str.indexOf(search) >= 0){
			System.out.println(str+"에는 "+search+"가 있습니다.");
		}else{
			System.out.println(str+"에는 "+search+"가 없습니다.");
		}
		scan.close();
*/		
		
/*		예제)
		문자열을 입력하세요 : 112233445511
		교체될 문자열을 입력하세요 : 11
		교체할 문자열을 입력하세요 : 00
		교체 결과 : 002233445500
*/		

/*		Scanner scan = new Scanner(System.in);
		String str = ""; //String str = new String();
		System.out.print("문자열을 입력하세요. ");
		str = scan.nextLine();
		System.out.print("교체될 문자열을 입력하세요. ");
		String search = scan.nextLine();
		System.out.print("교체할 문자열을 입력하세요. ");
		String change = scan.nextLine();

		String newStr = "";
		newStr = str.replaceAll(search, change);
		if(newStr == str){
			System.out.println("교체될 문자열이 없습니다.");
		}else{
			System.out.println("교체된 문자열 : "+newStr);
		}
*/
		
	}

}
