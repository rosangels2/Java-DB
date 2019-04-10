package day12;

public class Student {
								//String은 선언과 동시에 객체를 생성 가능(생성자 new를 생략 가능)
		private String name;	//학생 이름
		private int grade;		//학생 학년
		private int classNum;	//학생 반
		private int num;		//학생 번호
		private double kor;		//public으로 접근제한자를 설정할 경우 원하지 않는 결과도 문법적 이상이 없으면 입력이 되기 때문에 private로 설정하고 getter, setter를 이용
		private double eng;
		private double math;

/*	생성자	
	 - 객체를 만들 때 멤버변수를 초기화하고 싶을 때 호출
	 - 객체를 만들 때 new 연산자(객체를 생성하는 연산자)를 호출한 시점에 멤버변수를 초기화하고 싶을 때 생성자를 구현해 준다
	 - 생성자를 하나도 구현하지 않았을 경우 기본 생성자가 자동으로 생성된다
	   -> 생성자가 하나라도 구현되어 있으면 기본 생성자가 자동으로 만들어지지 않는다
	      ->기본생성자는 필수가 아니므로 다른 생성자를 구현한 후 필요에 따라 추가로 구현하지 않아도 된다
	        ex)Scanner scan = New Scanner();를 입력시 멤버변수를 선택하라는 경고가 뜬다 (Scanner는 기본생성자를 구현하지 않았다)
*/	
		
		public String getName() {
			return name;
		}
		public int getGrade() {
			return grade;
		}
		public int getClassNum() {
			return classNum;
		}
		public int getNum() {
			return num;
		}
		public double getKor() {
			return kor;
		}
		public double getEng() {
			return eng;
		}
		public double getMath() {
			return math;
		}
		
		
		
		public void setName(String name) {
			if(name.length()<=5)
				this.name = name;	//매개변수 이름과 멤버변수 이름이 같을 때 구분하기 위해 this.로 멤버변수를 구분(this = 현재 클래스)
		}							//name = name;으로 입력할 경우 우선 순위가 매개변수, 지역변수 > 멤버변수이기 때문에 둘다 매개변수로 호출된다
									// . : 멤버 변수나 멤버 메서드를 호출하는 연산자 (불러오기 기능)로 클래스나 객체명 다음에 온다 - 멤버메서드 안에서 사용 가능
		
		public void setGrade(int grade) {
			this.grade = grade;
		}
		public void setClassNum(int classNum) {
			this.classNum = classNum;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public void setKor(double kor) {
			if(kor>=0 && kor<=100)	//범위를 설정해 그 외의 값은 입력되지 않게 한다(필터)
				this.kor = kor;
		}
		public void setEng(double eng) {
			if(kor>=0 && kor<=100)
				this.eng = eng;
		}
		public void setMath(double math) {
			if(kor>=0 && kor<=100)
				this.math = math;
		}
		
		public Student(){	//기본 생성자를 init()으로 지정
			init();
		}
		public Student(String name, int grade, int classNum, int num, double kor, double eng, double math){
			init(name, grade, classNum, num, kor, eng, math);
		}
		public Student(Student s){
			init(s.name, s.grade, s.classNum, s.num, s.kor, s.eng, s.math);
		}
		
		public void init(){			//멤버변수를 초기화하는 메서드 - 객체를 생성한 뒤에도 초기화할 수 있게 메서드로 생성 -> 기본값으로 초기화할 거면 작성하지 않아도 된다
			init("",1,1,1,0,0,0);	//메서드 오버로딩을 통해 init을 호출
		}
		public void init(String name, int grade, int classNum, int num, double kor, double eng, double math){
			this.setName(name);
			this.setGrade(grade);
			this.setClassNum(classNum);
			this.setNum(num);
			this.setKor(kor);
			this.setEng(eng);
			this.setMath(math);
		}
		
		@Override
		public String toString() {
			return "Student [이름 : " + name + ", 학년 : " + grade + ", 반 : " + classNum + ", 번호 : " + num + ", 국어 성적 : " + kor
					+ ", 영어 성적 : " + eng + ", 수학 성적 : " + math + "]";
		}
		

	
}
