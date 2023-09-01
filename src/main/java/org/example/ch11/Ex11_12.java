package org.example.ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * ch11. HashSet
 */
public class Ex11_12
{
	public static void main(String[] args)
	{
		Set set = new HashSet();
		
		for (int i = 0; set.size() <  6; i++)
		{
			int random = (int) (Math.random() * 45) + 1; // 1 ~ 45 사이의 난수
			set.add(random);
		}
		System.out.println("정렬 전 set = " + set);
		
		List list = new LinkedList(set); // set 은 정렬할 수 없다. (set은 순서 유지 안하기 때문) -> 따라서 List로 옮겨서 이용
		Collections.sort(list);
		System.out.println("정렬 후 list = " + list);
	}
}
