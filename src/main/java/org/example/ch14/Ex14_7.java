package org.example.ch14;

import java.util.stream.Stream;

/**
 * ch14. 스트림, 스트림의 특징
 * 스트림 : 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
 * 중간 연산과 최종 연산이 있다.
 */
public class Ex14_7
{
	public static void main(String[] args)
	{
		String[] strArr = { "aa", "bb", "cc", "dd", "aa" };
		
		Stream<String> stringStream = Stream.of(strArr);
		stringStream.distinct().limit(3).sorted().forEach(System.out::println);
		
	}
}
