package project;

import java.util.Scanner;

public class day3 {

	public static void main(String[] args) {
		//예제) 1부터 5까지의 합을 구하는 코드를 반복문을 이용하여 작성하시오
	/*	int i=1;
	    int sum=0;
	    for(i=1, sum=0 ;i<=5 ;i++ ){
	    	sum = sum + i; // sum += i;
	    }
		 System.out.println(sum);
	*/	
		
		
	/*	무한반복식
		int i;
		int sum = 0;
		for( ; ; ){
			
		}
	*/	
		
		
		//1부터 10까지 짝수의 합을 구하시오
		//방법1 : 1부터 10까지 하나씩 증가하면서 짝수이면 더하고 홀수이면 무시한다
	/*	int i;
		int sum = 0;
		for(i=1 ;i<=10 ;i++ ){
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println("1부터 10까지 짝수의 합 : " +sum);
	*/	
		
		//방법2 : 2부터 10까지 2개씩 증가하면서 더한다
	/*	int i;
		int sum = 0;
		for(i=2, sum=0; i<=10; i+=2){
			sum+= i;
		}
		System.out.println("1부터 10까지 짝수의 합 : " +sum);
	*/	
		
		
	/*	int i;
		int sum = 0;
		for(i=2, sum=0; i<=10; i+=2){
			sum+=i;
		}System.out.println(sum);
	*/	
		
		
		//방법3 : 1부터 5까지 하나씩 증가하면서 해당 수에 2를 곱해 더한다
	/*	int i;
		int sum = 0;
		for(i=1, sum=0; i<=5; i++){
			sum += i*2;
		}
		System.out.println("1부터 10까지 짝수의 합 : " +sum);
	*/	
		
		
	/*	 두 수의 최대공약수를 구하는 코드를 작성하시오
		 최대공약수 = 두 수의 공약수 중 가장 큰 공약수
	   	 공약수 = 두 수의 약수 중에서 공통으로 들어가 있는 약수
		 8 : 1 2 4 8
		 12 : 1 2 3 4 6 12
	 	 공약수 : 1 2 4
		 최대공약수 4         */	
		//i가 num1의 약수이고 i가 num2의 약수이면 (i가 num1과 num2의 공약수이면)
		//문제에서 (~이면)을 기준으로 앞쪽은 조건식, 뒷쪽은 실행문이 된다
		//gcd에 i를 저장하고 반복문이 종료된 후 gcd를 출력한다
		
		
		//최대공약수를 구하는 코드
	/*	int num1=8, num2=12;
		int i, gcd=1;
		for(i=1,gcd=0 ;i<=8 ;i++ ){
			if(num1%i==0 && num2%i==0){
				gcd = i ;
			}
		}
		System.out.println(num1+"과 "+num2+"의 최대 공약수 : " + gcd);
	*/	
		
		
	
	/*	문제) 두 수가 서로소인지 판별하시오
		서로소란 두 수의 최대공약수가 1인 두 수 사이의 관계를 말함
		3과 7은 서로소 관계
		4와 6은 서로소 관계가 아님
	*/	
		
		
	/*	int num1 = 3, num2 = 11;
		int i, gcd=1;
		for(i=1,gcd=0; i<=3; i++){
			if(num1%i==0 && num2%i==0){
				gcd = i;
				
			}
		}if(gcd==1){
			System.out.println(num1+"과 " +num2+"는 서로소 관계");
		}else{
				System.out.println(num1+"과 " +num2+"는 서로소 관계가 아님");
			}
	*/	
		
		
	/*	int i = 0;
		int sum = 0;
		for(i=1; i<=10; i++){
			if(1 % 2 == 1){
				continue;
			}
			sum += 1;
			System.out.println(i);
		}
		System.out.println();
	*/	
		
		
	/*	예제) 두 수의 최소공배수를 구하는 코드를 작성하시오
		최소공배수는 두 수의 공배수 중 가장 작은 공배수
		공배수는 두 수의 배수 중 공통으로 포함한 배수
		10의 배수 : 10 20 30 40 50 60 .....
		15의 배수 : 15 30 45 60 75 90 .....
		10과 15의 공배수 : 30 60 90 120
		10과 15의 최소 공배수 : 30
	*/	
		
	/*	순서
		변수 선언 - num1, num2, i, lcm
		반복 횟수 : i는 1부터 nim1*num2까지 하나씩 증가
		실행문
		i가 num1의 배수이고 i가 num2의 배수이면
		lcm에 i를 저장하고 반복문을 빠져나온다
		반복문이 종료된 후 lcm을 출력한다

	*/	
		
		
	/*	최대공배수를 구하는 식
		int num1=10, num2=15;
		int i, lcm =1;
		for(i=1,lcm=0; i<=150; i++){
			if(i % num1 == 0 && i % num2 == 0){
				lcm = i;
				break;
			}
		}
		System.out.println(num1+ "과 " +num2+ "의 최소공배수는" +lcm);		
	*/	
		
		
	/*	int num1=10, num2=15;
		int i, lcm =1;
		for(i=num1,lcm=0; i<=10000; i+=num1){
			if(i % num2 == 0){
				lcm = i;
				break;
			}
		}
		
		System.out.println(num1+ "과 " +num2+ "의 최소공배수는" +lcm);
	*/	
		
	/*	int num1=3, num2=26;
		int i, lcm =1;
		int tmp;
		if(num2 > num1){
			//두 수를 바꾼다
			tmp=num1;
			num1=num2;
			num2=tmp;
		}
			for(i=num1,lcm=0; i<=10000; i+=num1){
				if(i % num2 == 0){
					lcm = i;
					break;
				}
		}
		System.out.println(num1+ "과 " +num2+ "의 최소공배수는" +lcm);
	*/	
		
		
		//문제) 구구단 7단을 출력하는 코드를 작성하시오
		
		
	/*	int i, num = 7;
		int res;
		for(i=1 ;i<=9 ; i=i+1){
			res = num*i;
			System.out.println(num+" X " + i + " = " + res);
		}
	*/	
				
		
		//문제) 구구단을 모두 출력하는 코드를 작성하시오
	/*	int i;
		int num = 2;
		int res = 0;
		for(num=2; num<=9; num++){
			System.out.println(num + "단");
			for(i=1 ;i<=9 ; i=i+1){
				res = num * i;
				System.out.println(num+" X " + i + " = " + num*i);
			}
		}
	*/	
	
		
	/*	문제) *을 가로 6줄 세로 5줄로 출력하시오
		int i = 0, j = 0;
		for(i=1; i<=6; i++){	//가로
			for(j=1; j<=5; j++){	//세로
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		
		
	/*	문제) 다음을 출력하시오
		*
		**
		***
		****
		*****
		******
		
		int i = 0, j = 0;
		int res = 0;
		for(i=1; i<=6; i++){
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		
		
	/*	문제) 다음을 출력하시오
	 	     * i=1 공백=5 *=1
	 	    ** i=2 공백=4 *=2
		   *** i=3 공백=3 *=3
		  **** i=4 공백=2 *=4
		 ***** i=5 공백=1 *=5
		****** i=6 공백=0 *=6
	*/	
		
		
	/*	int i = 0, j = 0;
		int res = 0;
		for(i=1; i<=6; i++){
			for(j=1; j<=6-i; j++){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		
		
	/*	int i = 0, j = 0;
		int res = 0;
		for(i=1; i<=6; i++){
			for(j=5; j>=i; j--){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		
		
	/*	문제) 다음을 출력하시오
		
			*       i=1 *=1   공백=5
		   ***	 	i=2 *=3   공백=4
		  *****		i=3 *=5   공백=3
		 *******	i=4 *=7   공백=2
		*********	i=5 *=9   공백=1
	   ***********	i=6 *=11 공백=0
	*/	
		
		
	/*	int i = 0, j = 0;
		int res = 0;
		for(i=1; i<=6; i++){
			for(j=1; j<=6-i; j++){
				System.out.print(" ");
			}
			for(j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		
		
	/*	int i = 0, j = 0;
		int res = 0;
		for(i=1; i<=6; i++){
			for(j=1; j<=6-i; j++){
				System.out.print(" ");
			}
			for(j=1; j<=i; j++){
				System.out.print("*");
			}
			for(j=1; j<=i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		
	/*	문제) 다음을 출력하시오
	  
		****** i=1 *=6
		*****  i=2 *=5
		****   i=3 *=4
		***    i=4 *=3
		**     i=5 *=2
		*      i=6 *=1
*/		
		
	/*	int i = 0, j = 0;
		int res = 0;
		for(i=1; i<=6; i++){
			for(j=1; j<=7-i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		
		
	/*	문제) 다음을 출력하시오
			
		*********** i=1 *=11  공백=0
		 ********* 	i=2 *=9   공백=1
		  ******* 	i=3 *=7   공백=2
		   *****	i=4 *=5   공백=3
		    ***	    i=5 *=3   공백=4
	   	     *     	i=6 *=1   공백=5
	
		
		int i = 0, j = 0;
		for(i=1; i<=6; i++){
			for(j=1; j<=i-1; j++){
				System.out.print(" ");
			}
			for(j=11; j>=2*i-1; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		
		

		
		
	/*	문제) 다음을 출력하시오

		****** i=1 *=6 공백=0
		 ***** i=2 *=5 공백=1
		  **** i=3 *=4 공백=2
		   *** i=4 *=3 공백=3
		    ** i=5 *=2 공백=4
		     * i=6 *=1 공백=5
	*/	
		
			
		
		
	/*	int i = 0, j = 0;
		for(i=1; i<=6; i++){
			for(j=1; j<=i-1; j++){
				System.out.print(" ");
			}
			for(j=6; j>=i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		
		
	/*	문제) 다음을 출력하시오

				*
			   ***
			  *****
			 *******
			*********
		   ***********
		    *********
		     *******
		      *****
		       ***
		        *
	
		
		int i = 0, j = 0;
		int res = 0;
		for(i=1; i<=6; i++){
			for(j=1; j<=6-i; j++){
				System.out.print(" ");
			}
			for(j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(i=1; i<=6; i++){
			for(j=1; j<=i; j++){
				System.out.print(" ");
			}
			for(j=9; j>=2*i-1; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}








