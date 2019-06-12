package day5_while_array;

import java.util.Scanner;

public class class_for_while_array {

	public static void main(String[] args) {
		
		// break는 break가 포함된 바로 위 조건식의 반복문만을 빠져나감
	/*	int i, j;
		for(i=1; ; i++){
			if(i>3){
				break;
			}
			for(j=1; ; j++){
				if(j>5){
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		
		
		//for문에 이름을 붙일 시 브레이크 포문명으로 해당 포문을 빠져나가서 해당 실행문이 실행되지 않아 에러가 뜰 수 있음
	/*	int i, j;
Loop1 :	for(i=1; ; i++){
			if(i>3){
				break;
			}
			for(j=1; ; j++){
				if(j>5){
					break Loop1;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	*/	
		
		
		//*for문과 while문의 차이*
		//문법 차이만 있을뿐 실행 순서는 같기 때문에 for문과 while문은 서로 변경 가능
		//for문은 조건식을 생략하고 실행이 가능하지만 while문은 조건식이 필수
		
	/*	for(1.초기화; 2.5.8조건식; 4.7.증감연산){
			3.6.실행문;
		}
		
		while문
		//일반적인 while문
		while(조건식){
			실행문;			
		}
		
		
		//효율적인 while문
		초기화;
		1.while(2.5.8조건식){
			3.6.실행문;
			4.7.증감연산;
		}
	
		
		//무한루프 방법
		for( ; ; ){
			실행문;
		}	
		
		while(true){
			실행문;
		}
	*/	
		
		
		//1부터 10까지의 합을 출력하는 문제를 for문에서 while문으로 변환
		
	/*	int i, sum;
		for(i=1,sum=0; i<=10; i++){
			sum += i;
		}
		System.out.println(sum);
		
		
		int i, sum=0;
		i=1; // 초기화는 while문 위로
		while(i<=10){
			sum += i;
			i++;// 증감연산은 실행문의 밑으로 이동하여 변환
		}
		System.out.println(sum);
	*/	
		
		
	/*	for, while : 조건식에 따라 한번도 실행되지 않을 수 있다
		do while : 조건식에 따라 무조건 한번은 실행된다
		
		do{
			실행문;
		}while(조건식); //do while문에서는 while의 조건식 뒤에 ;으로 입력    		*/			
		
		
		//특정 상황을 제외하고 반복할 때 사용
	/*	int menu;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("메뉴");
			System.out.println("1, 학생정보 추가");
			System.out.println("2, 학생정보 수정");
			System.out.println("3, 학생정보 삭제");
			System.out.println("4, 학생정보 확인");
			System.out.println("5, 종료");
			System.out.println("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			
		}while(menu != 5); //메뉴가 5이면 종료한다
		scan.close();
	*/	
		
		
		
/*		배열 - 같은 의미를 가지는 같은 타입의 여러 변수를 묶어서 사용
  			장점 - 물리적으로 연속된 공간으로 배열을 생성하기 때문에 접근이 빠르다(연산속도가 빠르다)
  
		ex) 정수형 변수를 국어, 영어, 수학, 체육 성적과 학년, 반, 번호를 저장하기위해 배열로 만든다 
			- 문법적으로 틀리진 않지만 변수를 선언하기가 어려움
			ex) 국어 영어 수학 체육 학년 	반 	번호
				20	40	30	30	2	1	4
		ex) 학생 10명의 정수형 변수 국어성적을 배열로 만든다
			-같은 의미를 가진 분류로 배열
			ex) 국어성적 - 100 90  50 20 50			
		
		방법1
		자료형[] 배열이름; // 배열을 선언
		배열이름 = new 자료형[배열의 크기]; //배열 생성
		
		방법2
		자료형 배열이름[]; // 배열을 선언
		배열이름 = new 자료형[배열의 크기]; //배열 생성						

		c는 동적할당, 정적할당으로 나뉘지만 java는 동적할당으로 배열의 크기를 언제든 바꿀 수 있다
		배열의 시작 번지는 0번지이고 배열의 마지막 번지는 배열의 크기 -1번지이다		
	*/	
		
		
		
	/*	int [] kor;
		kor = new int[10]; // int [] kor = new imt[10];
		kor[0]=10;
		System.out.println(kor[0]); //0번지
		System.out.println(kor[9]); //9번지
		
		//System.out.println(kor[10]);  잘못된 주소로 접근하여 예외가 발생 (ArrayIndexOutOFBoundsException)
		//배열이름.length : 배열의 크기를 알려줌
		
		//배열의 초기화
		//자료형[] 배열이름 = new int[](값1, 값2, 값3, ...);
		//자료형[] 배열이름 = {값1, 값2, 값3, ...);
		
		int i;
		for(i=0; i<10; i++){ //배열이름.length : 배열의 크기를 알려줌
			System.out.println(i+"번지 : "+kor[i]);
		}
		
		Scanner scan = new Scanner(System.in);
		for(i=0; i<3; i++){
			kor[i] = scan.nextInt();
		}
		scan.close();
			
		
		int[] eng;
		eng = kor;//kor의 배열을 함께 사용하게 돼서 에러가 발생(같이 변경됨)
		for(i=0; i<eng.length; i++){ //배열이름.length : 배열의 크기를 알려줌
			System.out.println(i+"번지 : "+eng[i]);
		}
		eng[9]=100;
		for(i=0; i<eng.length; i++){
			System.out.println(i+"번지 : "+kor[i]); //kor[9]가 100으로 출력
		}
		
		eng = new int[10];//eng배열을 생성	
		for(i=0; i<eng.length; i++){
			eng[i] = kor[i]; //두개의 배열을 따로 생성한 뒤 특정 번지의 값만 복사해야 함
		}
	*/	
		
		
		
		//문제)7개의 정수형 배열을 생성하고 0번지에는 0, 1번지에는 1... 6번지에는 6을 넣는 코드를 작성하시오
		
	/*	int i;
		int[] num;
		num = new int[7];
		for(i=0; i<num.length; i++){
			num[i]=i;
			System.out.println(i);
		}
	*/
		
		
		
		
		//문제)7개를 저장할 수 있는 정수형 배열을 생성하고 각 번지에 1~45사이의 랜덤한 수를 생성하여 저장하는 코드를 작성하시오
		
		//랜덤한 수를 입력하는 코드(int)(Math.random()*(max-min+1) + min);
		
	/*	int i;
		int min=1, max=45;
		int[] num;
		num = new int[7];
		for(i=0; i<num.length; i++){
			num[i]=(int)(Math.random()*(max-min+1) + min);
			System.out.println(i+"번지 : "+num[i]);
		}
	*/	
		
		
		
	/*	변수의 유효 범위
		 - 일반 변수는 선언되면 해당 변수를 감싸고 있는 괄호 안에서 유효하다(지역변수)
		 - 반복문 안에서만 사용할 변수는 반복문 안에서 선언(for(inti=0; i<5; i++))		*/
		 
		
		
		//배열 검색 코드
		
	/*	int[] arr = new int[5];
		for(int i=0; i<arr.length; i++){
			arr[i] = i;
		}
		int search = 2;
		
		배열 : 0 1 2 3 4
		배열에 있는 모든 값을 확인하여 배열의 값과 검색값이 같으면 find를 true로 변경 후  반복문을 종료
		없으면 계속 진행		
		boolean find = false; //변수 search의 값이 배열 arr에 있는지 없는지를 나타내는 변수
		for(int i=0; i<arr.length; i++){
			if(arr[i]==search){
				find = true;
				break;
			}
		}
		if(find){
			System.out.println("배열에는 "+search+"가 있습니다.");
		}else{
			System.out.println("배열에는 "+search+"가 없습니다.");
		}
		
	*/	
		
		
		
	/*	문제) 로또 번호 생성 코드(랜덤한 수를 생성하며 중복되지 않을 때에만 i가 증가하여 다음 순서로 넘어감)
	 * 
		1.로또 배열을 생성하여 각 번지에 0~6을 순차적으로 저장
		2.로또 배열을 생성하여 각 번지에 1~45사이의 랜덤한 수를 저장
		3.배열에 해당 값이 있는지 없는지 검색
		4.로또 배열에 1~45사이의 중복되지 않은 랜덤한 수를 저장	
		
		1.랜덤한 수를 생성
		2.생성된 수가 배열에 있는지 없는지 검색
		3.없으면 생성된 수를 배열에 저장
		4. 있으면 아무 일도 하지 않는다.
	*/	
		
	/*	int i;
		//int min=1, max=45;
		int[] arr;
		arr = new int[7];
		for(i=0; i<arr.length; ){
			int r = (int)(Math.random()*(45-1+1) + 1);
			//arr[i] = r;
			//System.out.println(arr[i]);
			boolean find = false; 
			for(int j=0; j<arr.length; j++){
				if(arr[j]==r){
					find = true;
					break;
				}
			}
			if(!find){ //find == false
				arr[i] = r;
				i++;//arr[i]=r;이 참일 때에만 i가 저장되고 넘어가도록 증감연산을 if문에 입력
			}
		}
		for(int k=0; k<arr.length; k++){
			System.out.println(arr[k]);
		}
	*/	
		
		
		
	/*	문제)a~z,A~Z, 0~9로 조합된 8자리의 임시 비밀번호 발급하는 코드를 작성하시오
		a~z : 26개, A~Z : 26개, 0~9개
		62개, 0~61
		0~9 : '0'~'9'
		10~35 : 'a'~'z'
		36~61 : 'A'~'Z'
		랜덤한 수가 60 : 'Y'
	*/	
		
		/*	문자+정수 = 정수
		문자 = 정수//불가능
		문자 = (char)정수//가능		*/
		
	/*	char[] pw = new char[8];
		for(int i=0; i<pw.length; i++){
			int r = (int)(Math.random()*62);
			if(r<=9){
				pw[i] = (char)('0'+r);
			}else if(r<=35){
				pw[i] = (char)('a'+(r-10));
			}else{
				pw[i] = (char)('A'+(r-36));
			}
		}
		System.out.println(pw);
	*/	
	
		
		//abcd...z
	/*	int numA = 'a';
		int numB = 'b';
		System.out.println(numA); // 문자 a에 대한 유니코드 정수값 : 97
		System.out.println(numB); // 문자 b에 대한 유니코드 정수값 : 98
		
		int numC = 'A';
		int numD = 'B';
		System.out.println(numC); // 문자 A에 대한 유니코드 정수값 : 65
		System.out.println(numD); // 문자 B에 대한 유니코드 정수값 : 66
	*/	
		
		
		//문제)알파벳 소문자를 차례대로 나열하시오
		
		//방법1)
	/*	int num = 100; // 'd'		
		for(int i=97; i<=97+25; i++){
			System.out.print((char)i);
		}System.out.println();
		
		//방법2
		for(int i='a'; i<='z'; i++){
			System.out.print((char)i);
		}System.out.println();
		
		//방법3
		for(int i=0; i<=25; i++){
			System.out.print((char)('a'+i));
		}
	*/	
		
		
		//[]뒤에 ,를 쓰면 뒤의 변수는 일반 변수로 입력된다
	/*	int[] arr1, arr2;
		int arr3[], arr4;
		arr1 = new int[3];
		arr2 = new int[3];
		arr3 = new int[3];
		arr4 = new int[3];//int arr4;가 돼 실행 불가		*/		
		
		
		
	/*	문제)두 수의 공약수들을 배열에 저장하여 출력하는 코드를 작성하시오
		 - 공약수는 최대 10개까지 저장
	*/	
		
	/*	int num1=8, num2=12;
		int i;
		int[] arr = new int[10];
		int cnt=0;		
		for(i=1; i<=num1; i++){
			if(cnt==10){
				break;
			}	
			if(num1%i==0 && num2%i==0){	
				arr[cnt] = i;
				cnt++;
				}
			
		}
		for(int j=0; j<cnt; j++){
			System.out.print(arr[j]+" ");
		}
	*/	
		
		
	/*	향상된 for문
		 - 배열의 모든 값들을 확인하여 비교할 때 사용
 		 - 배열의 값을 수정할 때에는 사용 불가
		 - for(자료형 변수명 : 배열 이름){
			 실행문;
		 }
		 - 자료형은 배열과 같은 자료형을 써야 한다
	*/	 
		
		
	/*	int[] num = new int[]{1,2,3,4,5};
		 boolean find = false;
		 int search = 4;
		 for(int tmp : num ){
			 if(tmp == search){
				 find = true;
				 break;
			 }		 
		 }
		 if(find){
			 System.out.println("있음");
		 }else{
			 System.out.println("없음");
		 }
	*/	
		
		
		
		//정렬하는 코드
		//버블정렬 : 단순하고 효율이 가장 안좋다
		//반복 횟수 : 배열의 크기 - 1
	/*	int[] arr = new int[]{1,3,5,7,9,2,4,6,8};
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){//오름 차순은 > , 내림차순은 <
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	*/	
		
		
		
		
		
		
	}

}








