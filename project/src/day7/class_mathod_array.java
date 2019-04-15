package day7;

import java.util.Scanner;

public class class_mathod_array {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
		printArr(arr);
		
		
			
	}
	
	
	
/*	기능 : 배열을 num로 초기화하는 메서드
	매개변수 : 배열, num => int[] arr, int num
	리턴타입 : 없다 => void
	메서드명 : initArr
*/	
	public static void initArr(int[] arr, int num){
		//arr = new int[10]; - 해당 코드 주입시 새로운 번지수의 10개의 번지를 생성하여 원본이 변하지 않는다
		for(int i=0; i<arr.length; i++){
			arr[i] = num;
		}
	}
	
	
	
/*	기능 : 
	매개변수 : 배열 => int[] arr
	리턴타입 : 
	메서드명 : printArr
*/	
	public static void printArr(int[] arr){
		for(int tmp:arr){
			System.out.print(tmp + " ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	

}
