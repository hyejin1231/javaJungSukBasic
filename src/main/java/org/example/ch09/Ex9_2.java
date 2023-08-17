package org.example.ch09;

import java.util.Objects;

/**
 * ch09. Object 클래스와 equals()
 * eqauls() : 객체 자신 this와 주어진 객체 obj 를 비교하고 같으면 true, 다르면 false를 반환한다.
 */
class Person
{
	long id;
	
	public Person(long id)
	{
		this.id = id;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof Person)) {
			return false;
		}
		return id == ((Person) o).id;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(id);
	}
}

public class Ex9_2
{
	public static void main(String[] args)
	{
		Person person1 = new Person(123456678999L);
		Person person2 = new Person(123456678999L);
		
		if (person1.equals(person2)) {
			System.out.println("person1과 person2는 같은 사람입니다.");
		}else {
			System.out.println("person1과 person2는 다른 사람입니다.");
		}
	}
}
