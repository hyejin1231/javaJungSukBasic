package org.example.ch14;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * ch14. Predicate의 결합, CF와 함수형 인터페이스
 */
public class Ex14_4
{
	public static void main(String[] args)
	{
		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		
		Function<String, String> h = f.andThen(g);
		Function<Integer, Integer> h2 = f.compose(g);
		
		System.out.println("h.apply(\"FF\") = " + h.apply("FF")); // "FF" -> 255 -> "11111111"
		System.out.println("h2.apply(2) = " + h2.apply(2)); // 2 -> "10" -> 16
		
		Function<String, String> f2 = x -> x; // 항등 함수 identity function
		System.out.println("f2.apply(\"AAA\") = " + f2.apply("AAA")); // "AAA"
		
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0;
		Predicate<Integer> notP = p.negate(); // i >= 100;
		
		Predicate<Integer> all = notP.and(q.or(r)); // i >= 100 && ( i < 200 || i % 2 ==0 )
		System.out.println("all.test(150) = " + all.test(150)); // true
		
		String str = "abc";
		String str2 = "abc";
		
		// str과 str2 같은지 비교한 결과를 반환
		Predicate<Object> p2 = Predicate.isEqual(str);
		boolean result = p2.test(str2);
		System.out.println("result = " + result);
	}
}
