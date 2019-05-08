package practice;

import java.util.*;

public class Grade_Example1 {


	
	
/*	
  
  	점수 클래스의 멤버 변수
	등급 : A+, A, B+, B, C+, C, D+, D, F, Pass
	담당 교수 : professor
	과목명 : title
	학점 : unit
	
	private GradeStep step;		//등급
	private String professor;	//교수명
	private String title;		//과목명
	private int unit;			//학점
	
	
	public String getStep() {	//열거형을 불러올 때 다른 타입의 값으로 출력하고 싶다면 getter의 리턴타입이 일치하지 않아도 된다
		switch(step){			
		case Ap 	: 	return 	"A+";	//해당 열거형을 선택했을 때 문자열로 변경해서 반환한다
		case A  	: 	return 	"A";
		case Bp 	: 	return 	"B+";
		case B  	: 	return	"B";
		case Cp 	: 	return	"C+";
		case C  	:	return	"C";
		case Dp	 	: 	return	"D+";
		case D 		: 	return 	"D";
		case Pass 	: 	return	"P";
		default		: 	return 	"F";
		}
	}
	public String getProfessor() {
		return professor;
	}
	public String getTitle() {
		return title;
	}
	public int getUnit() {
		return unit;
	}
	
	
	public void setStep(String step) {
		switch(step){										//step이 문자열로 주어지면 해당 열거형 상수로 변환한다
		case "A+"	: this.step = GradeStep.Ap;		break;
		case "A" 	: this.step = GradeStep.A; 		break;
		case "B+" 	: this.step = GradeStep.Bp;		break;
		case "B"  	: this.step = GradeStep.B; 	 	break;
		case "C+"	: this.step = GradeStep.Cp;		break;
		case "C" 	: this.step = GradeStep.C; 		break;
		case "D+"	: this.step = GradeStep.Dp;		break;
		case "D" 	: this.step = GradeStep.D;		break;
		case "P"  	: this.step = GradeStep.Pass;	break;
		case "Fail" : this.step = GradeStep.Fail;	break;
		default		: this.step = GradeStep.F;		break;
		}
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	
	public void init(String step, String professor, String title, int unit){	//생성자는 객체 생성시에만 사용할 수 있기 때문에 초기화하는 메서드를 따로 생성
		setStep(step);
		setProfessor(professor);
		setTitle(title);
		setUnit(unit);
	}
	
	
	
	public Grade(){
		
	}
	public Grade(Grade g){
		init(g.getStep(), g.professor, g.title, g.unit);
	}
	public Grade(String step, String professor, String title, int unit){
		init(step, professor, title, unit);
	}
	
	
	public double getPoint(){	//학점 계산을 위해 해당하는 열거형의 등급이 주어지면 점수로 변환
		switch(step){			
		case Ap : return 4.5;	
		case A  : return 4;
		case Bp : return 3.5;
		case B  : return 3;
		case Cp : return 2.;
		case C  : return 2;
		case Dp : return 1.5;
		case D  : return 1;
		case Pass : return 0;
		default : return 0;
		}
	}
	
	@Override
	public String toString() {
		return "강의	  /   강의명 = " + title + ", 담당 교수 = " + professor + ", 등급 = " + step + ", 학점 = " + unit;
	}
	
*/	
	
	
	
}
