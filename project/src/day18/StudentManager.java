package day18;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StudentManager {
	
	//학생 정보를 입력, 검색, 수정, 삭제, 출력하는 클래스
	//학생 정보를 저장할 객체 생성 -> 중복을 허용하지 않는 Set
	Set<Student> student = new HashSet<Student>();
	
	
	//학생 정보를 입력하는 메서드
	public void insert(Student s){
		if(student.contains(s)){
			System.out.println("이미 존재하는 학번입니다");
		}else{
			student.add(s);
		}
	}
	
	
	
	//Student.equals(s)가 ture라면 Student를 수정하는 메서드
	public void modify(Student s){
		if(student.contains(s)){
			
			
		}else{
			System.out.println("존재하지 않는 학번입니다");
		}	
	}
	
	//set.equals(s)가 ture라면 set를 삭제하는 메서드
	public void delete(Student s){
		if(student.contains(s)){
			remove(student.contains(s));
		}else{
			System.out.println("존재하지 않는 학번입니다");
		}	
	}
	
	private void remove(boolean equals) {
		
	}



	//학생 정보를 출력하는 메서드
	public void print(){
		System.out.println(student);
	}
	public void printStudent(Student s){
		if(student.contains(s)){
			
		}
	}
	
}
