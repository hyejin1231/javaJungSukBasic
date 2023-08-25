package org.example.ch11;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ch11. ArrayList
 * : Arraylist는 기존의 Vector를 개선한 것으로 구현 원리와 기능적으로 동일하다.
 * (Vector는 동기화 한다. Arraylist는 동기화 x)
 * List 인터페이스를 구현했기 때문에 저장 순서를 유지하고, 중복을 허용한다.
 * 데이터의 저장공간으로 배열을 사용한다 . (배열 기반)
 */
public class Ex11_1
{
	public static void main(String[] args)
	{
		// Arraylist는 객체만 저장 가능하다.
		ArrayList list = new ArrayList();
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(3); // 컴파일러가 new Integer(3) 으로 오토박싱 해준다.(기본형 -> 참조형으로 자동변환 해준다.)
		list.add(1);
		
		ArrayList list1 = new ArrayList(list.subList(0,2)); // subList는 읽기전용 Arraylist이므로 생성자에 이 리스트를 넣어서 쓰기도 가능하도록 만들어야 한다.
		System.out.println("list = " + list);
		System.out.println("list1 = " + list1);
		
		// Collection 은 인터페이스, Collections 는 유틸 클래스
		Collections.sort(list);
		Collections.sort(list1);
		System.out.println();
		System.out.println("list = " + list);
		System.out.println("list1 = " + list1);
		
		System.out.println();
		System.out.println("list.containsAll(list1) = " + list.containsAll(list1));
		
		System.out.println();
		list1.add("A");
		list1.add("C");
		System.out.println("list1 = " + list1);
		list1.add(3, "B");
		System.out.println("list1 = " + list1);
		
		list1.set(3, "BB");
		System.out.println("list1 = " + list1);
		
		System.out.println();
		System.out.println("list = " + list);
		list.add(0, "1");
		System.out.println("list = " + list);
		System.out.println("list.indexOf(\"1\") = " + list.indexOf("1")); // 문자열 1의 위치
		System.out.println("list.indexOf(1) = " + list.indexOf(1)); // 숫자 1의 위치
		
		System.out.println();
		System.out.println("list = " + list);
		list.remove(0); // 0번째 위치 삭제
		System.out.println("list = " + list);
		list.remove(new Integer(2)); // 숫자 2인 값 삭제
		System.out.println("list = " + list);
		
		System.out.println();
		System.out.println("list = " + list);
		System.out.println("list1 = " + list1);
		System.out.println("list.retainAll(list1) = " + list.retainAll(list1));
		System.out.println("list = " + list);
		System.out.println("list1 = " + list1);
	}
}
