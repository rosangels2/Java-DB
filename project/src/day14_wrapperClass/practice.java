package day14;

public class practice {

	public static void main(String[] args) {
		
		//문제1)구구단 전체를 출력하는 코드 작성
		//ixj = i*j를 1부터 9까지 반복
		//2단
		//2단부터 9단
		int i, j;
		for(i=2; i<=9 ; i++){
			for(j=1; j<=9; j++){
				System.out.println(i+" x "+j+" = "+i*j);
			}System.out.println();
		}	
		
		//문제2)다음 배열의 모든 값을 출력하는 코드를 작성하시오
		
		int arr[] = new int[]{1,3,5,7,9,2,4,6,8};
		
		for(int tmp : arr){
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		for(i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(i=0; i<arr.length; i++){
			int tmp = arr[i];
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		
		//문제3)위의 배열에서 짝수번지에 있는 값을 출력하시오
		for(i=0; i<arr.length; i+=2){
			int tmp = arr[i];
			System.out.print(tmp+" ");
		}
		
	}

}	
