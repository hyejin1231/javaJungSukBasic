package org.example.ch14;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * ch14. 스트림의 중간연산 (1)
 */
public class Ex14_9
{
	public static void main(String[] args)
	{
		Stream<Student> studentStream = Stream.of(
				new Student(1, "이자바", 200),
				new Student(3, "김자바", 200),
				new Student(2, "박자바", 300),
				new Student(1, "강자바", 150),
				new Student(2, "한자바", 200),
				new Student(3, "조자바", 250)
		);
		
		studentStream.sorted(Comparator.comparing(Student::getBan)
									 .thenComparing(Comparator.naturalOrder())).
				forEach(System.out::println);
				
		
	}
}

class Student implements Comparable<Student>
{
	int ban;
	
	String name;
	
	int totalScore;
	
	public Student(int ban, String name, int totalScore)
	{
		this.ban = ban;
		this.name = name;
		this.totalScore = totalScore;
	}
	
	@Override
	public String toString()
	{
		return "Student{" +
				"ban=" + ban +
				", name='" + name + '\'' +
				", totalScore=" + totalScore +
				'}';
	}
	
	public int compareTo(Student student)
	{
		return student.totalScore - this.totalScore;
	}
	
	public int getBan()
	{
		return ban;
	}
	
	public void setBan(int ban)
	{
		this.ban = ban;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getTotalScore()
	{
		return totalScore;
	}
	
	public void setTotalScore(int totalScore)
	{
		this.totalScore = totalScore;
	}
}
