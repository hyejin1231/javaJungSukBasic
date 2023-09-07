package org.example.ch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Iterator, HashMap과 지네릭스
 */
public class Ex12_4
{
	public static void main(String[] args)
	{
		
		// Iterator
		ArrayList<Student> list = new ArrayList<>(); // jdk 1.7부터 생성자에 타입 지정 생략 가능
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바짱", 1, 2));
		list.add(new Student("홍길동", 2, 1));
		
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext())
		{
//			System.out.println("name = " +((Student)(iterator.next())).name); // 지네릭스를 사용하면 형변환 필요 없음 !
			System.out.println("name = " + iterator.next().name); // 지네릭스를 사용하면 형변환 필요 없음 !
		}
		
		// HashMap
		HashMap<String, Student> map = new HashMap<>();
		map.put("자바왕", new Student("자바왕", 1, 1));
		
		Student student = map.get("자바왕"); // 형변환 생략 가능
		System.out.println("student = " + student);
		
	}
	
}

class Student
{
	String name = "";
	int ban;
	
	int no;
	
	int kor;
	int eng;
	int maht;
	
	public Student(String name, int ban, int no)
	{
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int maht)
	{
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.maht = maht;
	}
	
	@Override
	public String toString()
	{
		return "Student{" +
				"name='" + name + '\'' +
				", ban=" + ban +
				", no=" + no +
				", kor=" + kor +
				", eng=" + eng +
				", maht=" + maht +
				'}';
	}
}