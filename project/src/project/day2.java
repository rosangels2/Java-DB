package project;

import java.util.Scanner;

class day2 {
	public static void main(String[] args) {
		
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean isEven = num%2==0 ? true:false;
		System.out.println(isEven);*/
		
		//문제1)num가 짝수라면(조건문) 콘솔에 짝수라고 출력해라(실행문)
		/*int num = 10;
		if(num % 2 == 0){
			System.out.println("짝수");
		}*/
		
		//문제2)num가 홀수라면(조건문) 콘솔에 홀수라고 출력해라(실행문)
		/*int num = 10;
		if(num1 % 2 == 1){
			System.out.println("홀수");
		}*/
		
		//if(num % 2 == 0); -> ; 사용시 ; 앞쪽만 조건문으로 인식
		
		
		
		
		//문제3)num가 짝수라면(조건문) 콘솔에 짝수라고 출력해라(실행문)
				/*int num = 11;
				if(num % 2 == 0){
					System.out.println("짝수");
				}
				
				//위의 조건식이 거짓이면
				else{
					System.out.println("홀수");
				}
				*/
				//if(num % 2 == 0); -> ; 사용시 ; 앞쪽만 조건문으로 인식
		
		
		//문제4) 나이가 20 이상이면 성인이라고 출력하고 아니면 청소년이라고 출력하는 코드를 작성하시오
		/*Scanner scan = new Scanner(System.in);
				int age = scan.nextInt();
		if(age >= 20){
			System.out.println("성인");
		}
		
		else{
			System.out.println("청소년");
			scan.close();
		}*/
		
		
		/*int age = 34;
		if(age >= 20){
			System.out.println("성인");
		}
		
		//위의 조건식이 거짓이면
		else{
			System.out.println("청소년");
		}*/
		
		
		/*예제)num이 0이면 0이라고 출력하고, 1이면 1이라고  출력하고
		0과 1이 아니면 0과 1이 아닙니다라고 출력하라*/
		
		/*int num = 0;
		if(num == 0){
			System.out.println("0입니다.");
		}else if(num == 1){
			System.out.println("1입니다.");
		}else{
			System.out.println("0과 1이 아닙니다.");
		}*/
		
		
		/*예제)num가 2의 배수이면 2의 배수라고 출력해라
		2, 4, 6, 8, 10, ...
		num을 2로 나누었을 때 나머지가 0과 같다면 2의 배수*/
		
		/*int num = 3;
		if(num num을 2로 나누었을 때 나머지가 0과 같다){
			2의 배수라고 출력;
		}*/
		
		/*int num = 4;
		if(num % 2 == 0){
			System.out.println(num + "는 2의 배수");
		}*/
		
		
		/*num가 2의 배수이면 2의 배수라고 출력하고
		num가 3의 배수이면 3의 배수라고 출력하고
		num가 6의 배수이면 6의 배수라고 출력하고
		num가 2, 3, 6의 배수가 아니면 2, 3, 6의 배수가 아닙니다라고 출력하라
		num = 6 -> 6의 배수입니다만 출력*/
		
		
		/*int num = 6;
		if(num % 6 == 0){
			System.out.println("6의 배수입니다.");
		}else if(num % 3 == 0){
			System.out.println("3의 배수입니다.");
		}else if(num % 2 == 0){
			System.out.println("2의 배수입니다.");			
		}else{
			System.out.println("2, 3, 6의 배수가 아닙니다.");
		}*/
		// 배수가 겹칠 땐 큰 배수를 먼저 입력한다
		
		
		/*int num = 12;
		if(num % 2 == 0 && num % 3 != 0){
			System.out.println("2의 배수입니다.");
		}else if(num % 3 == 0 && num % 3 != 0){
			System.out.println("3의 배수입니다.");
		}else if(num % 6 == 0){
			System.out.println("6의 배수입니다.");			
		}else{
			System.out.println("2, 3, 6의 배수가 아닙니다.");
		}*/
		
		
		
		/*예제)점수가 주어지면 점수에 맞는 학점을 출력하는 코드를 작성하시오
			90점 이상 ~ 100점 이하 = A
			80점 이상 ~ 90점 미만 = B
			70점 이상 ~ 80점 미만 = C
			60점 이상 ~ 70점 미만 = D
			0점 이상 ~ 60점 미만 = F
			0점 미만, 100점 초과 : 잘못된 점수입니다.*/
		
		/*Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();		
				if(num >= 90 && num <=100){
					System.out.println('A');
				}else if(num >= 80 && num <90){
					System.out.println('B');
				}else if(num >= 70 && num <80){
					System.out.println('C');
				}else if(num >= 60 && num <70){
					System.out.println('D');
				}else if(num >= 0 && num <60){
					System.out.println('F');
				}else if(num < 0 || num > 100)
					System.out.println("잘못된 점수입니다.");
				}
				scan.close();
				*/
		
		
		/*double num = 66.5;
					if(num >= 90 && num <=100){
						System.out.println('A');
					}else if(num >= 80 && num <90){
						System.out.println('B');
					}else if(num >= 70 && num <80){
						System.out.println('C');
					}else if(num >= 60 && num <70){
						System.out.println('D');
					}else if(num >= 0 && num <60){
						System.out.println('F');
					}else{
						System.out.println("잘못된 점수입니다.");
					}*/
		
		/*if((int)num/10 == 9 || num == 100)
		 10의 자리를 정수로 구해서 값을 출력*/
		
		/*	int num = 12;
		if(num % 2 == 0 && num % 3 == 0){
			System.out.println(num + "는 6의 배수");
		}


		int num1 = 12;
			if(num % 3 == 0){
				System.out.println(num + "는 6의 배수");
			}
		*/
		
		/*
		int num = 12;
		if(num % 2 == 0){
			if(num % 3 == 0)
			System.out.println(num + "는 6의 배수");
		}

		if(num % 2 == 0 && num % 3 == 0){
			System.out.println(num + "는 6의 배수");
		}
		*/
		
		
		
/*		int num = 4;
		switch(num%2){
		case 0: //if(num % 2 == 0)
			System.out.println("짝수");;
			break;
		case 1: 
			System.out.println("홀수");;
			default:
		
			
		}
		*/
		
		
	/*	
	문제) 달력의 각 달마다 마지막 일수가 다르다.
	달이 입력되면 해당하는 달의 마지막 일수를 출력하는 코드를 switch case문을 이용하여 작성하라
	31 : 1, 3, 5, 7, 8, 10, 12
	30 : 4, 6, 9, 11
	28 : 2
		*/
		
		/*		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		switch(month){
		case 1:	System.out.println("31"); break;
		case 2:	System.out.println("28"); break;
		case 3:	System.out.println("31"); break;
		case 4:	System.out.println("30"); break;
		case 5:	System.out.println("31"); break;
		case 6:	System.out.println("30"); break;
		case 7:	System.out.println("31"); break;
		case 8:	System.out.println("31"); break;
		case 9:	System.out.println("30"); break;
		case 10:System.out.println("31"); break;
		case 11:System.out.println("30"); break;
		case 12:System.out.println("31"); break;
		*/
			
		
		/*	
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		switch(month){
		case 1:	
		case 3:	
		case 5:	
		case 7:	
		case 8:	
		case 10:	
		case 12:System.out.println("31일"); break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println("30일"); break;
		case 2:System.out.println("31일"); break;
		default:
			System.out.println("잘못 입력했습니다.");
		*/
		
	/*	랜덤으로 원하는 범위의 정수(a~b)를 만드는 방법
		 - System.out.println(Math.random());	
		 a <= Math.random()*(b-a+1) + a < (b+1)
	 */
		
	/*	예제) 가위바위보 게임
		int min = 1;
		int max = 3;
		//com이 가위(1), 바위(2), 보(3) 중에서 랜덤으로 하나 선택
		int com = (int)(Math.random()*(max-min+1) + min);		
		int user = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. ");
		user = scan.nextInt();
		switch(user-com){
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0: //default로 마지막 case 대체 가능
			System.out.println("비겼습니다.");
		}
	*/	
		
		
	/*	System.out.println(com); 
		확인용 테스트    */
		 
		//예제) Hello world!를 5번 반복
		
	/*	반복할 때 사용되는 코드 for(i=1; i<=5; i=i+1){
			실행문;
		}	*/
		
	/*	int i = 0; // 반복문에서 사용할 변수
		for(i=1; i<=5; i=i+1){
			System.out.println("Hello world!");
		}
		
		int i = 0; // 반복문에서 사용할 변수
		for(i=1; i<=5; i++){
			System.out.println("Hello world!");
		}
	*/	
		
		
		
	/*	예제) 1에서 5까지출력하는 코드를 반복문을 통해 작성하시오
		int i = 0;
		for(i=1; i<=5; i=i+1){
			System.out.println(i);
		}
	*/	
		
		
	/*	예제) 1부터 10까지의 합을 반복문을 통해 출력하시오
		sum = 0
				sum = 0 + 1; i = 1
				sum = 0 + 1 + 2; i=2
				sum = 0 + 1 + 2 + 3; i=3
				....
				sum = 0 + 1 + 2 + 3 + ... + 9 + 10; i=10

				sum = sum + i;
	*/	
		
	/*	 수의 합을 계산하는 코드 sum = sum + i; |||||||
							sum += i;
	*/	
		
	/*	int i = 0;
		int sum = 0;
		for(i=1, sum=0; i<=10; i=i+1){
			sum += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	*/	
		
		
	/*	//예제) 구구단의 7단을 출력하는 코드를 반복문을 이용하여 작성하시오
		
		int i = 0;
		int num = 5; //num의 값만 바꾸면 다른 값의 구구단 출력 가능
		for(i=1; i<=9; i=i+1){
			System.out.println(num+" x " + i +" = " +  num*i);
		}
	*/		
		
		
		//예제) 정수를 입력받아 입력받은 정수가 소수인지 아닌지 판별하는 코드를 반복문을 이용하여 작성하시오
		//소수 : 약수가 1과 자기 자신인 수(약수가 2개인 수)
		//약수 : 나누어 떨어지는 수 (4의 약수 = 1, 2, 4)
		
	/*	int num, i, cnt;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		for(i=1, cnt=0 ;i<=num ; i++){
			//i가 num의 약수이면 약수의 갯수를 하나 증가
			//num를 i로 나누었을 때 나머지가 0과 같다 => i가 num의 약수
						if(num % i == 0){
				cnt++;//ctn +=1 //cnt+1; //++cnt
			}
		}
		//약수의 갯수가 2개이면 소수라고 출력
		if(cnt == 2){
			System.out.println(num+"는 소수");
		}
		//2개가 아니면 소수가 아님이라고 출력
		else{
			System.out.println(num+"는 소수가 아님");
		}
	*/	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

