package org.example.ch11;

import java.util.ArrayList;

/**
 * ch11. Arraylist
 */
public class Ex11_2
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		for (int i = 0; i< 5; i++)
		{
			list.add(i);
		}
		
		System.out.println("list = " + list);
		
		// Arraylist에 저장된 첫번째 객체부터 삭제하는 경우 (배열 복사 발생..!)
		for (int i = 0; i< list.size(); i++)
		{
			System.out.println("i = " + i);
			list.remove(i);
		}
		System.out.println("list = " + list); // 배열 복사가 일어나서 성능 상 안좋고 다 지워지지도 않는다.
		
		ArrayList list1 = new ArrayList();
		for (int i = 0; i< 5; i++)
		{
			list1.add(i);
		}
		
		System.out.println("list1 = " + list1);
		
		// Arraylist에 저장된 마지막 객체부터 삭제하는 경우 (배열 복사 발생 안함!!)
		for (int i =  list1.size()-1; i >= 0; i--)
		{
			list1.remove(i);
		}
		
		System.out.println("list1 = " + list1); // 빠르고 배열 복사 발생 안함
		
	}
}
