package project;

import java.util.Scanner;

public class day4 {

	public static void main(String[] args) {
		
	/*	boolean isEven = 10%2==0?true:false;
		if(isEven){
			System.out.println("짝수");
		} // 결과값이 참이면 짝수로 출력
	*/	
		
		//String(문자열을 저장할 수 있는 클래스(자료형과 달리 첫 글자가 대문자) s = "안녕하세요";
		
		
	/*	int num1 = 10;
		int num2 = 20;
		int num3 = 0, num4 = 0;
		if((num3 = num1) < 0 && (num4 = num2) < 0){
			
		}
		System.out.println(num3 + " , " + num4);
		// 조건식1이 거짓이면 조건식2는 실행하지 않는다
	*/	
		
		
		//문제) 두 정수를 입력받아 두 정수의 합을 출력하는 코드를 작성하시오
		
	/*	int num1, num2;
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println(num1+"과 "+num2+"의 합 = " +(num1+num2));
		scan.close();
	*/	
		
		
		
		//문제) 두 정수와 산술 연산자를 입력받아 연산 결과를 출력하는 코드를 작성하시오 (계산기)
	/*	int num1, num2;
		char op;
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();   //스캔 순서에 따라 콘솔 입력 순서가 달라짐
		num2 = scan.nextInt();
		op = scan.next().charAt(0);
		switch(op){
		case'+':
			System.out.println(""+num1+op+num2+"="+(num1+num2));
			break;
		case'-':
			System.out.println(""+num1+op+num2+"="+(num1-num2));
			break;
		case'*':
			System.out.println(""+num1+op+num2+"="+(num1*num2));
			break;
		case'/':
			switch(num2){
			case 0:
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			default:
				System.out.println(""+num1+op+num2+"="+((double)num1/num2));
			}
			break;
		
		case'%':
			switch(num2){
			case 0:
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			default:
				System.out.println(""+num1+op+num2+"="+(double)num1%num2);
				
			}		
			break;
		default:
			System.out.println(op+"는 잘못된 산술 연산자입니다.");	
			break;
		}
		
		scan.close();
	*/	
		
		
		//문제) 1부터 100까지 짝수만 출력하는 코드를 작성하시오
	/*	int i;
		for(i=1; i<=100; i++){
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
	*/	
		
	/*	int i;
		for(i=2; i<=100; i+=2){
			System.out.println(i);
		}
	*/	
		
	/*	int i;
		for(i=1; i<=100; i++){
			if(i%2==1){
				continue; //해당되는 값을 제외하고 다시 진행
			}
			System.out.println(i);
		}
	*/	
		
	/*	int i;
		for(i=1; i<=50; i++){
			System.out.println(i*2);
		}
	*/	
		
		
	/*	int i;
		for(i=1; i<=50; i++)
			System.out.println(i*2); // 실행문이 한 줄이면 {} 생략 가능
	*/	
		
		
		//문제) 1부터 100까지 짝수의 합
	/*	int i;
		int sum = 0;
		for(i=1 ;i<=100 ;i++ ){
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println("1부터 100까지 짝수의 합 : " +sum);
	*/	
		
		
		//문제) 1부터 100까지의 합
	/*	int i;
		int sum = 0;
		for(i=1 ;i<=100 ;i++ ){
				sum += i;
		}
		System.out.println("1부터 100까지의 합 : " +sum);
		
	*/	
		
		
				
	/*	 두 수의 최대공약수를 구하는 코드를 작성하시오
		 최대공약수 = 두 수의 공약수 중 가장 큰 공약수
	   	 공약수 = 두 수의 약수 중에서 공통으로 들어가 있는 약수
		 8 : 1 2 4 8
		 12 : 1 2 3 4 6 12
	 	 공약수 : 1 2 4
		 최대공약수 4         	
		//i가 num1의 약수이고 i가 num2의 약수이면 (i가 num1과 num2의 공약수이면)
		//문제에서 (~이면)을 기준으로 앞쪽은 조건식, 뒷쪽은 실행문이 된다
		//gcd에 i를 저장하고 반복문이 종료된 후 gcd를 출력한다
		
		
		//최대공약수를 구하는 코드
		int num1=8, num2=12;
		int i, gcd=1;
		for(i=1,gcd=0 ;i<=8 ;i++ ){
			if(num1%i==0 && num2%i==0){
				gcd = i ;
			}
		}
		System.out.println(num1+"과 "+num2+"의 최대 공약수 : " + gcd);
	*/	
		
		//문제) 두 수의 공약수를 출력하는 코드를 작성하시오
		
	/*	int num1=8, num2=12;
		int i, gcd=1;
		System.out.print(num1+"과 "+num2+"의 공약수 : ");
		for(i=1,gcd=0 ;i<=8 ;i++ ){
			if(num1%i==0 && num2%i==0){
				gcd = i ;
				System.out.print(i+" ");
			}
		}System.out.println();
		System.out.println(num1+"과 "+num2+"의 최대공약수 : " + gcd);
	*/	
		
		
		//*****
		
		
		
		
		
		
		
		
	}

}








