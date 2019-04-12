package day13;

public class class_forExample1 {

	public static void main(String[] args) {
		
		//문제1)구구단 전체를 출력하는 코드를 작성하시오
/*		int i=0, j=0;
		for(i=2; i<=9; i++){
			for(j=1; j<=9; j++){
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
*/		

		
		//문제2)다음 배열의 모든 값을 출력하는 코드를 작성하시오
		
		int arr[] = new int[]{1,3,5,7,9,2,4,6,8};
		//방법1)향상된 for문
		for(int tmp : arr){
			System.out.print(tmp+" ");
		}System.out.println();
		
		//방법2)for문
		for(int i=0; i<arr.length; i++){	//for(int tmp : arr){}
			int tmp = arr[i];
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		
/*		향상된 for문 사용 조건
		1. 배열이나 컬렉션 프레임워크일 때 사용
		2. 배열의 값을 확인할 때 사용
		3. 배열의 값을 수정할 때는 사용하지 않음
		4. 무조건 모든 배열을 확인하면서 번지를 신경쓰지 않는다
*/		
		
		//문제3)위의 배열에서 짝수번지에 있는 값을 출력하시오
		for(int i=0; i<arr.length; i+=2){	//향상된 for문은 배열 전체의 값을 출력하기 때문에 부분적으로 수정이나 출력할 수 없다
			int tmp = arr[i];
			System.out.print(tmp+" ");
		}
		System.out.println();
		

		//문제4)위의 배열에서 가장 큰 수를 출력하시오
		//방법1)향상된 for문
		int max = arr[0];	//일반적으로 최대값과 최소값을 구할 때 배열의 0번지값을 넣는다(배열 외의 값을 입력시 배열의 값을 저장하지 못할 수 있기 때문) 
		for(int tmp : arr){
			if(max < tmp){
				max = tmp;
			}
		}
		System.out.println("배열의 최대값 : "+max);
				
		//방법2)for문
		for(int i=0; i<arr.length; i++){
			int tmp = arr[i];
			if(max < tmp){
				max = tmp;
			}
		}
		System.out.println("배열의 최대값 : "+max);
		
		
			
		
		
		
		
		
		
		
	}

}
