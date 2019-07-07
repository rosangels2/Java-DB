package day17_framework_baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Framework_example_baseball {

	public static void main(String[] args) {

		List<Integer> com = HashSet_Example_Lotto.randomArr(1, 9, 3);	//1. com의 번호를 List로 생성 -> randomArr메서드 호출
		List<Integer> user = new LinkedList<Integer>();					//정수값을 저장할 List의 객체 user를 LinkedList를 통해 생성한다
		System.out.println(com);										//랜덤으로 생성된 com을 출력한다
		
		int strike = 0;													
		int ball = 0;
		Scanner scan = new Scanner(System.in);
		while(strike<3){												//2. 3out이 나올 때까지 반복되는 반복문을 선언
			user.clear();												//다시 시작할 때 저장된 user의 값을 비워주고 다시 입력받는다
			user = inputNums(scan);										//inputNums 메서드를 호출하여 스캐너를 통해 3개의 값을 콘솔에서 입력받는다
			strike = countStrike(com, user);							// 스트라이크의 개수를 구한다
			ball = HashSet_Example_Lotto.countList(com, user) - strike;	//5. countList()를 호출하여 count를 계산한 뒤 스트라이크 개수를 빼서 볼의 개수를 구한다
			print(strike, ball);										//strike와 ball의 값을 출력한다
		}
		System.out.println("정답입니다.");
		System.out.println("게임을 종료합니다.");
		scan.close();
		
		
		
/*		예제)숫자 야구 게임
		선택된 중복되지 않은 1~9사이의 3개의 숫자를 선택하여 해당 숫자를 맞히는 게임
		스트라이크 : 자리수와 숫자가 일치하는 경우
		볼 : 해당 숫자는 있지만 자리수가 안맞는 경우
		쓰리아웃 : 일치하는 숫자가 없는 경우
		쓰리 스트라이크 : 전부 일치 -> 게임 종료
		예시) com - 1 3 9
		       나 - 1 2 3		2 4 5			4 3 9
			결과 - 1S 1B		 결과 - 3 Out		결과 - 2S
			결과 - 3 Out
			 
			 
		1. 중복되지 앟는 1~9사이의 숫자 3개를 랜덤으로 저장하는 메서드 구현 
		2. 두 객체의 숫자가 일치하는지 비교하는 메서드 구현
		2.1 객체가 일치하는 경우에 따라 결과를 출력하는 메서드 구현
		2.2 숫자와 번지가 같으면 S를 하나 증가
		2.3 숫자는 있지만 번지가 다르면 B를 하나 증가
		2.4 숫자가 없으면 3Out를 출력
		2.5 숫자와 번지가 모두 일치하면 게임을 종료 			 
			 
			 
		1. com의 번호를 List로 생성 -> randomArr메서드 호출
		2. 3out이 나올 때까지 반복되는 반복문 구현
		3. 숫자를 3개 입력받아 List에 저장
		4. 스트라이크 개수를 계산하는 메서드 구현
		5. countList()를 호출하여 count를 계산한 뒤 스트라이크 개수를 빼서 볼의 개수를 구한다
		6. 출력
*/
		
		
	}

	
	public static int countStrike(List<Integer> com, List<Integer> user){	//4. 스트라이크 개수를 계산하는 메서드 구현
		if(com.size() < user.size() || com.size() > user.size()){			//com과 user의 크기가 다를 경우 -1값을 반환한다						
			return -1;														
		}
		int strike = 0;
		for(int i=0; i<user.size(); i++){			//0번지부터 시작하므로 배열의 크기보다 작을 동안 실행문을 반복한다
			if(user.get(i).equals(com.get(i))){		//user.get(i)번지와 com.get(i)번지가 같은지 equals 메서드를 호출해서 비교하고
				strike++;							//두 객체의 같은 번지의 값이 같다면 strike를 하나 증가한다
			}
		}
		return strike;								//strike를 반환한다
	}
	
	public static void print(int strike, int ball){	//strike와 ball을 매개변수로 결과를 출력하는 메서드를 선언
		if(strike != 0){							//strike가 0이 아니라면
			System.out.println(strike + " Strike");	//strike를 출력한다
		}
		if(ball != 0){								//ball이 0이 아니라면
			System.out.println(ball + " Ball");		//ball을 출력한다
		}
		if(strike == 0 && ball == 0){				// strike와 ball이 0이라면
			System.out.println("3 Out");			//3out을 출력한다
		}
		System.out.println();
	}
	
	public static List<Integer> inputNums(Scanner scan){	//스캐너를 통해 입력받은 정수를 List의 객체에 저장하는 메서드를 선언
/*		Set<Integer> set = new HashSet<Integer>();	//자동 정렬이 돼버려서 주석처리
		while(set.size() < 3){
			int num = scan.nextInt();
			set.add(num);
		}
		Iterator<Integer> it = set.iterator();
		List<Integer> list = new LinkedList<Integer>();
		while(it.hasNext()){
			list.add(it.next());
		}
*/		List<Integer> list = new LinkedList<Integer>();		//정수값을 가지는 List의 객체 list를 LinkedList를 통해 생성한다
		while(list.size() < 3){								//list의 크기가 3보다 작은 동안 실행문을 실행한다
			int num = scan.nextInt();						//정수 num을 스캐너를 통해 콘솔에서 입력받는다
			list.add(num);									//list에 add메서드를 통해 콘솔에서 입력받은 정수 num을 저장한다
		}
		
		return list;										//list의 값을 반환한다
	}
}
