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
/*		- 우선 3장을 받고 한장을 공개한 후, 공개한 카드의 숫자가 더 큰
		사람에게 먼저 나눠준다.
		- 숫자가 동일한 경우 스페이스 > 다이아 > 하트 > 클로버순이다.
		- 다음 카드는 마지막에 받은 카드를 기준으로 다시 순서를 정한다.
*/

/*		포커규칙
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
		
		boolean s1 = false, s2 = false;		//straight가 나올 때까지 카드를 뽑고 실행 횟수를 알려주는 반복문
		int cnt = 0;
		while( !(s1 || s2)){
			CardPack cp = new CardPack();
			ArrayList<Card> user = new ArrayList<Card>();
			ArrayList<Card> dealer = new ArrayList<Card>();
			for(int i=1; i<=7; i++){
				user.add(cp.give());
				dealer.add(cp.give());
			}
			
			//System.out.println(PockerRule.pare(user));
			//s1 = PockerRule.straight(user) > 1;
			//s1 = PockerRule.flush(user) > 1;
			s1 = PockerRule.fullHouse(user);
			System.out.println(s1);
			System.out.println(user);

			//System.out.println(PockerRule.pare(dealer));
			//s2 = PockerRule.straight(dealer) > 1;
			//s2 = PockerRule.flush(dealer) > 1;
			s2 = PockerRule.fullHouse(dealer);
			System.out.println(s2);
			System.out.println(dealer);
			cnt++;
		}
		System.out.println(cnt);

	}

}

class PockerRule{
	
/*		기능 : 페어를 찾는 메서드
		매개변수 : 카드 리스트
		리턴타입 : 0 -> 페어 없음, 1 -> 원페어, 2 : 투페어(페어가 2개 이상)
		메서드명 : pare
*/	
	public static int pare(ArrayList<Card> list){
		int pareCnt = 0;	//페어의 개수
		for(int i=0; i<list.size(); i++){
			int cnt = 0;	//같은 숫자의 개수
			for(int j=0; j<list.size(); j++){
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt++;
				}
			}
			if(cnt == 2){
				pareCnt++;
			}
		}
		return pareCnt/2;	//이미 계산했던 번지도 한번 더 계산되기 때문에 2로 나눈다
	}
	public static int triple(ArrayList<Card> list){
		int tripleCnt = 0;
		for(int i=0; i<list.size(); i++){
			int cnt = 0;
			for(int j=0; j<list.size(); j++){
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt++;
				}
			}
			if(cnt == 3){
				tripleCnt++;
			}
		}		
		return tripleCnt/3;
	}
/*	스트레이트 : 연속된 숫자가 5장 이상인 경우 예)1~5
	백스트레이트 : 1부터 시작하여 5까지 스트레이트
	마운틴 : 10에서 시작하여 1까지 스트레이트
*/	
	public static int straight(ArrayList<Card> list){
		
		Collections.sort(list, new Comparator<Card>(){	//받은 카드를 오름차순으로 정렬
			@Override
			public int compare(Card c1, Card c2){
				return c1.getNum() - c2.getNum();
			}
		});
		
		boolean flag = false;	//1이 있는지 체크
		boolean isStraight = false;
		for(int i=0; i<list.size()-3; i++){
			int straightCnt = 1;
			int std = list.get(i).getNum();
			if(std == 1){
				flag = true;
			}
			for(int j=0 ; j<list.size(); j++){
				if(std+straightCnt == (list.get(j).getNum())){	//다음 숫자가 현재 숫자의 +1과 같다면(스트레이트의 시작점이 현재 숫자라면)
					straightCnt++;
				}else if(std+straightCnt-1 == list.get(j).getNum()){
					continue;
				}else{
					break;
				}
			}
			if(straightCnt == 4 && std == 10 && flag){	//마운틴일 경우 : 10, J, Q, K, 1을 계산
				return 3;
			}
			if(straightCnt >= 5 && std == 1){
				return 2;
			}
			if(straightCnt >= 5){
				isStraight = true;
			}
		}
		if(isStraight){
			return 1;
		}
		return 0;
	}
	public static int flush(ArrayList<Card> list){
		
		Collections.sort(list, new Comparator<Card>(){	//받은 카드를 오름차순으로 정렬
			@Override
			public int compare(Card c1, Card c2){		//Card클래스의 객체인 c1, c2의 getNum을 비교하여 오름차순으로 정렬
				return c1.getNum() - c2.getNum();
			}
		});
		
		for(int i=0; i<list.size(); i++){
			int flushCnt = 0;
			int straightFlushCnt = 1;
			for(int j=0; j<list.size(); j++){
				if(list.get(i).getForm() == list.get(j).getForm()){
					if(list.get(i).getNum()+straightFlushCnt == list.get(j).getNum()){
						straightFlushCnt++;
					}else{
						flushCnt++;
					}
				}
			}
			if(straightFlushCnt >= 5){
				return 2;
			}else if(flushCnt >= 5){
				return 1;
			}
		}
		return 0;
	}
	public static boolean fullHouse(ArrayList<Card> list){
		if(PockerRule.triple(list) == 2){
			return true;
		}else if(PockerRule.triple(list) == 1 && PockerRule.pare(list) >= 1){
			return true;
		}
		return false;
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
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + " ");
			if((i+1) % 10 == 0){
				System.out.println();
			}
		}
	}
	public void shuffle(){
		Collections.shuffle(list);
	}
	public Card give(){
		if(list.size() != 0){
			Card c = new Card(list.get(0));		//복사 생성자로 객체를 복사해서 c에 저장
			list.remove(0);
			return c;
		}else{
			return null;
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