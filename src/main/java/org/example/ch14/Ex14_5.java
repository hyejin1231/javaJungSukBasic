package org.example.ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * ch14. Predicate의 결합, CF와 함수형 인터페이스
 */
public class Ex14_5
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i< 10; i++)
		{
			list.add(i);
		}
		
		list.forEach(i -> System.out.print(i + ", "));
		System.out.println();
		
		list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
		System.out.println("list = " + list);
		
		list.replaceAll(i -> i * 10);
		System.out.println("list = " + list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		map.put("5", "5");
		
		map.forEach((k, v) -> System.out.print("{ " + k + ", " + v + " }, "));
		
	}
}
