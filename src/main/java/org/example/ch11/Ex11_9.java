package org.example.ch11;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ch11. Comparable과 Comparator
 */
public class Ex11_9
{
	public static void main(String[] args)
	{
		String[] str = { "cat", "Dog", "lion", "tiger" };
		
		Arrays.sort(str); // 문자열의 기본 정렬 순서 : 사전 순서
		System.out.println("Arrays.toString(str) = " + Arrays.toString(str));
		
		Arrays.sort(str, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 안함
		System.out.println("Arrays.toString(str) = " + Arrays.toString(str));
		
		Arrays.sort(str, new Descending()); // 역순 정렬
		System.out.println("Arrays.toString(str) = " + Arrays.toString(str));
		
	}
}

class Descending implements Comparator
{
	@Override
	public int compare(Object o1, Object o2)
	{
		if (o1 instanceof Comparable<?> && o2 instanceof Comparable<?>) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			
			return c1.compareTo(c2) * -1; // -1 를 곱해서 기본 정렬 방식에서 역으로 변경한다.
		}
		return -1;
	}
}