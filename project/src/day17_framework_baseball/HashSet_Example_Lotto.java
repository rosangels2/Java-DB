package day17_framework_baseball;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSet_Example_Lotto {

	public static void main(String[] args) {

		//1. 번호들을 생성
		//1.1 로또 당첨번호를 생성(7자리)
		//1.2 로또 자동번호를 생성(6자리)
		//2. 당첨번호와 자동번호를 비교해서 등수를 판별
		//2.1 당첨번호와 자동번호를 비교하여 일치하는 개수 확인
		//2.2 보너스번호와 일치하는지 확인
		//2.3 등수 출력
		
		int min = 1, max = 10;								//변수 min, max를 선언
		List<Integer> lotto = randomArr(min,max,7);			//randomArr메서드를 통해 min, max의 범위와 7개의 크기를 가지는 List의 정수형 객체 lotto를 생성
		List<Integer> auto = randomArr(min,max,6);			//randomArr메서드를 통해 min, max의 범위와 6개의 크기를 가지는 List의 정수형 객체 auto를 생성
		System.out.println(lotto);							//랜덤으로 생성된 값이 저장된 List의 객체 lotto의 값을 출력한다
		System.out.println(auto);							//랜덤으로 생성된 값이 저장된 List의 객체 auto의 값을 출력한다
		System.out.println(countList(lotto, auto));			//countList 메서드를 이용해 매개변수인 List lotto와 List auto의 중복되는 개수를 출력한다
		printRank(lotto, auto);								//printRank 메서드를 통해 중복되는 개수에 따라 당첨 등수를 출력한다
	}
	
/*		기능 : min, max가 주어지면 해당 범위에서 중복되지 않는 랜덤한 수를 count 개수만큼 생성하여 리스트로 변환
		매개변수 : int min, int max, int count
		리턴타입 : List
		메서드명 : randomArr
*/	
	public static List<Integer> randomArr(int min, int max, int count){	//매개변수 min, max, count를 통해 랜덤한 수를 생성하는 메서드 선언
		if(max-min+1 < count){								//생성할 수 있는 숫자의 범위보다 많은 범위를 생성하면 중복이 생길 수밖에 없기 때문에 무한루프가 발생하는 걸 방지
			return null;									//무한루프가 발생할 수 있는 상황이면 null값을 저장한다
		}
		Set set = new HashSet();							//중복이 안되는 Set의 객체를 HashSet클래스를 통해 생성 
		while(set.size() < count){							//set의 크기가 count보다 작을 때까지 랜덤한 수를 생성
			int num = (int)(Math.random()*(max-min+1))+min;	//num에 랜덤한 수를 생성해서 저장
			set.add(new Integer(num));						//set에 정수형 wrapper클래스의 값 num을 저장한다(Set는 중복되면 저장하지 않는다)
		}
		List<Integer> list = new LinkedList<Integer>(set);	//List의 정수형 객체 list를 정수형 LinkedList 클래스의 객체 set의 값으로 생성한다
		return list;										//list의 값을 반환한다
	}	//Set으로 저장돼 있는 데이터들을 List 데이터들로 변환
	 	//->Set에는 원하는 번지에 직접 접근할 수 있는 메서드가 없어서 복잡해지기 때문에 List로 변환하여 List의 get()메서드를 사용하여 값을 직접 저장
	
	
/*		기능 : 로또 당첨번호들과 자동번호들이 주어지면 보너스 번호를 제외하고 일치하는 개수가 몇 개인지 알려준다	
		매개변수 : 당첨번호들 -> List<Integer> lotto
				 자동번호들 -> List<Integer> list
		리턴타입 : 일치하는 개수 -> int
		메서드명 : countList
*/	
		public static int countList(List<Integer> lotto, List<Integer> auto){	//매개변수 List 2개가 주어지면 일치하는 개수를 확인하는 메서드를 선언
			if(lotto.size() < auto.size() || lotto.size() > auto.size()){									//당첨번호의 크기가 자동번호보다 작거나 같다면
				return -1;														//-1을 출력해서 잘못됐음을 알린다
			}
			
			int count = 0;
			for(int i=0; i<auto.size(); i++){		//2등 당첨번호인 lotto의 마지막 값을 제외하기 위해 i<auto.size()를 조건식으로 사용한다
				if(auto.contains(lotto.get(i))){	//2등 당첨번호를 제외한 lotto값을 하나씩  auto와 비교한 뒤 결과가 true면 
					count++;						//count를 하나 증가시킨다
				}
			}
			return count;							//반복문이 종료되면 count를 반환한다
		}
	
		public static void printRank(List<Integer> lotto, List<Integer> auto){	//countList메서드에서 얻은 count의 값을 통해 등수를 출력한다
			int count = countList(lotto, auto);				//countList를 호출해 count를 반환한다					
			int rank = 0;									//rank의 기본값을 0으로 초기화한다
			int bonusNum = lotto.get(lotto.size()-1);		//보너스 번호
			boolean checkBonus = auto.contains(bonusNum);	//보너스 번호와 일치하는 번호가 있는지 없는지 확인
			switch(count){									//count의 값에 따라 케이스문을 실행한다
			case 6 : rank=1; break;
			case 5 : rank=checkBonus?2:3; break;			//checkBonus가 true면 2를, false면 3을 저장한다
			case 4 : rank=4; break;
			case 3 : rank=5; break;
			default : rank=-1;								//나머지 값이 오면 rank에 -1를 반환한다
			}
			if(rank>0){										//rank가 0보다 크면 해당 등수를 출력한다
				System.out.println(rank+"등 당첨!");
			}else{											//rank가 0보다 작거나 같다면 꽝을 출력한다
				System.out.println("꽝!");
			}
		}
	
}
