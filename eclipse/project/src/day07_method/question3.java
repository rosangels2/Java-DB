package day07_method;

public class question3 {

	public static void main(String[] args) {

//		3. 50이하의 소수를 출력하는 코드를 작성	
			int num = 0;
			int cnt, i;
			for(num=1; num<=50; num++){
				for(i=1, cnt=0; i<=num; i++){
					if(num%i==0){
						cnt++;
					}
				}if(cnt==2){
					System.out.print(num+" ");
				}
			}

		
		
	}

}
