package practice;

import java.util.*;

public class practice4 {

	public static void main(String[] args) {
		
/*		Card c = new Card();
		c.setForm("C");
		c.setNum(5);
		System.out.println(c);
*/	
		
		CardPack cp = new CardPack();
		cp.shuffle();
		cp.show();
		System.out.println();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.give();
		cp.show();
	
	
	
	
	}

}


class CardPack{
	private ArrayList<Card> list = new ArrayList<Card>();
	
	public CardPack(){
		cardPackSetAll();
	}
	
/*	기능 : 모양이 주어지면 해당 모양의 1번 카드부터 K 카드까지 팩에 추가
	매개변수 : 
	리턴타입 : 
	메서드명 : 
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
		}else{
			return null;
		}
		return null;
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