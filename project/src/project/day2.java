package project;

import java.util.Scanner;

class day2 {
	public static void main(String[] args) {
		
		/*Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean isEven = num%2==0 ? true:false;
		System.out.println(isEven);*/
		
		//����1)num�� ¦�����(���ǹ�) �ֿܼ� ¦����� ����ض�(���๮)
		/*int num = 10;
		if(num % 2 == 0){
			System.out.println("¦��");
		}*/
		
		//����2)num�� Ȧ�����(���ǹ�) �ֿܼ� Ȧ����� ����ض�(���๮)
		/*int num = 10;
		if(num1 % 2 == 1){
			System.out.println("Ȧ��");
		}*/
		
		//if(num % 2 == 0); -> ; ���� ; ���ʸ� ���ǹ����� �ν�
		
		
		
		
		//����3)num�� ¦�����(���ǹ�) �ֿܼ� ¦����� ����ض�(���๮)
				/*int num = 11;
				if(num % 2 == 0){
					System.out.println("¦��");
				}
				
				//���� ���ǽ��� �����̸�
				else{
					System.out.println("Ȧ��");
				}
				*/
				//if(num % 2 == 0); -> ; ���� ; ���ʸ� ���ǹ����� �ν�
		
		
		//����4) ���̰� 20 �̻��̸� �����̶�� ����ϰ� �ƴϸ� û�ҳ��̶�� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
		/*Scanner scan = new Scanner(System.in);
				int age = scan.nextInt();
		if(age >= 20){
			System.out.println("����");
		}
		
		else{
			System.out.println("û�ҳ�");
			scan.close();
		}*/
		
		
		/*int age = 34;
		if(age >= 20){
			System.out.println("����");
		}
		
		//���� ���ǽ��� �����̸�
		else{
			System.out.println("û�ҳ�");
		}*/
		
		
		/*����)num�� 0�̸� 0�̶�� ����ϰ�, 1�̸� 1�̶��  ����ϰ�
		0�� 1�� �ƴϸ� 0�� 1�� �ƴմϴٶ�� ����϶�*/
		
		/*int num = 0;
		if(num == 0){
			System.out.println("0�Դϴ�.");
		}else if(num == 1){
			System.out.println("1�Դϴ�.");
		}else{
			System.out.println("0�� 1�� �ƴմϴ�.");
		}*/
		
		
		/*����)num�� 2�� ����̸� 2�� ������ ����ض�
		2, 4, 6, 8, 10, ...
		num�� 2�� �������� �� �������� 0�� ���ٸ� 2�� ���*/
		
		/*int num = 3;
		if(num num�� 2�� �������� �� �������� 0�� ����){
			2�� ������ ���;
		}*/
		
		/*int num = 4;
		if(num % 2 == 0){
			System.out.println(num + "�� 2�� ���");
		}*/
		
		
		/*num�� 2�� ����̸� 2�� ������ ����ϰ�
		num�� 3�� ����̸� 3�� ������ ����ϰ�
		num�� 6�� ����̸� 6�� ������ ����ϰ�
		num�� 2, 3, 6�� ����� �ƴϸ� 2, 3, 6�� ����� �ƴմϴٶ�� ����϶�
		num = 6 -> 6�� ����Դϴٸ� ���*/
		
		
		/*int num = 6;
		if(num % 6 == 0){
			System.out.println("6�� ����Դϴ�.");
		}else if(num % 3 == 0){
			System.out.println("3�� ����Դϴ�.");
		}else if(num % 2 == 0){
			System.out.println("2�� ����Դϴ�.");			
		}else{
			System.out.println("2, 3, 6�� ����� �ƴմϴ�.");
		}*/
		// ����� ��ĥ �� ū ����� ���� �Է��Ѵ�
		
		
		/*int num = 12;
		if(num % 2 == 0 && num % 3 != 0){
			System.out.println("2�� ����Դϴ�.");
		}else if(num % 3 == 0 && num % 3 != 0){
			System.out.println("3�� ����Դϴ�.");
		}else if(num % 6 == 0){
			System.out.println("6�� ����Դϴ�.");			
		}else{
			System.out.println("2, 3, 6�� ����� �ƴմϴ�.");
		}*/
		
		
		
		/*����)������ �־����� ������ �´� ������ ����ϴ� �ڵ带 �ۼ��Ͻÿ�
			90�� �̻� ~ 100�� ���� = A
			80�� �̻� ~ 90�� �̸� = B
			70�� �̻� ~ 80�� �̸� = C
			60�� �̻� ~ 70�� �̸� = D
			0�� �̻� ~ 60�� �̸� = F
			0�� �̸�, 100�� �ʰ� : �߸��� �����Դϴ�.*/
		
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
					System.out.println("�߸��� �����Դϴ�.");
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
						System.out.println("�߸��� �����Դϴ�.");
					}*/
		
		/*if((int)num/10 == 9 || num == 100)
		 10�� �ڸ��� ������ ���ؼ� ���� ���*/
		
		/*	int num = 12;
		if(num % 2 == 0 && num % 3 == 0){
			System.out.println(num + "�� 6�� ���");
		}


		int num1 = 12;
			if(num % 3 == 0){
				System.out.println(num + "�� 6�� ���");
			}
		*/
		
		/*
		int num = 12;
		if(num % 2 == 0){
			if(num % 3 == 0)
			System.out.println(num + "�� 6�� ���");
		}

		if(num % 2 == 0 && num % 3 == 0){
			System.out.println(num + "�� 6�� ���");
		}
		*/
		
		
		
/*		int num = 4;
		switch(num%2){
		case 0: //if(num % 2 == 0)
			System.out.println("¦��");;
			break;
		case 1: 
			System.out.println("Ȧ��");;
			default:
		
			
		}
		*/
		
		
	/*	
	����) �޷��� �� �޸��� ������ �ϼ��� �ٸ���.
	���� �ԷµǸ� �ش��ϴ� ���� ������ �ϼ��� ����ϴ� �ڵ带 switch case���� �̿��Ͽ� �ۼ��϶�
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
		case 12:System.out.println("31��"); break;
		case 4:
		case 6:
		case 9:
		case 11:System.out.println("30��"); break;
		case 2:System.out.println("31��"); break;
		default:
			System.out.println("�߸� �Է��߽��ϴ�.");
		*/
		
	/*	�������� ���ϴ� ������ ����(a~b)�� ����� ���
		 - System.out.println(Math.random());	
		 a <= Math.random()*(b-a+1) + a < (b+1)
	 */
		
	/*	����) ���������� ����
		int min = 1;
		int max = 3;
		//com�� ����(1), ����(2), ��(3) �߿��� �������� �ϳ� ����
		int com = (int)(Math.random()*(max-min+1) + min);		
		int user = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���. ");
		user = scan.nextInt();
		switch(user-com){
		case 2: case -1:
			System.out.println("����� �����ϴ�.");
			break;
		case 1: case -2:
			System.out.println("����� �̰���ϴ�.");
			break;
		case 0: //default�� ������ case ��ü ����
			System.out.println("�����ϴ�.");
		}
	*/	
		
		
	/*	System.out.println(com); 
		Ȯ�ο� �׽�Ʈ    */
		 
		//����) Hello world!�� 5�� �ݺ�
		
	/*	�ݺ��� �� ���Ǵ� �ڵ� for(i=1; i<=5; i=i+1){
			���๮;
		}	*/
		
	/*	int i = 0; // �ݺ������� ����� ����
		for(i=1; i<=5; i=i+1){
			System.out.println("Hello world!");
		}
		
		int i = 0; // �ݺ������� ����� ����
		for(i=1; i<=5; i++){
			System.out.println("Hello world!");
		}
	*/	
		
		
		
	/*	����) 1���� 5��������ϴ� �ڵ带 �ݺ����� ���� �ۼ��Ͻÿ�
		int i = 0;
		for(i=1; i<=5; i=i+1){
			System.out.println(i);
		}
	*/	
		
		
	/*	����) 1���� 10������ ���� �ݺ����� ���� ����Ͻÿ�
		sum = 0
				sum = 0 + 1; i = 1
				sum = 0 + 1 + 2; i=2
				sum = 0 + 1 + 2 + 3; i=3
				....
				sum = 0 + 1 + 2 + 3 + ... + 9 + 10; i=10

				sum = sum + i;
	*/	
		
	/*	 ���� ���� ����ϴ� �ڵ� sum = sum + i;
							sum += i;
	*/	
		
	/*	int i = 0;
		int sum = 0;
		for(i=1, sum=0; i<=10; i=i+1){
			sum += i;
		}
		System.out.println("1���� 10������ �� : " + sum);
	*/	
		
		
	/*	//����) �������� 7���� ����ϴ� �ڵ带 �ݺ����� �̿��Ͽ� �ۼ��Ͻÿ�
		
		int i = 0;
		int num = 5; //num�� ���� �ٲٸ� �ٸ� ���� ������ ��� ����
		for(i=1; i<=9; i=i+1){
			System.out.println(num+" x " + i +" = " +  num*i);
		}
	*/		
		
		
		//����) ������ �Է¹޾� �Է¹��� ������ �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ݺ����� �̿��Ͽ� �ۼ��Ͻÿ�
		//�Ҽ� : ����� 1�� �ڱ� �ڽ��� ��(����� 2���� ��)
		//��� : ������ �������� �� (4�� ��� = 1, 2, 4)
		
	/*	int num, i, cnt;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		for(i=1, cnt=0 ;i<=num ; i++){
			//i�� num�� ����̸� ����� ������ �ϳ� ����
			//num�� i�� �������� �� �������� 0�� ���� => i�� num�� ���
						if(num % i == 0){
				cnt++;//ctn +=1 //cnt+1; //++cnt
			}
		}
		//����� ������ 2���̸� �Ҽ���� ���
		if(cnt == 2){
			System.out.println(num+"�� �Ҽ�");
		}
		//2���� �ƴϸ� �Ҽ��� �ƴ��̶�� ���
		else{
			System.out.println(num+"�� �Ҽ��� �ƴ�");
		}
	*/	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

