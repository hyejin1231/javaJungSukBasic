package org.example.ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * ch11. Stack과 Queue
 * Stack : LIFO (Last In First Out), 맨 마지막에 저장된 객체가 제일 처음 꺼내진다. Arraylist 배열 구현이 유리 ex. 밑이 막힌 상자
 * Queue : FIFO (first In First Out), 맨 처음 저장된 객체가 제일 처음 꺼내진다. LinkedList 배열 구현이 유리 ex. 줄서기
 */
public class Ex11_3
{
	public static void main(String[] args)
	{
		// Stack
		Stack stack = new Stack();
		
		// empty : Stack이 비어있는지 알려준다.
		System.out.println("stack.empty() = " + stack.empty());
		
		// push : Stack에 객체를 저장한다.
		for (int i = 0; i< 5; i++)
		{
			stack.push(i);
		}
		
		// peek : stack의 맨 위에 저장된 객체를 반환한다. pop과 다르게 Stack에서 객체를 꺼내지는 않음
		System.out.println("stack.peek() = " + stack.peek());
		
		// pop : Stack의 맨 위에 저장된 객체를 반환한다.
		System.out.println("stack.pop() = " + stack.pop());
		System.out.println("stack.peek() = " + stack.peek());
		
		// search : Stack에서 주어진 객체를 찾아서 그 위치를 반환. 못찾으면 -1 반환 (0이 아닌 1부터 시작함)
		
		System.out.println();
		
		// Queue
		// Queue는 인터페이스라서 구현한 클래스를 사용하거나 또는 직접 구현해야 한다.
		Queue queue = new LinkedList();
		
		// add : Queue에 지정된 객체를 추가한다. 저장 공간이 부족하면 IlligalStateException 발생
		queue.add(1);
		queue.add(2);
		
		// remove : Queue에 객체럴 꺼내 반환, 비어있으면 NPE 발생
		System.out.println("queue.remove() = " + queue.remove());
		
		// element : 삭제없이 요소를 읽어온다.
		System.out.println("queue.element() = " + queue.element());
		
		// offer : Queue에 객체를 저장, 성공하면 true, 실패하면 false 반환
		queue.offer(3);
		
		// poll : Queue에 객체를 꺼내서 반환, 이때 비어 있으면 null 반환
		System.out.println("queue.poll() = " + queue.poll());
		
		// peek : 삭제없이 요소를 읽어온다. 비어있으면 null 반환
		System.out.println("queue.peek() = " + queue.peek());
	}
}
