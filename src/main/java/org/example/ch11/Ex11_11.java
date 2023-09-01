package org.example.ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ch11. HashSet
 * : 순서 x, 중복 x
 * Set 인터페이스를 구현한 대표적 컬렉션 클래스
 */
public class Ex11_11
{
	public static void main(String[] args)
	{
		Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
		Set set = new HashSet();
		
		for (Object o : objArr)
		{
			System.out.println(o + " : " + set.add(o));
			set.add(o); // HashSet에 objArr 요소들을 저장한다.
		}
		
		System.out.println("set = " + set); // HashSet에 저장된 요소들을 출력한다.
		
		Iterator iterator = set.iterator(); // iterator를 이용해서 HashSet에 저장된 요소들을 출력한다.
		
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
