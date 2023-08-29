package org.example.ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * ch11. Iterator, ListIterator, Enumeration
 */
public class Ex11_7
{
	public static void main(String[] args)
	{
		// Iterator
		List list = new ArrayList();
		// HashSet list = new HashSet(); // Set도 Collection의 자손이기 때문에 변경 가능 -> 그런다고 해서 밑에 코드들을 변경하지 않아도 된다.
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator iterator = list.iterator(); // 컬렉션에서 iterator를 호출해서 iterator를 구현한 객체를 얻어서 사용
		while (iterator.hasNext())
		{
			System.out.println("iterator.next() = " + iterator.next());
		}
		
		System.out.println();
		iterator = list.iterator(); // iterator는 일회용이라 한번 더 사용하려면 새로운 iterator를 생성해야 한다.
		while (iterator.hasNext())
		{
			System.out.println("iterator.next() = " + iterator.next());
		}
		
		Map map = new HashMap();
		
		Iterator iterator1 = map.entrySet().iterator();
		
		
	}
}
