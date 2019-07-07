package day18_class_university;

import java.util.*;

public class StudentManager {
	
	//학생 정보를 입력받아 추가, 수정, 삭제, 출력하는 기능을 가진 클래스
	//학생 정보를 효율적으로 입력하기 위해 중복을 허용하지 않는 Set을 통해 객체를 생성
	Set<Student> list = new HashSet<Student>();
	
/*	기능 : 학생 정보를 입력받아 list와 중복되지 않으면 추가하고, 중복되면 실패했음을 알려주는 기능
	매개변수 : 학생 정보 -> Student s
	리턴타입 : boolean
	메서드명 : insert
*/	
	public boolean insert(Student s){
		Student tmp = new Student(s);	//새 객체를 생성해서 복사한 뒤 list에 저장해야 주소가 공유되지 않는다
		return list.add(tmp);
	}
	
	
	
/*	기능 : 학생 정보를 입력받아 list와 중복되면 true, 중복되지 않으면 false를 반환하는 기능
	매개변수 : 학생 정보 -> Student s
	리턴타입 : boolean
	메서드명 : search
*/		
	public Student search(Student s){
		if(list.contains(s)){
			return s;
		}
		else 	return null;
	}
	
/*	기능 : 학생 정보를 입력받아 list와 중복되면 해당 정보를 list에서 삭제하고, 중복되지 않으면 실패했음을 알려주는 기능
	매개변수 : 학생 정보 -> Student s
	리턴타입 : boolean
	메서드명 : delete
*/		
	public boolean delete(Student s){
		Student tmp = search(s);
		if(tmp == null){
			return false;
		}
		list.remove(tmp);
		return true;
	}
	
	
/*	기능 : 학생 정보를 입력받아 list와 중복되면 해당 정보를 수정하고, 중복되지 않으면 실패했음을 알려주는 기능
	매개변수 : 학생 정보 -> Student s
	리턴타입 : boolean
	메서드명 : update
*/	
	public boolean update(Student s){
		if(!delete(s)){
		return false;
		}
		return insert(s);
	}
	
/*	기능 : 학생 정보 전체를 출력하는 기능
	매개변수 : 불필요
	리턴타입 : 없다 -> void
	메서드명 : print
*/	
	public void print(){
		System.out.println(list);
	}
	
	//메뉴를 출력하는 기능
	public void printMenu(){
		System.out.println(" - - - - - 메뉴 - - - - -");
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 학생 정보 수정");
		System.out.println("3. 학생 정보 삭제");
		System.out.println("4. 학생 정보 출력");
		System.out.println("5. 종료");
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("메뉴를 입력해주세요 : ");
	}
	
	
/*	기능 : Id를 콘솔에서 입력받아 list에 저장하는 기능
	매개변수 : Scanner scan
	리턴타입 : void
	메서드명 : insertId
*/	
	public Student inputId(Scanner scan){
		System.out.println("정보를 입력하세요.");
		System.out.println("학번 : ");
		String id = scan.next().trim();
		Student tmp = new Student();
		tmp.setId(id);
		return tmp;
	}
	
	
/*	기능 : 학생 정보를 콘솔에서 입력받아 list에 저장하는 기능
	매개변수 : Scanner scan
	리턴타입 : void
	메서드명 : insertStudent
*/	
	public Student inputStudent(Scanner scan){
		Student tmp = inputId(scan);
		System.out.println("이름 : ");
		String name = scan.next().trim();
		System.out.println("학교명 : ");
		String sName = scan.next().trim();
		System.out.println("전공 : ");
		String major = scan.next().trim();
		System.out.println("학점 : ");
		double average = scan.nextDouble();
		tmp.setName(name);
		tmp.setsName(sName);
		tmp.setMajor(major);
		tmp.setAverage(average);
		return tmp;
	}
}
