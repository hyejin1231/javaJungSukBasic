package org.example.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * ch14. java.util.Function 패키지
 */
public class Ex14_3
{
	public static void main(String[] args)
	{
		Supplier<Integer> s = () -> (int) (Math.random()*100) +1;
		Consumer<Integer> c = (i) -> System.out.print(i + ", ");
		Predicate<Integer> p = i -> i % 2 == 0;
		Function<Integer, Integer> f = i -> i/10 * 10;
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list); // list를 random값으로 채운다.
		System.out.println("list = " + list);
		
		printEvenNum(p, c, list); // 짝수를 출력
		
		List<Integer> newList = doSomething(f, list); //
		System.out.println("newList = " + newList);
	}
	
	private static <T> List<T> doSomething(Function<T, T> f, List<T> list)
	{
		List<T> newList = new ArrayList<>(list.size());
		
		for (T t : list)
		{
			newList.add(f.apply(t)); // 일의 자리를 없애서 새로운 list에 저장
		}
		return newList;
	}
	
	private static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list)
	{
		System.out.print("[");
		for (T t : list)
		{
			if (p.test(t)) { // 짝수인지 검사
				c.accept(t);
			}
		}
		System.out.println("]");
	}
	
	private static <T> void makeRandomList(Supplier<T> s, List<T> list)
	{
		for (int i = 0; i< 10; i++)
		{
			list.add(s.get());
		}
	}
}
