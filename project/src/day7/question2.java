package day7;

public class question2 {

	public static void main(String[] args) {

	//	2. 5개짜리 배열을 생성하고 배열의 0번지에 5, 1번지에 4, 2번지에 3, 3번지에 2, 4번지에 1을 저장하고 출력하는 코드를 작성

		
		//방법1)
/*		int []arr = new int[5];
		arr[0]=5;
		arr[1]=4;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		for(int tmp:arr){
			System.out.println(tmp +" ");
		}
*/		
		
		
		//방법2)
/*		int []arr2 = new int[]{5,4,3,2,1};
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i] + " ");
		}
*/		
		
		
		//방법3)
/*		int []arr3 = new int[5];
		for(int i=0; i<arr3.length; i++){
			arr3[i] = arr3.length - i;
		}
		for(int tmp : arr3){
			System.out.print(tmp + " ");
		}
*/		
		
		
		
		
		

	}

}
