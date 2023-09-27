package org.example.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * ch14. 스트림 만들기
 */
public class Ex14_8
{
	public static void main(String[] args)
	{
		// 컬렉션으로 부터 Stream 만들기
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> intStream = list.stream();
		
		intStream.forEach(System.out::print); // 1,2,3,4,5
//		intStream.forEach(System.out::println); // error, forEach는 최종 연산이므로 한 번 더 사용하면 에러난다.
		
		System.out.println();
		Stream<String> strStream = Stream.of("a", "b", "c");
		strStream.forEach(System.out::print);
		
		String[] strArr = { "a", "b", "c", "d" };
		Stream<String> stringStream = Arrays.stream(strArr);
		stringStream.forEach(System.out::print);
		
		
		// 기본형 스트림은 기본 스트림보다 count, sum 등 추가적 메서드도 제공
		System.out.println();
		int[] intArr = { 1, 2, 3, 4, 5 };
		IntStream intStream1 = Arrays.stream(intArr);
//		intStream1.forEach(System.out::print);
		System.out.println("intStream1.count() = " + intStream1.count()); // count() 도 최종 연산
		
		// 무한 스트림이기 때문에 limit 같은 걸로 잘라줘야 한다.
		System.out.println();
		IntStream randomStream = new Random().ints();
		randomStream.limit(5).forEach(System.out::println);
		
		System.out.println();
		IntStream randomStream2 = new Random().ints(5);
		randomStream2.forEach(System.out::println);
		
		// 람다식을 소스로 하는 스트림 생성 iterate(T seed, UnaryOperator f), generate(Supplier<T>)
		Stream<Integer> iterate = Stream.iterate(0, n -> n + 2);
		iterate.limit(10).forEach(System.out::println); // 무한 스트림이라 limit으로 변경해야함
		
		Stream<Integer> generate = Stream.generate(() -> 1);
		generate.limit(10).forEach(System.out::println); // 무한 스트림이라 limit으로 변경해야함
		
		
		// 비어있는 스트림 생성하기
		Stream<Object> emptyStream = Stream.empty();
		
	}
}
