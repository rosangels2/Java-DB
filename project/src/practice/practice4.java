package practice;

import java.util.*;

public class practice4 {

	public static void main(String[] args) {
		
/*		Card class 기능 : 카드 1장의 정보를 나타내는 클래스
		CardPack class 기능 : 카드 1팩의 정보를 나타내는 클래스 52장의 1팩

		- 기능
		CardPack() : 새로운 카드팩을 생성하고 카드팩 섞음
		cardPackSetAll() : 새로운 카드팩을 만드는 메서드
		cardPackSet : 모양이 주어지면 해당 모양의 1번 카드부터 k카드까지 팩에 추가
		show() : 현재 카드팩 내용을 보여주는 메서드
		shuffle() : 카드팩을 섞는 메서드
		give() : 카드팩에서 한장을 꺼내는 메서드
*/



		//user 와 dealer 를 생성해서 user와 dealer에게 카드 7장씩 나눠주는 코드



		//카드 나눠주는 규칙
/*		- 우선 3장을 받고 한장을 공개한 후, 공개한 카드의 숫자가 더 큰 사람에게 먼저 나눠준다.
		- 숫자가 동일한 경우 스페이스 > 다이아 > 하트 > 클로버순이다.
		- 다음 카드는 마지막에 받은 카드를 기준으로 다시 순서를 정한다.
*/

/*		포커규칙
 * 		숫자가 동일한 경우 스페이스 > 다이아 > 하트 > 클로버 순서다
		탑 : 아래 중 만족하는 경우가 하나도 없는 경우
		원페어 : 숫자가 같은 카드가 2장이고 한셋인 경우
		투페어 : 숫자가 같은 카드가 2장이고 두셋인 경우
		트리플 : 숫자가 같은 카드가 3장이고 한셋 이상인 경우
		스트레이트 : 연속된 숫자가 5장 이상인 경우 예)1~5
		백스트레이트 : 1부터 시작하여 5까지 스트레이트
		마운틴 : 10에서 시작하여 1까지 스트레이트
		플러쉬 : 같은 모양의 카드가 5장 이상인 경우
		풀하우스 : 트리플+원페어, 트리플 2개
		포커 : 숫자가 같은 카드가 4장인 경우
		스트레이트 플러쉬 : 모양이 같은 5장의 카드가 숫자가 연속적인 경우
*/		
		
		
/*		Card c = new Card();
		c.setForm("C");
		c.setNum(5);
		System.out.println(c);
*/	
		
/*		CardPack cp = new CardPack();
		ArrayList<Card> user = new ArrayList<Card>();
		ArrayList<Card> dealer = new ArrayList<Card>();
		for(int i=1; i<=7; i++){
			user.add(cp.give());
			dealer.add(cp.give());
		}
*/		

		
/*		cp.shuffle();			//카드 섞기
		cp.show();				//카드팩 확인
		System.out.println();
		cp.give();				//카드 분배
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.show();				//카드팩 확인
*/	
		
/*		System.out.println(user);
  		System.out.println(PockerRule.pare(user));	//pare 확인
		System.out.println(dealer);
		System.out.println(PockerRule.pare(dealer));
*/

/*		System.out.println(user);
  		System.out.println(PockerRule.triple(user));	//triple 확인
		System.out.println(dealer);
		System.out.println(PockerRule.triple(dealer));
*/
		
/*		System.out.println(PockerRule.straight(user));	//straight 확인
		System.out.println(user);
		System.out.println(PockerRule.straight(dealer));
		System.out.println(dealer);
*/		
		
		boolean s1 = false, s2 = false;		//객체의 결과가 나올 때까지 반복해서 카드를 뽑고 실행 횟수를 알려주는 반복문
		int cnt = 0;						
//		while( !(s1 || s2)){				//s1이나 s2에 적용한 결과가 나올 때까지 반복문을 반복한다
			CardPack cp = new CardPack();
			ArrayList<Card> user = new ArrayList<Card>();
			ArrayList<Card> dealer = new ArrayList<Card>();
			for(int i=1; i<=7; i++){		//7장의 카드를 user와 dealer에게 나눠주는 반복문
				user.add(cp.give());
				dealer.add(cp.give());
			}
			//System.out.println(PockerRule.pare(user));
			//s1 = PockerRule.straight(user) > 1;
			//s1 = PockerRule.flush(user) != null;
			//s1 = PockerRule.fullHouse(user);
			//s1 = PockerRule.poker(user);
			//s1 = PockerRule.straightFlush(user) > 0;
			//s1 = PockerRule.top(user);
			//System.out.println(s1);
			//System.out.println(PockerRule.result(user));	

			//System.out.println(PockerRule.pare(dealer));
			//s2 = PockerRule.straight(dealer) > 1;
			//s2 = PockerRule.flush(dealer) != null;
			//s2 = PockerRule.fullHouse(dealer);
			//s2 = PockerRule.poker(dealer);
			//s2 = PockerRule.straightFlush(dealer) > 0;
			//s2 = PockerRule.top(dealer);
			//System.out.println(s2);
			//System.out.println(PockerRule.result(dealer));
			//cnt++;
			
			if(PockerRule.fight(user,dealer) == 1){		//fight의 결과가 1이면
				System.out.println("유저 점수 : "+PockerRule.result(user)+" / 딜러 점수 : "+PockerRule.result(dealer)+" 이므로 유저 승리.");
			}else if(PockerRule.fight(user,dealer) == 2){	//fight의 결과가 2이면
				System.out.println("유저 점수 : "+PockerRule.result(user)+" / 딜러 점수 : "+PockerRule.result(dealer)+" 이므로 딜러 승리.");
			}else{ //fight의 결과가 0이면
				System.out.println("유저 점수 : "+PockerRule.result(user)+" / 딜러 점수 : "+PockerRule.result(dealer)+" 이므로 무승부.");
			}
			System.out.println("유저 : "+user);
			System.out.println("딜러 : "+dealer);
		//}
		//System.out.println(cnt);

	}

}

class PockerRule{		//포커의 룰을 적용하는 클래스
	private static int sameCnt(ArrayList<Card> list, int count){	//list와 숫자를 입력받아 계산하는 메서드
		int sCnt = 0;	//페어의 개수
		for(int i=0; i<list.size(); i++){	//0번지부터 마지막번지까지 반복
			int cnt = 0;	//같은 숫자의 개수
			for(int j=0; j<list.size(); j++){	//0번지부터 마지막번지까지 비교
				if(list.get(i).getNum() == list.get(j).getNum()){	//list의 i번지와 list의 j번지의 숫자가 같으면
					cnt++;	//cnt를 증가
				}
			}
			if(cnt == count){	//자기 자신도 계산해서 cnt가 2이면 페어가 1개 존재, cnt가 3이면 트리플이 1개 존재
				sCnt++;			//입력한 count만큼 cnt가 증가하면 sCnt를 하나 증가
			}
		}
		return sCnt/count;		//비교한 대상도 다시 비교하기 때문에 sCnt를 count로 나눈뒤 반환
	}
/*		기능 : 페어를 찾는 메서드
		매개변수 : 카드 리스트
		리턴타입 : 0 -> 페어 없음, 1 -> 원페어, 2 : 투페어(페어가 2개 이상)
		메서드명 : pare
*/	
	public static int pare(ArrayList<Card> list){	//pare 개수를 계산하는 메서드
		return sameCnt(list,2);		//sameCnt에 2를 입력해서 계산한 뒤 반환
	}
	public static int triple(ArrayList<Card> list){	//triple의 개수를 계산하는 메서드
		return sameCnt(list,3);		//sameCnt에 3을 입력해서 계산한 뒤 반환
	}
	public static boolean poker(ArrayList<Card> list){	//poker가 존재하는지를 계산하는 메서드
		if(sameCnt(list,4) == 1){	//카드는 총 7장이기 떄문에 포커는 1개만 존재할 수 있다
			return true;
		}
		return false;
	}
/*	스트레이트 : 연속된 숫자가 5장 이상인 경우 예)1~5
	백스트레이트 : 1부터 시작하여 5까지 스트레이트
	마운틴 : 10에서 시작하여 1까지 스트레이트
*/	
	public static int straight(ArrayList<Card> list){
		
		Collections.sort(list, new Comparator<Card>(){	//받은 카드를 오름차순으로 정렬하는 컬렉션 프레임워크의 메서드
			@Override
			public int compare(Card c1, Card c2){	//객체 c1과 c2를 입력받아서
				return c1.getNum() - c2.getNum();	//오름차순으로 정렬
			}
		});
		
		boolean flag = false;	//1이 있는지 체크
		boolean isStraight = false;	
		for(int i=0; i<list.size()-3; i++){		//0번지부터 4번지까지 비교해서 
			int straightCnt = 1;		//straightCnt를 1로 선언
			int std = list.get(i).getNum();		//std에 list.get(i).getNum();의 값을 대입
			if(std == 1){	//std가 1이면
				flag = true;	//1이 있음을 알려준다
			}
			for(int j=0 ; j<list.size(); j++){	//0번지부터 마지막번지까지 비교
				if(std+straightCnt == (list.get(j).getNum())){	//다음 숫자가 현재 숫자의 +1이라면(스트레이트의 시작점이 현재 숫자라면)
					straightCnt++;	//straightCnt를 1개 증가시킨다
				}else if(std+straightCnt-1 == list.get(j).getNum()){	//다음 숫자가 현재 숫자와 같다면
					continue;	//아무것도 실행하지 않고 다음으로 넘어간다
				}else{		//조건문에 해당하는 사항이 없으면 
					break;	//증감연산을 실행하고 조건식을 판별한다
				}
			}
			if(straightCnt == 4 && std == 10 && flag){	//마운틴일 경우 : 10, J, Q, K, 1을 계산
				return 3;		//straightCnt가 4이고 스트레이트의 시작점이 숫자 10이고 카드팩에 1이 있을 경우 마운틴으로 판별하고 3을 반환한다
			}
			if(straightCnt >= 5 && std == 1){	//스트레이트의 시작점이 1이고 연속된 숫자가 개 이상이라면 백스트레이트로 판별하고 2를 반환한다
				return 2;
			}
			if(straightCnt >= 5){	//위의 조건식에 해당하지 않고 straightCnt가 5보다 크면 스트레이트를 반환한다
				isStraight = true;
			}
		}
		if(isStraight){	//일반 스트레이트일 경우 1을 반환한다
			return 1;
		}
		return 0;
	}
	public static String flush(ArrayList<Card> list){	//같은 모양이 5개 이상 있는지를 판별한 뒤 5개 이상 같은 모양을 객체에 저장해서 반환하는 메서드
	
	Collections.sort(list, new Comparator<Card>(){	//받은 카드를 오름차순으로 정렬하는 컬렉션 프레임워크
		@Override
		public int compare(Card c1, Card c2){		//Card클래스의 객체인 c1, c2의 getNum을 비교하여 오름차순으로 정렬
			return c1.getNum() - c2.getNum();
		}
	});
	
		String s = null; //객체 s을 선언한 뒤 null로 초기화
		for(int i=0; i<list.size(); i++){	//0번지부터 마지막번지까지 확인
			int flushCnt = 0;
			for(int j=0; j<list.size(); j++){	//0번지부터 마지막번지까지 비교해서
				if(list.get(i).getForm() == list.get(j).getForm()){	//list의 i번지의 모양과 list의 j번지의 모양이 같다면
					s = list.get(i).getForm();	//s에 list.i번지의 모양을 저장한 뒤
					flushCnt++;	//flushCnt를 하나 증가
				}
			}
			if(flushCnt == 5){	//flushCnt가 5라면
				return s;	//모양이 저장된 s를 반환한다
			}
		}
		return s = null;	//같은 모양이 5개 미만이라면 s에 null을 저장해서 반환한다
	}
	public static boolean fullHouse(ArrayList<Card> list){
		if(PockerRule.triple(list) == 2){
			return true;
		}else if(PockerRule.triple(list) == 1 && PockerRule.pare(list) >= 1){
			return true;
		}
		return false;
	}
	public static int straightFlush(ArrayList<Card> list){
		String s = PockerRule.flush(list);			//객체 s에 flush 메서드의 결과값인 문자를 저장
		if(s == null){
			return 0;
		}
		ArrayList<Card> list1 = new ArrayList<Card>(list);
		for(int j=list1.size()-1 ; j>=0 ; j--){		//삭제를 0번지부터 할 경우 0번지가 삭제된 뒤 1번지부터 비교하기 때문에 마지막 번지부터 비교하여 삭제한다 
			if(list1.get(j).getForm() != s){		
				list1.remove(j);
			}
		}
		return PockerRule.straight(list1);
	}
	public static boolean top(ArrayList<Card> list){
		if(PockerRule.sameCnt(list, 1) != 7){	//같은 숫자가 있는 경우
			return false;
		}
		if(PockerRule.straight(list) != 0){		//연속된 숫자가 5개 이상 있는 경우
			return false;
		}
		if(PockerRule.flush(list) != null){		//같은 모양이 5개 이상 있는 경우
			return false;
		}
		return true;
	}
	public static int result(ArrayList<Card> list){
		Collections.sort(list, new Comparator<Card>(){	//받은 카드를 오름차순으로 정렬
			@Override
			public int compare(Card c1, Card c2){
				return c1.getNum() - c2.getNum();
			}
		});
		
		if(PockerRule.straightFlush(list) == 3){
			return 11;
		}else if(PockerRule.straightFlush(list) == 2){
			return 10;
		}else if(PockerRule.straightFlush(list) == 1){
			return 9;
		}
		if(PockerRule.poker(list) == true){
			return 8;
		}
		if(PockerRule.fullHouse(list) == true){
			return 7;
		}
		if(PockerRule.straight(list) == 3){
			return 6;
		}else if(PockerRule.straight(list) ==2){
			return 5;
		}else if(PockerRule.straight(list) ==1){
			return 4;
		}
		if(PockerRule.sameCnt(list, 3) >= 1){
			return 3;
		}else if(PockerRule.sameCnt(list, 2) >= 2){
			return 2;
		}else if(PockerRule.sameCnt(list, 2) == 1){
			return 1;
		}else{
			return 0;
		}
	}
	public static int fight(ArrayList<Card> user, ArrayList<Card> dealer){
		int u1 = result(user);
		int u2 = result(dealer);
		if(u1 > u2){
			return 1;
		}else if(u1 < u2){
			return 2;
		}else{
			return 0;
		}
	
	}
	public static int sameScore(ArrayList<Card> user, ArrayList<Card> dealer){
		if(fight(user,dealer) == 0){
		}
		return 0;
	}
}

class CardPack{
	private ArrayList<Card> list = new ArrayList<Card>();
	
	public CardPack(){
		cardPackSetAll();
		shuffle();
	}
	
/*	기능 : 모양이 주어지면 해당 모양의 1번 카드부터 K 카드까지 팩에 추가
	매개변수 : 문자열 -> form
	리턴타입 : void
	메서드명 : cardPackSet
*/	
	private void cardPackSet(String form){
		for (int i=1; i<=13; i++){
			Card c = new Card();
			c.setNum(i);
			c.setForm(form);
			list.add(c);
		}
	}
	public void cardPackSetAll(){
		list.clear();
		cardPackSet("S");
		cardPackSet("C");
		cardPackSet("H");
		cardPackSet("D");
	}
	public void show(){
		for(int i=0; i<list.size(); i++){	//0번지부터 크기-1번지까지
			System.out.print(list.get(i) + " ");	//i번지의 값과 공백을 가로로 출력
			if((i+1) % 10 == 0){	//i+1이 10이면
				System.out.println();	//다음 줄로 이동
			}
		}
	}
	public void shuffle(){
		Collections.shuffle(list);	//컬렉션 프레임워크를 이용해 리스트를 섞는다
	}
	public Card give(){
		if(list.size() != 0){	//카드가 1장 이상이라면
			Card c = new Card(list.get(0));		//복사 생성자로 객체를 복사해서 c에 저장
			list.remove(0);	//리스트의 0번지를 삭제
			return c;	//c를 반환(list의 0번지 복사본)
		}else{	//카드가 0장이라면
			return null;	//null을 반환
		}	
	}
	
	
}


class Card{


	//예제)카드 클래스를 만들고 list에 모든 카드 (52장)를 넣고 섞는 코드를 작성
	public int num;
	public Form form = Form.C;
	
	
	public int getNum() {
		return num;
	}
	public String getForm() {
		switch (form){
		case H 	: return "♥";
		case C 	: return "♣";
		case D 	: return "◆";
		case S 	: return "♠";
		default : return "0";
		}
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setForm(String form) {
		switch(form){
		case "H" : this.form = Form.H;	break;
		case "S" : this.form = Form.S;	break;
		case "D" : this.form = Form.D;	break;
		case "C" : this.form = Form.C;	break;
		default : break;
		}
	}


	@Override
	public String toString() {
		String s = new String();
		s += getForm();
		if(num == 11){
			s += "J"; 
		}else if(num == 12){
			s += "Q";
		}else if(num == 13){
			s += "K";
		}else{
			s += num;
		}
		return s;
	}

	public Card(){
		
	}
	public Card(Card c){
		this.num = c.num;
		this.form = c.form;
	}
}

enum Form{
	H, S, D, C
}