package ex05.collection.set;

import java.util.*;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		
		if( obj instanceof Person ) {
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age ;
		}
		
		return false;
	}
} // person end

public class HashSetEx3 {
	public static void main(String[] args) {
		Set  set = new HashSet();
		
		//Person ps = new Person("aaa", 55);	
		//set.add(ps);
		set.add(new String("happy"));
		set.add(new String("happy"));
		set.add(new String("virus"));
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		set.add(new Person("doyeon", 33));
		
		System.out.println(set);
	}
}




