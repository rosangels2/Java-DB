package project;

import java.util.Scanner;

public class day7_question4 {

	public static void main(String[] args) {

		//	4. 콘솔을 통해 3개의 정수를 입력받아 배열에 저장하는 코드 작성
		//방법2)
/*		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		int []sum;
		sum = new int[3];
		sum[0]=num1;
		sum[1]=num2;
		sum[2]=num3;
		
		for(int tmp : sum){
			System.out.print(tmp + " ");
		}
*/
		
		//방법2)
/*		Scanner scan = new Scanner(System.in);
		int []sum;
		sum = new int[3];
		sum[0] = scan.nextInt();
		sum[1] = scan.nextInt();
		sum[2] = scan.nextInt();
		for(int tmp : sum){
			System.out.print(tmp + " ");
		}
*/	
	
	
		//방법3)
		Scanner scan = new Scanner(System.in);
		int []sum;
		sum = new int[3];
		for(int i=0; i<sum.length; i++){
			sum[i] = scan.nextInt();
		}
		for(int tmp : sum){
			System.out.print(tmp + " ");
		}
		scan.close();
		
	
	
	}
	
}
