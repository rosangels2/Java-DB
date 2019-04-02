package project;

public class day6f {

	public static void main(String[] args) {
		
/*		기능 : 최소값(min)과 최대값(max)가 주어지면 최소값과 최대값 사이의 임의의 정수를 알려주는 메서드
 		매개변수 : 최소값, 최대값 => int min, int max
		리턴타입 : 임의의 정수 => 정수 => int
		메서드명 : random	  
		
*/
		//랜덤한 수를 생성하는 메서드가 제대로 작동되는지 확인하는 코드
/*		int min = 1, max = 10;
		System.out.println(random(min,max));	*/

		//배열 안에 입력한 값이 있는지 확인하는 코드
/*		int max = 10, min = 1;
		int r = random(min,max);
		int []arr = new int[]{1,2,3,4,5,6,7};
		System.out.println(r);
		System.out.println(search(arr, r, arr.length));
*/
		int max = 45, min = 1; //max가 7보다 작으면 배열 생성에 실패
		int r = random(min,max);
		int []arr = new int[7]; //int []arr = null;이면 배열 생성에 실패
		int []arr2 = new int[6]; //6까지의 배열 추가 생성 변수 선언
		if(createRanArr(min, max, arr)){
			printArr(arr);
		}else{
			System.out.println("배열 성공에 실패");
		}
		if(createRanArr(min, max, arr2)){ //6까지의 배열 추가 생성 코드
			printArr(arr2);
		}else{
			System.out.println("배열 성공에 실패");
		}

		
	}

	//랜덤한 수를 생성하는 메서드
	public static int random(int min, int max){
		return (int)(Math.random()*(max-min+1)+min);
		
	}
	
	//방법1)
/*	public static int random(int min, int max){
			if(min>max){	//min과 max의 순서가 바뀌어도 실행 가능
			int tmp = min;
			min = max;
			max = tmp;		
		}		
		
		return (int)(Math.random()*(max-min+1)+min);
				
	}
*/
	
	//방법2)
/*	public static int random(int min, int max){
	return (int)(Math.random()*(max-min+1)+min);
	}
*/	

	
/*	기능 : 배열에 검색할 숫자가 있는지 없는지 확인하는 메서드
	매개변수 : 검색할 숫자, 배열 => int[] arr, int num
	리턴타입 : 있는지(true), 없는지(false) => boolean
	메서드명 : search
*/	
	//원하는 숫자가 있는지 검색하는 메서드
	public static boolean search(int []arr, int num, int cnt){
		if(arr == null){ //배열이 안만들어져 있으면 false로 저장
			return false;
		}
		if(cnt > arr.length){ //배열의 크기보다 더 많이 검색하려는 경우
			cnt = arr.length;
		}
		for(int i=0; i<cnt; i++){
			if(arr[i] == num){
				return true;
			}
		}
		return false;
	}
	
/*	기능 : 최소값과 최대값, 배열이 주어지면 중복되지 않은 랜덤한 수(min~max)로 배열을 채우는 메서드
	매개변수 : 최소값, 최대값, 배열 => int min, int max, int []arr
	리턴타입 : boolean(배열을 채웠는지 못채웠는지 여부 확인)
	메서드명 : createRandArr
*/	
	public static boolean createRanArr(int min, int max, int []arr){
		if(arr == null){
			return false;
		}
		if(max-min+1 < arr.length){ //만들 수 있는 랜덤한 수보다 배열이 더 클 경우 실패로 입력
			return false;
		}
		int cnt = 0;
		while(cnt <arr.length){
			int r = random(min,max);
			if(!search(arr, r, cnt)){ //arr에 r이 없으면
				arr[cnt] = r;
				cnt++;				
			}
		}
		return true;		
	}
	
	
/*	기능 : 배열이 주어지면 배열의 모든 원소값을 콘솔에 출력하는 메서드
	매개변수 : 배열 => int []arr
	리턴타입 : 필요없음 => void
	메서드명 : printArr
*/	
	public static void printArr(int []arr){
		System.out.print("[ ");
		for(int tmp:arr){
			System.out.print(tmp + " ");
		}
		System.out.print(" ]\n"); //\n = 엔터와 같은 역할
	}
	
	
	
	
	
	
	
	
		
		
		
}