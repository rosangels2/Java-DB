package day6;

public class lotto {

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

		int r2 = rank(arr,arr2);
		printRank(r2);

		
		
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
		if(arr == null){ //null = 배열이 매개변수로 선언만 되고 생성이 안된 경우
			return false;
		}
		if(max-min+1 < arr.length){ //만들 수 있는 랜덤한 수보다 배열이 더 클 경우 중복될 수밖에 없어 실패로 입력
			return false;
		}
		int cnt = 0; // 배열에 저장된 랜덤한 숫자의 개수
		while(cnt <arr.length){//배열의 갯수만큼 저장되면 반복문을 종료
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
	
	
/* 		당첨 횟수를 출력하는 코드를 작성하시오
		1등 : 보너스 번호를 제외한 번호 6개가 일치
		2등 : 보너스 번호를 포함한 번호 6개가 일치
		3등 : 보너스 번호를 제외한 번호 5개가 일치
		4등 : 보너스 번호를 제외한 번호 4개가 일치
		5등 : 보너스 번호를 제외한 번호 3개가 일치
		꽝 : 2개 이하
		
		
		기능 : 주어진 두 배열에 같은 수가 몇 개 있는지 알려주는 메서드 
		매개변수 : 두 배열, 등수 => int[] arr1, int[] arr2
		리턴타입 : 갯수 => int
		메서드명 : compareArr
*/		
		
		public static int compareArr(int[] arr1, int[] arr2){
			int cnt = 0; // 두 배열의 원소 중 일치하는 개수
			int size = 0; //두 배열 중 작은 배열의 길이를 저장
			if(arr1.length>arr2.length){
				size = arr2.length;
			}else{
					size = arr1.length;
				}
			for(int i=0; i<size; i++){	// 두 배열에서 일치하는 원소의 개수를 구하는 과정
				if(search(arr2,arr1[i],size)){
					cnt++;
				}	
			}	
			return cnt;
			
			
		}
		
/*		기능 : 당첨배열과 자동생성배열이 주어지면 몇 등인지 알려주는 메서드(단, 꽝은 -1)
		매개변수 : 두 배열 => int[] lotto, int[] auto
		리턴타입 : 등수 => int
		메서드명 : rank
*/
		
		public static int rank(int[] lotto, int[] auto){
			int cnt = compareArr(lotto, auto);
			switch(cnt){
			case 6 : return 1;
			case 5 : 
			/*	switch(contain2(auto,lotto[lotto.length-1],auto.length)){
				case -1; return 3;
				defaul:; return 2;	
				}*/
				if(search(auto,lotto[lotto.length-1],auto.length))
					 return 2;
				else
					 return 3;
			case 4 : return 4;
			case 3 : return 5;
			default: return -1;
			}		
		}
		public static void printRank(int r){
			if(r == -1){
				System.out.println("꽝");
			}else{
				System.out.println(r+"등");
			}
		}
			
	/*	public static int contain2(int[] arr, int num, int cnt){
			if(arr == null){
				return -1;
			}
			if(cnt > arr.length){ //배열의 크기보다 더 많이 검색하려고 하는 경우
				cnt = arr.length;
			}
			for(int i=0; i<cnt; i++){
				if(arr[i] == num){
					return i;
				}
			}
		}
*/		
		
		//원하는 숫자가 있는지 검색하는 메서드
/*		public static boolean search(int []arr, int num, int cnt){
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
*/
	
	
	
		
}