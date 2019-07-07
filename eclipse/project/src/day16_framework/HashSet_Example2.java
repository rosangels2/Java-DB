package day16_framework;

import java.util.HashSet;

public class HashSet_Example2 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("abc");						//String 클래스는 문자열을 상수로 만들고 새 주소에 저장한 뒤 복사해서 가져오기 때문에 같은 문자열을 같은 값으로 정의한다(Overriding X)
		set.add("abc");						//String을 제외한 다른 클래스에서는 Object클래스의 메서드를 Overriding을 해야 String과 같은 기능을 가질 수 있다
		
		set.add(new Person("David",10));	//HashSet은 equals의 Overriding이 돼있지 않기 떄문에 Object 클래스의 equals를 호출한다(주소를 기준으로 비교)
		set.add(new Person("David",10));	
		
/*		동일한 값을 가지는 Person 클래스의 객체를 여러개 만들어서 추가하면 Person 클래스에 오버라이딩된 equals()와 HashCode()를 찾고
		없으면 Object클래스의 equals와 HashCode()를 찾아 사용한다
		이떄 Object클래스의 equals()는 주소값이 같아야 같은 객체로 판별하므로 
		Object클래스의 equals와 HashCode를 오버라이딩하지 않으면 
		값이 같은 두 객체라도 주소가 다르기 때문에 다른 객체로 판별해서 Set에 각자 저장해서 중복될 수가 있다
*/		
		System.out.println(set);
	}

}

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return name + " : " + age;	//객체를 호출하면 toString이 자동으로 호출된다
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}