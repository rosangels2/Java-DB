package project;

import java.util.Scanner;

public class day3 {

	public static void main(String[] args) {
		//����) 1���� 5������ ���� ���ϴ� �ڵ带 �ݺ����� �̿��Ͽ� �ۼ��Ͻÿ�
	/*	int i=1;
	    int sum=0;
	    for(i=1, sum=0 ;i<=5 ;i++ ){
	    	sum = sum + i; // sum += i;
	    }
		 System.out.println(sum);
	*/	
		
		
	/*	���ѹݺ���
		int i;
		int sum = 0;
		for( ; ; ){
			
		}
	*/	
		
		
		//1���� 10���� ¦���� ���� ���Ͻÿ�
		//���1 : 1���� 10���� �ϳ��� �����ϸ鼭 ¦���̸� ���ϰ� Ȧ���̸� �����Ѵ�
	/*	int i;
		int sum = 0;
		for(i=1 ;i<=10 ;i++ ){
			if(i % 2 == 0){
				sum += i;
			}
		}
		System.out.println("1���� 10���� ¦���� �� : " +sum);
	*/	
		
		//���2 : 2���� 10���� 2���� �����ϸ鼭 ���Ѵ�
	/*	int i;
		int sum = 0;
		for(i=2, sum=0; i<=10; i+=2){
			sum+= i;
		}
		System.out.println("1���� 10���� ¦���� �� : " +sum);
	*/	
		
		
	/*	int i;
		int sum = 0;
		for(i=2, sum=0; i<=10; i+=2){
			sum+=i;
		}System.out.println(sum);
	*/	
		
		
		//���3 : 1���� 5���� �ϳ��� �����ϸ鼭 �ش� ���� 2�� ���� ���Ѵ�
	/*	int i;
		int sum = 0;
		for(i=1, sum=0; i<=5; i++){
			sum += i*2;
		}
		System.out.println("1���� 10���� ¦���� �� : " +sum);
	*/	
		
		
	/*	 �� ���� �ִ������� ���ϴ� �ڵ带 �ۼ��Ͻÿ�
		 �ִ����� = �� ���� ����� �� ���� ū �����
	   	 ����� = �� ���� ��� �߿��� �������� �� �ִ� ���
		 8 : 1 2 4 8
		 12 : 1 2 3 4 6 12
	 	 ����� : 1 2 4
		 �ִ����� 4         */	
		//i�� num1�� ����̰� i�� num2�� ����̸� (i�� num1�� num2�� ������̸�)
		//�������� (~�̸�)�� �������� ������ ���ǽ�, ������ ���๮�� �ȴ�
		//gcd�� i�� �����ϰ� �ݺ����� ����� �� gcd�� ����Ѵ�
		
		
		//�ִ������� ���ϴ� �ڵ�
	/*	int num1=8, num2=12;
		int i, gcd=1;
		for(i=1,gcd=0 ;i<=8 ;i++ ){
			if(num1%i==0 && num2%i==0){
				gcd = i ;
			}
		}
		System.out.println(num1+"�� "+num2+"�� �ִ� ����� : " + gcd);
	*/	
		
		
	
	/*	����) �� ���� ���μ����� �Ǻ��Ͻÿ�
		���μҶ� �� ���� �ִ������� 1�� �� �� ������ ���踦 ����
		3�� 7�� ���μ� ����
		4�� 6�� ���μ� ���谡 �ƴ�
	*/	
		
		
	/*	int num1 = 3, num2 = 11;
		int i, gcd=1;
		for(i=1,gcd=0; i<=3; i++){
			if(num1%i==0 && num2%i==0){
				gcd = i;
				
			}
		}if(gcd==1){
			System.out.println(num1+"�� " +num2+"�� ���μ� ����");
		}else{
				System.out.println(num1+"�� " +num2+"�� ���μ� ���谡 �ƴ�");
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
		
		
	/*	����) �� ���� �ּҰ������ ���ϴ� �ڵ带 �ۼ��Ͻÿ�
		�ּҰ������ �� ���� ����� �� ���� ���� �����
		������� �� ���� ��� �� �������� ������ ���
		10�� ��� : 10 20 30 40 50 60 .....
		15�� ��� : 15 30 45 60 75 90 .....
		10�� 15�� ����� : 30 60 90 120
		10�� 15�� �ּ� ����� : 30
	*/	
		
	/*	����
		���� ���� - num1, num2, i, lcm
		�ݺ� Ƚ�� : i�� 1���� nim1*num2���� �ϳ��� ����
		���๮
		i�� num1�� ����̰� i�� num2�� ����̸�
		lcm�� i�� �����ϰ� �ݺ����� �������´�
		�ݺ����� ����� �� lcm�� ����Ѵ�

	*/	
		
		
	/*	�ִ������� ���ϴ� ��
		int num1=10, num2=15;
		int i, lcm =1;
		for(i=1,lcm=0; i<=150; i++){
			if(i % num1 == 0 && i % num2 == 0){
				lcm = i;
				break;
			}
		}
		System.out.println(num1+ "�� " +num2+ "�� �ּҰ������" +lcm);		
	*/	
		
		
	/*	int num1=10, num2=15;
		int i, lcm =1;
		for(i=num1,lcm=0; i<=10000; i+=num1){
			if(i % num2 == 0){
				lcm = i;
				break;
			}
		}
		
		System.out.println(num1+ "�� " +num2+ "�� �ּҰ������" +lcm);
	*/	
		
	/*	int num1=3, num2=26;
		int i, lcm =1;
		int tmp;
		if(num2 > num1){
			//�� ���� �ٲ۴�
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
		System.out.println(num1+ "�� " +num2+ "�� �ּҰ������" +lcm);
	*/	
		
		
		//����) ������ 7���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
		
		
	/*	int i, num = 7;
		int res;
		for(i=1 ;i<=9 ; i=i+1){
			res = num*i;
			System.out.println(num+" X " + i + " = " + res);
		}
	*/	
				
		
		//����) �������� ��� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
	/*	int i;
		int num = 2;
		int res = 0;
		for(num=2; num<=9; num++){
			System.out.println(num + "��");
			for(i=1 ;i<=9 ; i=i+1){
				res = num * i;
				System.out.println(num+" X " + i + " = " + num*i);
			}
		}
	*/	
	
		
	/*	����) *�� ���� 6�� ���� 5�ٷ� ����Ͻÿ�
		int i = 0, j = 0;
		for(i=1; i<=6; i++){	//����
			for(j=1; j<=5; j++){	//����
				System.out.print("*");
			}
			System.out.println();
		}
	*/	
		
		
	/*	����) ������ ����Ͻÿ�
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
		
		
	/*	����) ������ ����Ͻÿ�
	 	     * i=1 ����=5 *=1
	 	    ** i=2 ����=4 *=2
		   *** i=3 ����=3 *=3
		  **** i=4 ����=2 *=4
		 ***** i=5 ����=1 *=5
		****** i=6 ����=0 *=6
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
		
		
	/*	����) ������ ����Ͻÿ�
		
			*       i=1 *=1   ����=5
		   ***	 	i=2 *=3   ����=4
		  *****		i=3 *=5   ����=3
		 *******	i=4 *=7   ����=2
		*********	i=5 *=9   ����=1
	   ***********	i=6 *=11 ����=0
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
		
	/*	����) ������ ����Ͻÿ�
	  
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
		
		
	/*	����) ������ ����Ͻÿ�
			
		*********** i=1 *=11  ����=0
		 ********* 	i=2 *=9   ����=1
		  ******* 	i=3 *=7   ����=2
		   *****	i=4 *=5   ����=3
		    ***	    i=5 *=3   ����=4
	   	     *     	i=6 *=1   ����=5
	
		
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
		
		

		
		
	/*	����) ������ ����Ͻÿ�

		****** i=1 *=6 ����=0
		 ***** i=2 *=5 ����=1
		  **** i=3 *=4 ����=2
		   *** i=4 *=3 ����=3
		    ** i=5 *=2 ����=4
		     * i=6 *=1 ����=5
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
		
		
	/*	����) ������ ����Ͻÿ�

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








